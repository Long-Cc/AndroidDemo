package com.longc.android_code.Fragment;

import android.graphics.Color;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.longc.android_code.base.BaseFragment;

/**
 * Created by longc on 2017/2/5.
 */
public class CustomerFragment extends BaseFragment {
    private static final String TAG = OtherFragment.class.getSimpleName();
    private TextView textView;

    @Override
    protected View initView() {
        Log.e(TAG,"自定义Fragment页面被初始化");
        textView = new TextView(mContext);
        textView.setGravity(Gravity.CENTER);
        textView.setTextSize(20);
        textView.setTextColor(Color.RED);
        return textView;
    }

    @Override
    protected void initData() {
        super.initData();
        Log.e(TAG, "自定义Fragment页面数据被初始化");
        textView.setText("自定义");
    }
}
