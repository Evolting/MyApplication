package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView tvName;
    private Button btnClose;

    private void bindingView(){
        tvName = findViewById(R.id.textView);
        btnClose = findViewById(R.id.button);
    }

    private void bindingAction(){
        btnClose.setOnClickListener(this::onBtnCloseClick);
    }

    private void onBtnCloseClick(View view){
        System.exit(1);
    }

    private void receiveIntent() {
        Intent i = this.getIntent();
        tvName.setText(i.getStringExtra("name"));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        bindingView();
        bindingAction();

        receiveIntent();
    }
}