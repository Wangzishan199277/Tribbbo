package com.example.wangzishan.tribbbo.view.bucket_list;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wangzishan.tribbbo.R;
import com.example.wangzishan.tribbbo.model.Bucket;

import java.text.MessageFormat;
import java.util.List;

/**
 * Created by wangzishan on 9/22/16.
 */
public class BucketListAdapter extends RecyclerView.Adapter{
    private List<Bucket> data;

    public BucketListAdapter(List<Bucket> data) {this.data = data; }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_bucket, parent,false);
        return new BucketViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Bucket bucket = data.get(position);
        String bucketShotCountString = MessageFormat.format(holder.itemView.getContext().getResources().getString(R.string.shot_count), bucket.shots_count);
        BucketViewHolder bucketViewHolder = (BucketViewHolder) holder;
        bucketViewHolder.bucketName.setText(bucket.name);
        bucketViewHolder.bucketShotCount.setText(bucketShotCountString);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
