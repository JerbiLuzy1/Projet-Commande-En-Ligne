package com.example.projet;

import android.app.Application;

public class Global extends Application {


    public static int nb_pommes ;
    public static int nb_poires ;
    public static int nb_oranges ;
    public static int nb_bananes ;
    public static int nb_tomates ;
    public static int nb_fraises ;
    public static int nb_raisin ;
    public static int nb_kiwis;
    public static int nb_haricots ;

   public static float prix_total = 0;

    public int getNb_pommes  (){

        return nb_pommes ;
    }

    public void setNb_pommes(int nb_pommes){

        this.nb_pommes = nb_pommes ;

    }

}
