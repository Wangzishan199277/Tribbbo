package com.example.wangzishan.tribbbo.view.shot_list;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wangzishan.tribbbo.R;
import com.example.wangzishan.tribbbo.view.base.BaseViewHolder;

import butterknife.BindView;

/**
 * Created by wangzishan on 9/21/16.
 */
public class ShotViewHolder extends BaseViewHolder {
    @BindView(R.id.shot_clickable_cover) public View cover;
    @BindView(R.id.shot_like_count) public TextView likeCount;
    @BindView(R.id.shot_bucket_count) public TextView bucketCount;
    @BindView(R.id.shot_view_count) public TextView viewCount;
    @BindView(R.id.shot_image) public ImageView image;

    public ShotViewHolder(View itemView){super(itemView);}
}
