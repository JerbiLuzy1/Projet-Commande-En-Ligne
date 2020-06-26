package com.example.projet;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Main4Activity extends AppCompatActivity {

    Button retour , commande ;

    TextView test ;

    private ListView listeCoursepanier;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        retour = findViewById(R.id.retour);
        commande = findViewById(R.id.commande);

        List<Panier> panierList = new ArrayList<>();
        panierList.add(new Panier("Pommes", "pommes", 2.20F));
        panierList.add(new Panier("Poires", "poires", 3.50F));
        panierList.add(new Panier("Oranges","oranges", 2F));
        panierList.add(new Panier("Bananes","bananes", 3F));
        panierList.add(new Panier("Tomates","tomates", 1F));
        panierList.add(new Panier("Fraises","fraises", 4F));
        panierList.add(new Panier("Raisins","raisins", 4.20F));
        panierList.add(new Panier("Kiwis","kiwis", 2.99F));
        panierList.add(new Panier("Haricots","haricots", 1.50F));

        listeCoursepanier = (ListView)findViewById(R.id.listviewpanier);

        listeCoursepanier.setAdapter(new PanierAdapter(this, panierList));

    }

    public void retour(View view) {

        Intent rt = new Intent(this , Main2Activity.class);
        startActivity(rt);
    }

    public void valider(View view) {

        onCreateDialog();

    }


    public void scanne(View view) {

        Intent scanne = new Intent(this , Scanner_Activity.class);
        startActivity(scanne);
    }

    private void onCreateDialog ()
    {

        AlertDialog.Builder fenetre = new AlertDialog.Builder(this);
        fenetre.setTitle("Voulez-vous valider la commande ?");
        fenetre.setPositiveButton("Valider", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Intent intent = new Intent(Main4Activity.this, Main5Activity.class);
                startActivity(intent);

            }
        });
        fenetre.setNegativeButton("Annuler", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(Main4Activity.this, "vous avez annulé", Toast.LENGTH_SHORT).show();

            }
        });
        AlertDialog alertedialog = fenetre.create();
        alertedialog.show();

    }
}
