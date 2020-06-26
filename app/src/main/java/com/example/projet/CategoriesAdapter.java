package com.example.projet;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import java.util.List;

public class CategoriesAdapter extends BaseAdapter {

    private Context context;
    private List<Categories> categoriesList;
    private LayoutInflater inflater;

    public CategoriesAdapter(@NonNull Context context, List<Categories> categoriesList) {
        this.context = context;
        this.categoriesList = categoriesList;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return categoriesList.size();
    }

    @Override
    public Categories getItem(int position) {
        return categoriesList.get(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = inflater.inflate(R.layout.categories_cell, null);

        Categories currentcategories = getItem(i);
        final String nomCategories = currentcategories.getNomCategories();
        final String mnemonic = currentcategories.getMnenonic();

        ImageView itemIconView = (ImageView)view.findViewById(R.id.item_icon);
        String resourceName = "item_" + mnemonic + "_icon";
        int resId = context.getResources().getIdentifier(resourceName, "drawable",context.getPackageName());
        itemIconView.setImageResource(resId);

        TextView nomCategoriesView = (TextView)view.findViewById(R.id.nomCategories);
        nomCategoriesView.setText(nomCategories);

        //Button button_categories = (Button)view.findViewById(R.id.button_categories);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Vous avez cliqué sur la catégorie " + nomCategories, Toast.LENGTH_SHORT).show();


               switch (nomCategories){
                 case "Fruits et légumes":
                    Intent cliquer = new Intent(context , Main3_1Activity.class);
                    context.startActivity(cliquer);
                    break;
                 case "Viandes":
                     Toast.makeText(context,"Cette catégorie n'est pas disponible pour le moment", Toast.LENGTH_LONG).show();
                     break;
                case "Poissons":
                     Toast.makeText(context,"Cette catégorie n'est pas disponible pour le moment", Toast.LENGTH_LONG).show();
                    break;
                case "Boissons":
                    Toast.makeText(context,"Cette catégorie n'est pas disponible pour le moment", Toast.LENGTH_LONG).show();
                    break;
                case "Boulangerie":
                    Toast.makeText(context,"Cette catégorie n'est pas disponible pour le moment", Toast.LENGTH_LONG).show();
                    break;
                case "Entretien":
                    Toast.makeText(context,"Cette catégorie n'est pas disponible pour le moment", Toast.LENGTH_LONG).show();
                    break;
                case "Soins et beauté":
                    Toast.makeText(context,"Cette catégorie n'est pas disponible pour le moment", Toast.LENGTH_LONG).show();
                    break;
                case "Epicerie sucrée":
                    Toast.makeText(context,"Cette catégorie n'est pas disponible pour le moment", Toast.LENGTH_LONG).show();
                    break;
                case "Epicerie salée":
                    Toast.makeText(context,"Cette catégorie n'est pas disponible pour le moment", Toast.LENGTH_LONG).show();
                    break;
                case "Pet-Food":
                    Toast.makeText(context,"Cette catégorie n'est pas disponible pour le moment", Toast.LENGTH_LONG).show();
                    break;
                case "Textile":
                    Toast.makeText(context,"Cette catégorie n'est pas disponible pour le moment", Toast.LENGTH_LONG).show();
                    break;
                case "Bazar":
                    Toast.makeText(context,"Cette catégorie n'est pas disponible pour le moment", Toast.LENGTH_LONG).show();
                    break;
                }
            }
        });
        return view;
    }
}
