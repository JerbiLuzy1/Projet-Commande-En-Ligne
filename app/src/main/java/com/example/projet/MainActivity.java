package com.example.projet;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button historique, commande;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        commande = findViewById(R.id.commande);

    }

    public void commande(View view) {

        onCreateDialog();

        Intent s = new Intent(this, Main2Activity.class);
         startActivity(s);

    }

    public void historique(View view) {

        Intent h = new Intent(this, Main5Activity.class);
        startActivity(h);
    }

    private void onCreateDialog() {

        AlertDialog.Builder fenetre = new AlertDialog.Builder(this);
        fenetre.setTitle("Veuillez activer le bluetooth pour utiliser le scanner");
        fenetre.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();

            }

        });

        AlertDialog alertedialog = fenetre.create();
        alertedialog.show();

    }

    public void activer(View view) {

        Intent activer = new Intent(this, Bluetooth.class);
        startActivity(activer);


    }
}
