package com.huangyuanlove.flutterboostdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class NativePageActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mOpenNative;
    private TextView mOpenFlutter;
    private TextView mOpenFlutterFragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("NativePageActivity","onCreate");

        setContentView(R.layout.native_page);

        mOpenNative = findViewById(R.id.open_native);
        mOpenFlutter = findViewById(R.id.open_flutter);
        mOpenFlutterFragment = findViewById(R.id.open_flutter_fragment);

        mOpenNative.setOnClickListener(this);
        mOpenFlutter.setOnClickListener(this);
        mOpenFlutterFragment.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Map params = new HashMap();
        if (v == mOpenNative) {
            PageRouter.openPageByUrl(this, PageRouter.NATIVE_PAGE_URL,params);
        } else if (v == mOpenFlutter) {
            PageRouter.openPageByUrl(this, PageRouter.FLUTTER_PAGE_URL,params);
        } else if (v == mOpenFlutterFragment) {
            PageRouter.openPageByUrl(this, PageRouter.FLUTTER_FRAGMENT_PAGE_URL,params);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("NativePageActivity","onDestroy");
    }
}