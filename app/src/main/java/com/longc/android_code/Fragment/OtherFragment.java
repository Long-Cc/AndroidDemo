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
public class OtherFragment extends BaseFragment {

    private static final String TAG = OtherFragment.class.getSimpleName();
    private TextView textView;

    @Override
    protected View initView() {
        Log.e(TAG,"其他Fragment页面被初始化");
        textView = new TextView(mContext);
        textView.setGravity(Gravity.CENTER);
        textView.setTextSize(20);
        textView.setTextColor(Color.RED);
        return textView;
    }

    @Override
    protected void initData() {
        Log.e(TAG,"其他Fragment页面数据被初始化");
        super.initData();
        textView.setText("其他");
    }
}
