package com.example.projet;

public class Categories {

    private String nomCategories;
    private String mnenonic;


    public Categories(String nomCategories,String mnenonic){
        this.nomCategories = nomCategories;
        this.mnenonic = mnenonic;
    }

    public String getNomCategories(){
        return nomCategories;
    }

    public String getMnenonic(){
        return mnenonic;
    }
}
