package com.example.projet;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import static com.example.projet.Global.prix_total;
import static java.util.logging.Logger.global;

public class FLAdapter extends BaseAdapter{

    private Context context;
    private List<FruitsLegumes> fruitsLegumesList;
    private LayoutInflater inflater;


    public FLAdapter(@NonNull Context context, List<FruitsLegumes> fruitsLegumesList) {
        this.context = context;
        this.fruitsLegumesList = fruitsLegumesList;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return fruitsLegumesList.size();
    }

    @Override
    public FruitsLegumes getItem(int position) {
        return fruitsLegumesList.get(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = inflater.inflate(R.layout.fruitslegumes_cell, null);

        FruitsLegumes currentfruitslegumes = getItem(i);
        final String nomFruitsLegumes = currentfruitslegumes.getNomFruitsLegumes();
        final String mnemonic = currentfruitslegumes.getMnenonic();
        final float prixFruitsLegumes = currentfruitslegumes.getPrix();

        ImageView itemIconView = (ImageView)view.findViewById(R.id.item_icon);
        String resourceName = "item_" + mnemonic + "_icon";
        int resId = context.getResources().getIdentifier(resourceName, "drawable",context.getPackageName());
        itemIconView.setImageResource(resId);

        TextView nomFruitsLegumesView = (TextView)view.findViewById(R.id.nomFruitsLegumes);
        nomFruitsLegumesView.setText(nomFruitsLegumes);

        TextView prixFruitsLegumesView = (TextView)view.findViewById(R.id.prixFruitsLegumes);
        prixFruitsLegumesView.setText(prixFruitsLegumes + " € /Kg");


        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Toast.makeText(context,"Vous avez ajouté le produit " + nomFruitsLegumes + " à votre panier", Toast.LENGTH_SHORT).show();

                switch(nomFruitsLegumes)
                {
                    case "Pommes":
                        Global.nb_pommes = Global.nb_pommes +1  ;
                        prix_total = prix_total + prixFruitsLegumes ;
                        Toast.makeText(context,"Vous avez ajouté le produit " + nomFruitsLegumes + " à votre panier", Toast.LENGTH_SHORT).show();
                        break;

                    case "Poires":
                        Global.nb_poires = Global.nb_poires +1  ;
                        prix_total = prix_total + prixFruitsLegumes ;
                        Toast.makeText(context,"Vous avez ajouté le produit " + nomFruitsLegumes + " à votre panier", Toast.LENGTH_SHORT).show();
                        break;

                    case "Oranges":
                        Global.nb_oranges = Global.nb_oranges +1  ;
                        prix_total = prix_total + prixFruitsLegumes ;
                        Toast.makeText(context,"Vous avez ajouté le produit " + nomFruitsLegumes + " à votre panier", Toast.LENGTH_SHORT).show();
                        break;

                    case "Bananes":
                        Global.nb_bananes = Global.nb_bananes +1  ;
                        prix_total = prix_total + prixFruitsLegumes ;
                        Toast.makeText(context,"Vous avez ajouté le produit " + nomFruitsLegumes + " à votre panier", Toast.LENGTH_SHORT).show();
                        break;

                    case "Tomates":
                        Global.nb_tomates = Global.nb_tomates +1  ;
                        prix_total = prix_total + prixFruitsLegumes ;
                        Toast.makeText(context,"Vous avez ajouté le produit " + nomFruitsLegumes + " à votre panier", Toast.LENGTH_SHORT).show();
                        break;

                    case "Fraises":
                        Global.nb_fraises = Global.nb_fraises +1  ;
                        prix_total = prix_total + prixFruitsLegumes ;
                        Toast.makeText(context,"Vous avez ajouté le produit " + nomFruitsLegumes + " à votre panier", Toast.LENGTH_SHORT).show();
                        break;

                    case "Raisins":
                        Global.nb_raisin = Global.nb_raisin +1  ;
                        prix_total = prix_total + prixFruitsLegumes ;
                        Toast.makeText(context,"Vous avez ajouté le produit " + nomFruitsLegumes + " à votre panier", Toast.LENGTH_SHORT).show();
                        break;

                    case "Kiwis":
                        Global.nb_kiwis = Global.nb_kiwis +1  ;
                        prix_total = prix_total + prixFruitsLegumes ;
                        Toast.makeText(context,"Vous avez ajouté le produit " + nomFruitsLegumes + " à votre panier", Toast.LENGTH_SHORT).show();
                        break;

                    case "Haricots":
                        Global.nb_haricots = Global.nb_haricots +1  ;
                        prix_total = prix_total + prixFruitsLegumes ;
                        Toast.makeText(context,"Vous avez ajouté le produit " + nomFruitsLegumes + " à votre panier", Toast.LENGTH_SHORT).show();
                        break;

                }

            }
        });

        return view;
    }
}
