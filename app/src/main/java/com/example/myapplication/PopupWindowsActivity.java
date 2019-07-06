package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

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
                mPop = new PopupWindow(view,mBtnPop.getWidth(),ViewGroup.LayoutParams.WRAP_CONTENT);
                TextView textView = (TextView) view.findViewById(R.id.tv_good);
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mPop.dismiss();
                        Toast.makeText(PopupWindowsActivity.this, "好", Toast.LENGTH_SHORT).show();
                    }
                });
                mPop.setOutsideTouchable(true);//显示的时候按外面消失
                mPop.setFocusable(true);//显示的时候再按按钮消失
                mPop.setFocusable(true);
                mPop.showAsDropDown(mBtnPop);

            }
        });
    }
}
