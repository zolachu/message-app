package com.zolachu.createmessageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ReceiveMessageActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);

        String message = getIntent().getStringExtra(EXTRA_MESSAGE);
        TextView messageDisplay = findViewById(R.id.message_display);
        messageDisplay.setText(message);
    }
}