package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //declare variable
    Button btnlogin;
    EditText edEmail, edPwd;
    String Email, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnlogin=findViewById(R.id.btnlgn);
        edEmail=findViewById(R.id.email);
        edPwd=findViewById(R.id.pwd);


        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Email = edEmail.getText().toString();
                password = edPwd.getText().toString();

            if(Email.equals("unang") && password.equals("ganteng"))
                {
                    Toast.makeText(MainActivity.this, "LOGIN BERHASIL", Toast.LENGTH_SHORT).show();

                    Bundle b = new Bundle();
                    b.putString("a",Email.trim());
                    b.putString("b",password.trim());
                    Intent i = new Intent(getApplicationContext(), ActivityKedua.class);
                    i.putExtras(b);
                    startActivity(i);

                }else{

                    if (Email.isEmpty() || password.isEmpty()){
                        Toast.makeText(MainActivity.this, "IsI DULU TUH YANG KOSONG",Toast.LENGTH_SHORT).show();
                    }else {
                        Toast.makeText(MainActivity.this, "Login Gagal",Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });
    }
}