package com.longc.android_code.Fragment;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.longc.android_code.R;
import com.longc.android_code.adapter.CommonFrameFragmentAdapter;
import com.longc.android_code.base.BaseFragment;

/**
 * Created by longc on 2017/2/5.
 */
public class CommonFrameFragment extends BaseFragment {
    private static final String TAG = OtherFragment.class.getSimpleName();

    private ListView mListView;
    private String[] datas;
    private CommonFrameFragmentAdapter adapter;

    @Override
    protected View initView() {
        Log.e(TAG, "常用框架Fragment页面被初始化");
        View view = View.inflate(mContext, R.layout.common_frame_fragment,null);
        mListView = (ListView) view.findViewById(R.id.listview);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(mContext,datas[position],Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

    @Override
    protected void initData() {
        super.initData();
        Log.e(TAG, "常用框架Fragment页面被初始化");
        //准备数据
        datas = new String[]{"OKHttp", "xUtils3","Retrofit2","Fresco","Glide","greenDao","RxJava","volley","Gson","FastJson","picasso","evenBus","jcvideoplayer","pulltorefresh","Expandablelistview","UniversalVideoView","....."};
        //设置适配器
        adapter = new CommonFrameFragmentAdapter(mContext,datas);
        mListView.setAdapter(adapter);
    }
}
