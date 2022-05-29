package com.kamikaze.applifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textview =findViewById(R.id.textView);
        EditText editText =findViewById(R.id.editTextTextPersonName);
        Log.v("oncreate","this app is created");







    }




    @Override
    protected void onStart() {
        super.onStart();
        Log.v("oncreate","this app is start ");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.v("oncreate","this is resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("oncreate","this is paused");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("oncreate","this is restarted");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("oncreate","this is stop" );
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("oncreate","this is destroyed");
    }
}