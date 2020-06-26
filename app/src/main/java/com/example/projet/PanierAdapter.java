package com.example.projet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import java.util.List;

import static com.example.projet.Global.prix_total;

public class PanierAdapter extends BaseAdapter{



    private Context context;
    private List<Panier> panierList;
    private LayoutInflater inflater;


    public PanierAdapter(@NonNull Context context, List<Panier> panierList) {
        this.context = context;
        this.panierList = panierList;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return panierList.size();
    }

    @Override
    public Panier getItem(int position) {
        return panierList.get(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = inflater.inflate(R.layout.panier_cell, null);

        Panier currentpanier = getItem(i);
        final String nomPanier = currentpanier.getNomPanier();
        final String mnemonic = currentpanier.getMnenonic();
        float prixPanier = currentpanier.getPrix();

        ImageView itemIconView = (ImageView)view.findViewById(R.id.item_icon);
        String resourceName = "item_" + mnemonic + "_icon";
        int resId = context.getResources().getIdentifier(resourceName, "drawable",context.getPackageName());
        itemIconView.setImageResource(resId);

        TextView nomPanierView = (TextView)view.findViewById(R.id.nomPanier);
        nomPanierView.setText(nomPanier);

        TextView prixPanierView = (TextView)view.findViewById(R.id.prixPanier);
        prixPanierView.setText(prixPanier + " €");

        TextView Nombre_Produit = (TextView)view.findViewById(R.id.Nombre_Produit);

        switch(nomPanier)
        {
            case "Pommes" :
                String pomme = Integer.toString(Global.nb_pommes);
                Nombre_Produit.setText(pomme);
                break;

            case "Poires" :
                String poire =Integer.toString(Global.nb_poires);
                Nombre_Produit.setText(poire);
                break ;

            case "Oranges" :
                String orange =Integer.toString(Global.nb_oranges);
                Nombre_Produit.setText(orange);
                break ;

            case "Bananes" :
                String banane =Integer.toString(Global.nb_bananes);
                Nombre_Produit.setText(banane);
                break ;

            case "Tomates" :
                String tomate =Integer.toString(Global.nb_tomates);
                Nombre_Produit.setText(tomate);
                break ;

            case "Fraises" :
                String fraise =Integer.toString(Global.nb_fraises);
                Nombre_Produit.setText(fraise);
                break ;

            case "Raisins" :
                String raisin =Integer.toString(Global.nb_raisin);
                Nombre_Produit.setText(raisin);
                break ;

            case "Kiwis" :
                String kiwi =Integer.toString(Global.nb_kiwis);
                Nombre_Produit.setText(kiwi);
                break ;

            case "Haricots" :
                String haricot =Integer.toString(Global.nb_haricots);
                Nombre_Produit.setText(haricot);
                break ;

        }


        return view;
    }
}
