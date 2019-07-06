package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.fragment.ContainerActivity;
import com.example.myapplication.listView.ListViewActivity;

public class MainActivity extends AppCompatActivity {

    private Button mBtnTextView; //声明
    private Button mBtnButton;
    private Button mBtnEdittext;
    private Button mBtnFragment;
    private Button mBtnListview;
    private Button mBtnPopupwindows;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnTextView = findViewById(R.id.btn_textview); //这里有一个强制转化，本来是vie转成button,b不过新版本已经可以自动转换了
        mBtnTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到textView演示界面
                Intent intent = new Intent(MainActivity.this, TextViewActivity.class);
                startActivity(intent);
            }
        });

        mBtnButton = findViewById(R.id.btn_button);
        mBtnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到button演示界面
                Intent intent = new Intent(MainActivity.this, ButtonActivity.class);
                startActivity(intent);
            }
        });

        mBtnEdittext = findViewById(R.id.btn_edittext);
        mBtnEdittext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, EditTextActivity.class);
                startActivity(intent);
            }
        });
        mBtnFragment = findViewById(R.id.btn_fragment);
        mBtnFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转的Fragment演示画面
                Intent intent = new Intent(MainActivity.this,ContainerActivity.class);
                startActivity(intent);
            }
        });
        mBtnListview = findViewById(R.id.btn_listview);
        mBtnListview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
                startActivity(intent);
            }
        });
        mBtnPopupwindows = findViewById(R.id.btn_popup);
        mBtnPopupwindows.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PopupWindowsActivity.class);
                startActivity(intent);
            }
        });

    }
}
