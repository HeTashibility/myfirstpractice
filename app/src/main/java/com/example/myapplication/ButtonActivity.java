package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ButtonActivity extends AppCompatActivity {

    private Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        button3 = findViewById(R.id.btn_3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ButtonActivity.this,"我btn3被点了", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void showToast(View view){
        Toast.makeText(this, "对的，你按下去了", Toast.LENGTH_LONG).show(); //弹出提示信息功能
        Log.d("hello","heloonishidashabima");
    }

}
