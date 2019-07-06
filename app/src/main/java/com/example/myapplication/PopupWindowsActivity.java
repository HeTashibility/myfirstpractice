package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;

import androidx.appcompat.app.AppCompatActivity;

public class PopupWindowsActivity extends AppCompatActivity {

    private Button mBtnPop;
    private PopupWindow mPop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_windows);


        mBtnPop = findViewById(R.id.btn_pop);
        mBtnPop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = getLayoutInflater().inflate(R.layout.layout_pop,null);
                mPop = new PopupWindow(view,ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
                mPop.showAsDropDown(mBtnPop);
            }
        });
    }
}
