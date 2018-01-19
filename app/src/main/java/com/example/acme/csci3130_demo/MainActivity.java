package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayText(View view) {
        EditText editText = findViewById(R.id.editText);
        String msg = editText.getText().toString();

        TextView textView = findViewById(R.id.textView);
        textView.setText(msg);
    }

}
