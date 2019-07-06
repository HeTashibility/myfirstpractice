package com.example.myapplication.listView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;


public class MyListAdapter extends BaseAdapter {
    //Adapter适配器就是定义你每一行每个网格啥样子

    private  Context mContext;
    private LayoutInflater mLayoutInflater;

    MyListAdapter(Context context){
        this.mContext = context;
        mLayoutInflater = LayoutInflater.from(context);

    }
    @Override
    public int getCount() {
        return 10;
        //list的行数
    }
    @Override
    public Object getItem(int i) {
        return null;
    }
    @Override
    public long getItemId(int i) {
        return 0;
    }
    static class ViewHolder{
        public ImageView imageView;
        public TextView tvTitle,tvTime,tvContent;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = null;
        //每一行张长啥样子
        if(view == null){
            view = mLayoutInflater.inflate(R.layout.layout_list_item,null);
            holder =  new ViewHolder();
            holder.imageView = view.findViewById(R.id.iv);
            holder.tvContent= view.findViewById(R.id.tv_content);
            holder.tvTime = view.findViewById(R.id.tv_time);
            holder.tvTitle = view.findViewById(R.id.tv_title);
            view.setTag(holder);
        }else{
            holder =(ViewHolder)view.getTag();
        }
        //给控件赋值
        holder.tvTitle.setText("Title");
        holder.tvTime.setText("2020-01-01");
        holder.tvContent.setText("内容");

        return view;
    }
}
