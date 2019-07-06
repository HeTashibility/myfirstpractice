package com.example.myapplication;

import android.graphics.Paint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TextViewActivity extends AppCompatActivity {
    private TextView HBG4, HBG5;

    public TextViewActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        HBG4 = findViewById(R.id.hezihang_BG4); //这里存在一个隐形的类型转换，因为本来是view类型，现在是Textview
        HBG4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG); //这里用Java代码实现了中划线，但用锯齿
        HBG4.getPaint().setAntiAlias(true);//去锯齿

        HBG5 = findViewById(R.id.hezihang_BG5); //这里存在一个隐形的类型转换，因为本来是view类型，现在是Textview
        HBG5.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG); //这里用Java代码实现了下划线，但用锯齿
    }
}
