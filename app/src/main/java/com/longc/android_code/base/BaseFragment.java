package com.longc.android_code.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by longc on 2017/2/5.
 *commonFragment ThridPartyFragmner CustomerFragmner OtherFragmnerd 的基类
 */
public abstract class BaseFragment extends Fragment {
    /*
    上下文
     */
    protected Context mContext;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return initView();
    }

    /**
     * 强制子类重写，实现各自的UI
     * @return
     */
    protected abstract View initView();

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();
    }

    /**
     * 当子类要初始化数据、联网请求绑定数据、展示数据时重写该方法
     */
    protected void initData(){
    }
}
