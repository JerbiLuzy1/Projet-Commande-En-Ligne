package com.example.projet;

public class Panier {

    private String nomPanier;
    private String mnenonic;
    private float prixPanier;

    public Panier(String nomPanier, String mnenonic, float prixPanier){
        this.nomPanier = nomPanier;
        this.mnenonic = mnenonic;
        this.prixPanier = prixPanier;
    }

    public String getNomPanier(){
        return nomPanier;
    }

    public String getMnenonic(){
        return mnenonic;
    }

    public float getPrix(){
        return prixPanier;
    }
}
