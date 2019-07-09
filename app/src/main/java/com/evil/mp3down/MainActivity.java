package com.evil.mp3down;

import android.Manifest;
import android.app.DownloadManager;
import android.app.Notification;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.app.filepicker.model.EssFile;
import com.app.filepicker.util.Const;
import com.app.filepicker.util.LogUtils;
import com.evil.ioslibs.DialogCancelListener;
import com.evil.ioslibs.IDialogListener;
import com.evil.ioslibs.InputDialog;
import com.evil.ioslibs.InputResultListener;
import com.evil.ioslibs.IosDialog;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.liulishuo.filedownloader.BaseDownloadTask;
import com.liulishuo.filedownloader.FileDownloadSampleListener;
import com.liulishuo.filedownloader.FileDownloader;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.footer.ClassicsFooter;
import com.scwang.smartrefresh.layout.header.ClassicsHeader;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.io.File;
import java.util.ArrayList;

import static com.evil.mp3down.Constant.INPUT_HINT;

public class MainActivity extends AppCompatActivity
        implements OnRefreshListener, OnLoadMoreListener
{
    private String keyworld;
    private int mPage = 1;
    private static final int REQUEST_CODE_CHOOSE = 0x334;
    private InputDialog mInputDialog;
    private MyAdapter mAdapter;
    private SmartRefreshLayout mSmartRefreshLayout;
    private MyHandler mHandler;
    private InputResultListener mIDialogListener = new InputResultListener() {
        @Override
        public void onResult(String s) {
            if (!TextUtils.isEmpty(s)) {
                keyworld = s;
                RetrofitUtils.search(1, s, new OnSearchResultListener());
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FileDownloader.setup(this);
        setContentView(R.layout.activity_main);
        mHandler = new MyHandler();
        Toolbar toolbar = findViewById(R.id.toolbar);
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        mSmartRefreshLayout = findViewById(R.id.smart_refresh_layout);
        mSmartRefreshLayout.setOnRefreshListener(this);
        mSmartRefreshLayout.setOnLoadMoreListener(this);
        mSmartRefreshLayout.setRefreshHeader(new ClassicsHeader(getContext()));
        mSmartRefreshLayout.setRefreshFooter(new ClassicsFooter(getContext()));
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(),
                                                                 DividerItemDecoration.VERTICAL
        ));
        mAdapter = new MyAdapter();
        mAdapter.setHandler(mHandler);
        recyclerView.setAdapter(mAdapter);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton)findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInputDialog == null) {
                    mInputDialog = new InputDialog(getContext()).setInputHint(INPUT_HINT)
                                                                .setInputMaxLenght(30)
                                                                .setInputHintColor(getResources()
                                                                        .getColor(
                                                                                R.color.buttonBackground8DB5F8))
                                                                .setInputTextColor(getResources()
                                                                        .getColor(
                                                                                R.color.contentTextColor131C));
                    mInputDialog.setInputResultListener(mIDialogListener);
                }
                mInputDialog.builder().show();
            }
        });
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (ContextCompat.checkSelfPermission(getContext(),
                                                  Manifest.permission.WRITE_EXTERNAL_STORAGE
            ) !=
                PackageManager.PERMISSION_GRANTED)
            {
                requestPermissions(new String[]{
                        Manifest.permission.WRITE_EXTERNAL_STORAGE,
                        Manifest.permission.READ_EXTERNAL_STORAGE
                },0x123);
            }
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 0x731);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mHandler = null;
    }


    public Context getContext() {
        return this;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            startActivity(new Intent(this, SettingActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void toastOfSafe(final String msg) {
        Message obtain = Message.obtain();
        obtain.what = 0;
        obtain.obj = msg;
        mHandler.sendMessage(obtain);
    }

    public void toast(final String msg) {
        Toast.makeText(MainActivity.this,msg,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onRefresh(@NonNull RefreshLayout refreshLayout) {
        if (TextUtils.isEmpty(keyworld)) {
            toast("请输入搜索结果");
            refreshLayout.finishRefresh(500);
            return;
        }
        RetrofitUtils.search(1, keyworld, new OnSearchResultListener());
    }

    @Override
    public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
        if (TextUtils.isEmpty(keyworld)) {
            toast("请输入搜索结果");
            refreshLayout.finishLoadMore(500);
            return;
        }
        RetrofitUtils.search(mPage + 1, keyworld, new OnSearchResultListener());
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode != RESULT_OK) {
            return;
        }
        if (requestCode == REQUEST_CODE_CHOOSE) {
            ArrayList<EssFile> essFileList = data.getParcelableArrayListExtra(
                    Const.EXTRA_RESULT_SELECTION);
            for (EssFile file : essFileList) {
                LogUtils.error(file.getAbsolutePath());
            }
        }
    }

    private void notification(String fileName, String tip) {
        new NotificationUtils(getApplicationContext()).setTicker("Mp3下载").setSound(
                android.provider.Settings.System.DEFAULT_NOTIFICATION_URI).setPriority(
                Notification.PRIORITY_DEFAULT).sendNotification(fileName.hashCode() % 100, tip,
                fileName + tip, R.drawable.ic_music_note_blue_400_24dp);
    }

    private class MyHandler extends Handler {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 0:
                    toast(((String)msg.obj));
                    break;
                case 1:
                    SearchInfo info = (SearchInfo) msg.obj;
                    DataBean data = info.getData();
                    int total = data.getTotal();
                    setTitle(keyworld + ":共" + total + "条");
                    mAdapter.setSearchInfos(info);
                    mSmartRefreshLayout.finishRefresh();
                    break;
                case 2:
                    mAdapter.addSearchInfos(((SearchInfo)msg.obj));
                    mSmartRefreshLayout.finishLoadMore();
                    break;
                case 3:
                    final UrlInfo down = (UrlInfo)msg.obj;
                    String message = "是否下载" + down.getFileName() + " 大小为" + Formatter.formatFileSize(getContext(),down.getFileSize());
                    new IosDialog(getContext()).setTitle("下载")
                                               .setMessage(message)
                                               .setLeftButton("确认",new IDialogListener() {
                                                   @Override
                                                   public void onClick(DialogInterface dialogInterface) {
                                                       String fileName = down.getFileName() + "." +
                                                                         down.getExtName();
                                                       if (Setting.getInstance().isSystemDown()) {
                                                           //创建下载任务,downloadUrl就是下载链接
                                                           DownloadManager.Request request =
                                                                   new DownloadManager.Request(
                                                                           Uri.parse(
                                                                                   down.getUrl()));
                                                           //指定下载路径和下载文件名
                                                           request.setDestinationInExternalPublicDir(
                                                                   "/download/", fileName);
                                                           //获取下载管理器
                                                           DownloadManager downloadManager =
                                                                   (DownloadManager) getSystemService(
                                                                           Context.DOWNLOAD_SERVICE);
                                                           //将下载任务加入下载队列，否则不会进行下载
                                                           downloadManager.enqueue(request);
                                                       } else {
                                                           File downFile;
                                                           if (TextUtils.isEmpty(
                                                                   Setting.getInstance()
                                                                          .getDownPath()))
                                                           {
                                                               downFile = new File(Environment
                                                                       .getExternalStoragePublicDirectory(
                                                                               Environment.DIRECTORY_DOWNLOADS),
                                                                       fileName);
                                                           } else {
                                                               downFile = new File(
                                                                       Setting.getInstance()
                                                                              .getDownPath(),
                                                                       fileName);
                                                           }
                                                           FileDownloader.getImpl().create(
                                                                   down.getUrl()).setPath(
                                                                   downFile.getAbsolutePath())
                                                                         .setListener(
                                                                                 new FileDownloadSampleListener() {
                                                                                     @Override
                                                                                     protected void pending(
                                                                                             BaseDownloadTask task,
                                                                                             int soFarBytes,
                                                                                             int totalBytes)
                                                                                     {
                                                                                         notification(
                                                                                                 down.getFileName(),
                                                                                                 "正在下载");
                                                                                     }

                                                                                     @Override
                                                                                     protected void completed(
                                                                                             BaseDownloadTask task)
                                                                                     {
                                                                                         notification(
                                                                                                 down.getFileName(),
                                                                                                 "下载成功");
                                                                                     }

                                                                                     @Override
                                                                                     protected void error(
                                                                                             BaseDownloadTask task,
                                                                                             Throwable e)
                                                                                     {
                                                                                         notification(
                                                                                                 down.getFileName(),
                                                                                                 "下载失败");
                                                                                     }
                                                                                 }).start();
                                                       }
                                                   }
                                               })
                                               .setRightButton("取消",new DialogCancelListener())
                                               .show();
                    break;
            }
        }
    }

    private class OnSearchResultListener implements OnResultListener {
        @Override
        public void seccess(boolean isRefresh, String json) {
            SearchInfo searchInfo = GsonUtils.get(json, SearchInfo.class);
            if (isRefresh) {
                mPage = 1;
                Message obtain = Message.obtain();
                obtain.what = 1;
                obtain.obj = searchInfo;
                mHandler.sendMessage(obtain);
            } else {
                mPage++;
                Message obtain = Message.obtain();
                obtain.what = 2;
                obtain.obj = searchInfo;
                mHandler.sendMessage(obtain);
            }
        }

        @Override
        public void error(String message) {
            toastOfSafe(message);
        }
    }

}
