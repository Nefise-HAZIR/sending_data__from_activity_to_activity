package com.develop.sendingdataact_act;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView name,email,phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name=findViewById(R.id.textViewName);
        email=findViewById(R.id.textViewEmail);
        phone=findViewById(R.id.editTextTPhone);

        Intent intent=getIntent();
        String username=intent.getStringExtra("name");
        String useremail=intent.getStringExtra("email");
        Integer userphone=intent.getIntExtra("phone",0);

        name.setText(username);
        email.setText(useremail);
        phone.setText(String.valueOf(userphone));
    }
}