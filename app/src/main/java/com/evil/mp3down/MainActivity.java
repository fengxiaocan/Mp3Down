package com.evil.mp3down;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.evil.ioslibs.DialogCancelListener;
import com.evil.ioslibs.IDialogListener;
import com.evil.ioslibs.InputDialog;
import com.evil.ioslibs.InputResultListener;
import com.evil.ioslibs.IosDialog;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.footer.ClassicsFooter;
import com.scwang.smartrefresh.layout.header.ClassicsHeader;
import com.scwang.smartrefresh.layout.header.FalsifyHeader;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import static com.evil.mp3down.Constant.INPUT_HINT;

public class MainActivity extends AppCompatActivity
        implements OnRefreshListener, OnLoadMoreListener
{
    private String keyworld;
    private int mPage = 1;
    private InputResultListener mIDialogListener = new InputResultListener() {
        @Override
        public void onResult(String s) {
            if (!TextUtils.isEmpty(s)) {
                keyworld = s;
                RetrofigUtils.search(1,s,new OnSearchResultListener(true));
            }
        }
    };
    private InputDialog mInputDialog;
    private MyAdapter mAdapter;
    private SmartRefreshLayout mSmartRefreshLayout;
    private MyHandler mHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHandler = new MyHandler();
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        mSmartRefreshLayout = (SmartRefreshLayout)findViewById(R.id.smart_refresh_layout);
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
                mInputDialog = new InputDialog(getContext()).setInputHint(INPUT_HINT)
                                                            .setInputMaxLenght(30)
                                                            .setInputHintColor(getResources().getColor(
                                                                    R.color.buttonBackground8DB5F8))
                                                            .setInputTextColor(getResources().getColor(
                                                                    R.color.contentTextColor131C));
                mInputDialog.setInputResultListener(mIDialogListener);
                mInputDialog.getInput().setText("");
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
        RetrofigUtils.search(1,keyworld,new OnSearchResultListener(true));
    }

    @Override
    public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
        if (TextUtils.isEmpty(keyworld)) {
            toast("请输入搜索结果");
            refreshLayout.finishLoadMore(500);
            return;
        }
        RetrofigUtils.search(mPage,keyworld,new OnSearchResultListener(false));
    }

    private class MyHandler extends Handler {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 0:
                    toast(((String)msg.obj));
                    break;
                case 1:
                    mAdapter.setSearchInfos(((SearchInfo)msg.obj));
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
                                                       //创建下载任务,downloadUrl就是下载链接

                                                       DownloadManager.Request request = new DownloadManager.Request(
                                                               Uri.parse(down.getUrl()));
                                                       //指定下载路径和下载文件名
                                                       request.setDestinationInExternalPublicDir(
                                                               "/download/",
                                                               down.getFileName() +
                                                               "." +
                                                               down.getExtName()
                                                       );
                                                       //获取下载管理器
                                                       DownloadManager downloadManager = (DownloadManager)getSystemService(
                                                               Context.DOWNLOAD_SERVICE);
                                                       //将下载任务加入下载队列，否则不会进行下载
                                                       downloadManager.enqueue(request);
                                                   }
                                               })
                                               .setRightButton("取消",new DialogCancelListener())
                                               .show();
                    break;
            }
        }
    }

    private class OnSearchResultListener implements OnResultListener {
        private boolean isRefresh;

        public OnSearchResultListener(boolean isRefresh) {
            this.isRefresh = isRefresh;
        }

        @Override
        public void seccess(String json) {
            json = json.replaceAll("<!--KG_TAG_RES_START-->","");
            json = json.replaceAll("<!--KG_TAG_RES_END-->","");
            json = json.replaceAll("<em>","");
            json = json.replaceAll("<\\\\/em>","");
            json = json.replaceAll("</em>","");
            SearchInfo searchInfo = GsonUtils.get(json,SearchInfo.class);
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
