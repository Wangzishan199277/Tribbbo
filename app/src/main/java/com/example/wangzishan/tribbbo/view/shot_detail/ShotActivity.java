package com.example.wangzishan.tribbbo.view.shot_detail;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;

import com.example.wangzishan.tribbbo.view.base.SingleFragmentActivity;

/**
 * Created by wangzishan on 10/28/16.
 */
public class ShotActivity extends SingleFragmentActivity{

    public static final String KEY_SHOT_TITLE = "shot_title";
    @NonNull
    @Override
    protected String getActivityTitle() {
        return getIntent().getStringExtra(KEY_SHOT_TITLE);
    }

    @NonNull
    @Override
    protected Fragment newFragment() {
        return ShotFragment.newInstance(getIntent().getExtras());
    }
}
