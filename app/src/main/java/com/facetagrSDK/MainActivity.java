package com.facetagrSDK;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import www.facetagr.com.facetagrsdk.MyToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyToast.showToast(this,"Toast from FacetagrSDK");
    }
}