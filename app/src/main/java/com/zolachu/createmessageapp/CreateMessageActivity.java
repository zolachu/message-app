package com.zolachu.createmessageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreateMessageActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    public void onSendMessage(View view) {
//        Intent intent = new Intent(this, com.zolachu.createmessageapp.ReceiveMessageActivity.class);
        EditText message = findViewById(R.id.message);
        String sMessage = message.getText().toString().trim();


        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, sMessage);
        intent.putExtra(Intent.EXTRA_SUBJECT, "subject");
        String chooser = getString(R.string.chooser);
        Intent chosenIntent = Intent.createChooser(intent, chooser);
        startActivity(chosenIntent);

    }
}