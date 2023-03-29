package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button send_button;
EditText send_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        send_button=findViewById(R.id.sendButton);
        send_text=findViewById(R.id.PersonName);

        send_button.setOnClickListener(v ->{
            String str =send_text.getText().toString();
            Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
            intent.putExtra("message_key",str);
startActivity(intent);
        });

    }
}