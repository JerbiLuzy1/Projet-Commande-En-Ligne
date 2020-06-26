package com.example.projet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Main3_1Activity extends AppCompatActivity {

    private ListView listeCourseFL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3_1);

        List<FruitsLegumes> fruitsLegumesList = new ArrayList<>();
        fruitsLegumesList.add(new FruitsLegumes("Pommes", "pommes", 2.20F));
        fruitsLegumesList.add(new FruitsLegumes("Poires", "poires", 3.50F));
        fruitsLegumesList.add(new FruitsLegumes("Oranges","oranges", 2F));
        fruitsLegumesList.add(new FruitsLegumes("Bananes","bananes", 3F));
        fruitsLegumesList.add(new FruitsLegumes("Tomates","tomates", 1F));
        fruitsLegumesList.add(new FruitsLegumes("Fraises","fraises", 4F));
        fruitsLegumesList.add(new FruitsLegumes("Raisins","raisins", 4.20F));
        fruitsLegumesList.add(new FruitsLegumes("Kiwis","kiwis", 2.99F));
        fruitsLegumesList.add(new FruitsLegumes("Haricots","haricots", 1.50F));

        listeCourseFL = (ListView)findViewById(R.id.listviewfl);

        listeCourseFL.setAdapter(new FLAdapter(this, fruitsLegumesList));
    }

    public void retourr(View view) {

        Intent rt = new Intent(this , Main2Activity.class);
        startActivity(rt);
    }

    public void panier(View view) {

        Intent p = new Intent(this , Main4Activity.class);
        startActivity(p);
    }

    public void scann(View view) {

        Intent scan = new Intent(this , Scanner_Activity.class);
        startActivity(scan);
    }
}
