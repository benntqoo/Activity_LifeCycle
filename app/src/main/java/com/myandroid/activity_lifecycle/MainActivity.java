package com.myandroid.activity_lifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    private static final String TAG = "MainActivity";
    private Button btn_MainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "調用 onCreate");

        btn_MainActivity = (Button) findViewById(R.id.btn_MainActivity);
        btn_MainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "MainActivity onClick");
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "調用 onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "調用 onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "調用 onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "調用 onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "調用 onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "調用 onDestroy");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG, "異常情況調用 onSaveInstanceState");
    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "異常情況調用 onRestoreInstanceState");
    }
}
