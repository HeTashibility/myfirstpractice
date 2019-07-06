package com.example.myapplication.fragment;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;


public class ContainerActivity extends AppCompatActivity implements AFragment.IOnMessageClick{

    private AFragment aFragment;
    private TextView mTvTitle;
//    private BFragment bFragment;
//    private Button mBtnChange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);

        mTvTitle = findViewById(R.id.tv_title);

//        mBtnChange = findViewById(R.id.btn_change);
//        mBtnChange.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(bFragment == null){
//                    bFragment = new BFragment();
//                    getFragmentManager().beginTransaction().replace(R.id.fl_container,bFragment).commitAllowingStateLoss();
//                }
//
//            }
//        });

        //实例化Afragment
        aFragment = AFragment.fangfa("我是参数");
        //把AFragment添加到Activity中，记得调用commit()方法，cimmitAllowingStateLoss()可以避免commit()可能出现横竖错误
        getFragmentManager().beginTransaction().add(R.id.fl_container,aFragment,"a").commitAllowingStateLoss();

    }
    public void setData(String text){
        mTvTitle.setText(text);
    }
    public void onClick(String text){
        mTvTitle.setText(text);
    }
}
