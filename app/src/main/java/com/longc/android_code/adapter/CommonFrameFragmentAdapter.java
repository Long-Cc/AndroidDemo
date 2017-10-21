package com.longc.android_code.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by longc on 2017/2/6.
 */
public class CommonFrameFragmentAdapter extends BaseAdapter {

    private final Context mContext;
    private final String[] mDatas;

    public CommonFrameFragmentAdapter(Context mContext,String[] mDatas){
        this.mContext = mContext;
        this.mDatas = mDatas;
    }
    @Override
    public int getCount() {
        return mDatas.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textView =new TextView(mContext);
        textView.setPadding(10,10,0,10);
        textView.setTextSize(20);
        textView.setTextColor(Color.BLACK);
        textView.setText(mDatas[position]);
        return textView;
    }
}
