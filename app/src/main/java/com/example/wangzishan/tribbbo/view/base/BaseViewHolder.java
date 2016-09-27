package com.example.wangzishan.tribbbo.view.base;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import butterknife.ButterKnife;

/**
 * Created by wangzishan on 9/21/16.
 */
public class BaseViewHolder extends RecyclerView.ViewHolder {
    public BaseViewHolder(View itemView){
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
