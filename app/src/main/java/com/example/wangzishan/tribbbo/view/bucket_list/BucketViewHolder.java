package com.example.wangzishan.tribbbo.view.bucket_list;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wangzishan.tribbbo.R;
import com.example.wangzishan.tribbbo.view.base.BaseViewHolder;

import butterknife.BindView;

/**
 * Created by wangzishan on 9/22/16.
 */
public class BucketViewHolder extends BaseViewHolder{
    @BindView(R.id.bucket_layout) View bucketLayout;
    @BindView(R.id.bucket_name) TextView bucketName;
    @BindView(R.id.bucket_shot_count) TextView bucketShotCount;
    @BindView(R.id.bucket_shot_chosen) ImageView bucketChosen;
    public BucketViewHolder(View itemView){super(itemView);}
}
