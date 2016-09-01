package com.myandroid.activity_lifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends Activity {
    private static final String TAG = "SecondActivity";
    private Button btn_SecondActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "調用 onCreate");
        setContentView(R.layout.activity_second);
        btn_SecondActivity = (Button) findViewById(R.id.btn_SecondActivity);
        btn_SecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "SecondActivity onClick:");
                Intent intent = new Intent();
                intent.setClass(SecondActivity.this, MainActivity.class);
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
        Log.d(TAG, "調用  onResume");
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
