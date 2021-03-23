package com.example.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class DaftarActivity extends AppCompatActivity {
    EditText edtNama, edtAlamat, edtEmail, edtPassword, edtrepass;

    FloatingActionButton fab;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pendaftaran);

        edtNama = findViewById(R.id.MasukkanNama);
        edtAlamat = findViewById(R.id.Alamat);
        edtEmail = findViewById(R.id.MasukkanEmail);
        edtPassword = findViewById(R.id.MasukkanPassword);
        edtrepass = findViewById(R.id.MasukkanPasswordKembali);


        fab = findViewById(R.id.floatingBtn);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtNama.getText().toString().isEmpty() ||
                        edtAlamat.getText().toString().isEmpty() ||
                        edtEmail.getText().toString().isEmpty() ||
                        edtPassword.getText().toString().isEmpty() ||
                        edtrepass.getText().toString().isEmpty())
                {
                    Snackbar.make(view, "Wajib Mengisi Seluruh data", Snackbar.LENGTH_SHORT).show();
                }
                else
                {
                    if (edtPassword.getText().toString().equals(edtrepass.getText().toString()))
                    {
                        Toast.makeText(getApplicationContext(), "Pendaftaran Berhasil..", Toast.LENGTH_SHORT).show();

                        Intent i = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(i);
                    }
                    else {
                        Snackbar.make(view, "Password dan Repassword Harus sama",
                                Snackbar.LENGTH_SHORT).show();
                    }
                }

            }


        });


        }

    }
