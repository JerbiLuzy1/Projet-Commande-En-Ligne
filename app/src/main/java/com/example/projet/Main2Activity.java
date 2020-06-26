package com.example.projet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    Button rt , panier ;


    private GridView listeCourses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        rt = findViewById(R.id.rt);
        panier = findViewById(R.id.panier);


        List<Categories> categoriesList = new ArrayList<>();
        categoriesList.add(new Categories("Fruits et légumes", "fruitslegumes"));
        categoriesList.add(new Categories("Viandes", "viandes"));
        categoriesList.add(new Categories("Poissons","poissons"));
        categoriesList.add(new Categories("Boissons","boissons"));
        categoriesList.add(new Categories("Boulangerie","boulangerie"));
        categoriesList.add(new Categories("Entretien","entretien"));
        categoriesList.add(new Categories("Soins et beauté","soinsbeaute"));
        categoriesList.add(new Categories("Epicerie sucrée","epiceriesucree"));
        categoriesList.add(new Categories("Epicerie salée","epiceriesalee"));
        categoriesList.add(new Categories("Pet-Food","petfood"));
        categoriesList.add(new Categories("Textile","textile"));
        categoriesList.add(new Categories("Bazar","bazar"));

        listeCourses = (GridView)findViewById(R.id.gridviewcourses);

        listeCourses.setAdapter(new CategoriesAdapter(this, categoriesList));
    }

    public void retourrr(View view) {

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

        Intent retour = new Intent(this , MainActivity.class);
        startActivity(retour);
    }


    public void panier(View view) {
        Intent p = new Intent(this , Main4Activity.class);
        startActivity(p);

    }

    public void scanner(View view) {

        Intent scan = new Intent(this , Scanner_Activity.class);
        startActivity(scan);

    }
}
