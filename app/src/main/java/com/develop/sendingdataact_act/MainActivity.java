package com.develop.sendingdataact_act;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name,email,phone;
    Button singup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.editTextName);
        email=findViewById(R.id.editTextEmail);
        phone=findViewById(R.id.editTextTPhone);
        singup=findViewById(R.id.buttonSingup);

        singup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username=name.getText().toString();
                String useremail=email.getText().toString();
                Integer userphone=Integer.valueOf(phone.getText().toString());

                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("name",username);
                intent.putExtra("email",useremail);
                intent.putExtra("phone",userphone);
                startActivity(intent);

            }
        });


    }
}