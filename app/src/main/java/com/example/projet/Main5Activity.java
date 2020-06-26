package com.example.projet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.Float2;
import android.renderscript.Float3;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Main5Activity extends AppCompatActivity {

    TextView prix_panier ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        prix_panier = findViewById(R.id.prix_panier);
        String prix = String.format("%,.2f",Global.prix_total);

        prix_panier.setText(prix);

    }

    public void retour(View view) {

        Global.prix_total = 0;
        Global.nb_pommes = 0;
        Global.nb_poires = 0;
        Global.nb_oranges = 0;
        Global.nb_bananes = 0;
        Global.nb_tomates = 0;
        Global.nb_fraises = 0;
        Global.nb_raisin = 0;
        Global.nb_kiwis = 0;
        Global.nb_haricots = 0;


        Intent r = new Intent(this, MainActivity.class);
        startActivity(r);

    }
}
