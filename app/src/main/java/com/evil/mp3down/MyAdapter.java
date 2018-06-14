package com.evil.mp3down;

import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.format.Formatter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<SearchInfo.DataBean.InfoBean> mSearchInfos;

    public List<SearchInfo.DataBean.InfoBean> getDatas() {
        return mSearchInfos;
    }
    private Handler mHandler;
    public void setSearchInfos(SearchInfo infos) {
        if (infos != null) {
            SearchInfo.DataBean data = infos.getData();
            if (data != null) {
                List<SearchInfo.DataBean.InfoBean> info = data.getInfo();
                setData(info);
            }
        }
    }

    public void addSearchInfos(SearchInfo infos) {
        if (infos != null) {
            SearchInfo.DataBean data = infos.getData();
            if (data != null) {
                List<SearchInfo.DataBean.InfoBean> info = data.getInfo();
                addData(info);
            }
        }
    }

    public void clear() {
        mSearchInfos = null;
        notifyDataSetChanged();
    }

    public void setData(List<SearchInfo.DataBean.InfoBean> searchInfos) {
        mSearchInfos = searchInfos;
        notifyDataSetChanged();
    }


    public void addData(List<SearchInfo.DataBean.InfoBean> searchInfos) {
        if (searchInfos == null) {
            return;
        }
        if (mSearchInfos == null) {
            mSearchInfos = new ArrayList<>();
        }
        mSearchInfos.addAll(searchInfos);
        notifyDataSetChanged();
    }

    public void setHandler(Handler handler) {
        mHandler = handler;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(
            @NonNull ViewGroup parent,int viewType
    )
    {
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        View view = from.inflate(R.layout.holder_search,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder,int position) {
        SearchInfo.DataBean.InfoBean bean = mSearchInfos.get(position);
        holder.mTvName.setText(bean.getSongname());
        holder.mTvAuthor.setText(bean.getSingername());
        holder.mTvAblum.setText(bean.getAlbum_name());
        holder.mIvDown.setOnClickListener(new OnDownListener(bean.getFilename(),bean.getHash()));
        holder.mTvTime.setText(Formatter.formatFileSize(holder.mIvDown.getContext(),bean.getFilesize()));
    }

    @Override
    public int getItemCount() {
        if (mSearchInfos != null) {
            return mSearchInfos.size();
        }
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTvName;
        public TextView mTvAuthor;
        public TextView mTvAblum;
        public ImageView mIvDown;
        public TextView mTvTime;

        public ViewHolder(View rootView) {
            super(rootView);
            this.mTvName = (TextView)rootView.findViewById(R.id.tv_name);
            this.mTvAuthor = (TextView)rootView.findViewById(R.id.tv_author);
            this.mTvAblum = (TextView)rootView.findViewById(R.id.tv_ablum);
            this.mIvDown = (ImageView)rootView.findViewById(R.id.iv_down);
            this.mTvTime = (TextView)rootView.findViewById(R.id.tv_time);
        }
    }

    private class OnDownListener implements View.OnClickListener{
        private String songname;
        private String hash;

        public OnDownListener(String songname,String hash) {
            this.songname = songname;
            this.hash = hash;
        }

        @Override
        public void onClick(View v) {
            RetrofigUtils.downMp3(songname,hash,mHandler);
        }
    }
}
