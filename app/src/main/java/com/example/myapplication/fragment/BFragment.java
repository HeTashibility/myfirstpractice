package com.example.myapplication.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myapplication.R;


public class BFragment extends Fragment {


    private TextView mTvTitle;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b,container,false);
        return view;
    }//设置布局文件

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mTvTitle = view.findViewById(R.id.tv_title);
    }//找出对于的组件然后操作

}

