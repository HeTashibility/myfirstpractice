package com.example.myapplication.listView;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.myapplication.R;


public class ListViewActivity extends Activity {

    private ListView mLv1; //声明空间
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        mLv1 = findViewById(R.id.lv_1);
        mLv1.setAdapter(new MyListAdapter(ListViewActivity.this));
        mLv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListViewActivity.this,"点击pos:"+i, Toast.LENGTH_SHORT).show();
                Log.d("hahamdr","yourarestupid");
            }
        });
        mLv1.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListViewActivity.this,"长按pos:"+i, Toast.LENGTH_SHORT).show();


                return true; //return true可以避免重复，意思是我处理了这个操作了，其他的人不要再处理一遍了（因为长按也算点击，如果false的话会触发两个）
            }
        });

    }
}
