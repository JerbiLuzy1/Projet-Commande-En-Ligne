package com.example.projet;

public class FruitsLegumes {

    private String nomFruitsLegumes;
    private String mnenonic;
    private float prixFruitsLegumes;

    public FruitsLegumes(String nomFruitsLegumes,String mnenonic, float prixFruitsLegumes){
        this.nomFruitsLegumes = nomFruitsLegumes;
        this.mnenonic = mnenonic;
        this.prixFruitsLegumes = prixFruitsLegumes;
    }

    public String getNomFruitsLegumes(){
        return nomFruitsLegumes;
    }

    public String getMnenonic(){
        return mnenonic;
    }

    public float getPrix(){
        return prixFruitsLegumes;
    }
}
