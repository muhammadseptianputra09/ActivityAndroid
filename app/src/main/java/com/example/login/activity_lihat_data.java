package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class activity_lihat_data extends Activity {

        TextView tvnama, tvnomor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);
        tvnama = (TextView) findViewById(R.id.NamaKontak);
        tvnomor = (TextView) findViewById(R.id.NomorTelepon);

        Bundle bundle = getIntent().getExtras();
        String nama = bundle.getString("a");

        switch (nama){
            case "Inayah":
                tvnama.setText("Inayah M");
                tvnomor.setText("08122233344");
                break;
            case "Ilham":
                tvnama.setText("Ilham R");
                tvnomor.setText("00183983923");
                break;
            case "Eris":
                tvnama.setText("Eris J");
                tvnomor.setText("083236763263");
                break;
            case "Fikri":
                tvnama.setText("M. Fikri");
                tvnomor.setText("093278232837");
                break;
            case "Maul":
                tvnama.setText("Maul M");
                tvnomor.setText("083827328723");
                break;
            case "Intan":
                tvnama.setText("Intan S");
                tvnomor.setText("083902392823");
                break;
            case "Vina":
                tvnama.setText("Vina R");
                tvnomor.setText("983923293297");
                break;
            case "Gita":
                tvnama.setText("Gita S");
                tvnomor.setText("089288738272");
                break;
            case "Lutfi":
                tvnama.setText("Lutfi M");
                tvnomor.setText("082372799387");
                break;
            case "Vian":
                tvnama.setText("Vian M");
                tvnomor.setText("083762873618");
                break;
        }
    }
}
