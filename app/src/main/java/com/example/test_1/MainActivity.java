package com.example.test_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButton1Clicked(View v){
        Toast.makeText(this,"확인1 버튼이 눌렸어요", Toast.LENGTH_LONG).show();
    }
    public void onButton2Clicked(View v){
        Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.naver.com"));
        startActivity(intent);
    }
    public void onButton3Clicked(View v){
        Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse("tel:0103802830283"));
        startActivity(intent);
    }
}