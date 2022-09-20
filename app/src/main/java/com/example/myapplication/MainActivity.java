package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity {

    private EditText edtName;
    private Button btnLogin;

    private void bindingView(){
        edtName = findViewById(R.id.idEdtName);
        btnLogin = findViewById(R.id.idBtnLogin);
    }

    private void bindingAction(){
        btnLogin.setOnClickListener(this::onBtnLoginClick);
    }

    private void onBtnLoginClick(View view) {
        Intent i = new Intent(MainActivity.this, MainActivity2.class);
        i.putExtra("name", edtName.getText().toString());
        startActivity(i);
    }

    @Override
    protected void onStop() {
        super.onStop();
        edtName.setText("");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindingView();
        bindingAction();
    }
}