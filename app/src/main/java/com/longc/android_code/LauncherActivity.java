package com.longc.android_code;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class LauncherActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        //两秒进入主页面
       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
               //启动主页面
               startActivity(new Intent(LauncherActivity.this,MainActivity.class));
               //关闭当前页面
               finish();
           }
       },2000);
    }
}
