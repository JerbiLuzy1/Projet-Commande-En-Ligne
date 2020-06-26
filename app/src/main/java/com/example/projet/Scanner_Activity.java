package com.example.projet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Scanner_Activity extends AppCompatActivity {

    TextView codebar, prix;
    ImageView item_icon ;
    private static final Pattern KEYCODE_PATTERN = Pattern.compile("KEYCODE_(\\w)");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanner_);

        codebar = findViewById(R.id.codebar);
        item_icon = findViewById(R.id.item_icon);
        prix = findViewById(R.id.prix);

    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        String key = KeyEvent.keyCodeToString(keyCode);

        switch (keyCode) {
            case 8:
                codebar.setText("Pommes");
                this.item_icon.setImageResource(R.drawable.item_pommes_icon);
                prix.setText( "2.20 € /Kg");
                break;

            case 9:
                codebar.setText("Poires");
                this.item_icon.setImageResource(R.drawable.item_poires_icon);
                prix.setText( "3.50 € /Kg");
                break;

            case 10:
                codebar.setText("Oranges");
                this.item_icon.setImageResource(R.drawable.item_oranges_icon);
                prix.setText( "2 € /Kg");
                break;

            case 11:
                codebar.setText("Bananes");
                this.item_icon.setImageResource(R.drawable.item_bananes_icon);
                prix.setText( "3 € /Kg");
                break;

            case 12:
                codebar.setText("Tomates");
                this.item_icon.setImageResource(R.drawable.item_tomates_icon);
                prix.setText( "1 € /Kg");
                break;

            case 13:
                codebar.setText("Fraises");
                this.item_icon.setImageResource(R.drawable.item_fraises_icon);
                prix.setText( "4 € /Kg");
                break;

            case 14:
                codebar.setText("Raisins");
                this.item_icon.setImageResource(R.drawable.item_raisins_icon);
                prix.setText( "4.20 € /Kg");
                break;

            case 15:
                codebar.setText("Kiwis");
                this.item_icon.setImageResource(R.drawable.item_kiwis_icon);
                prix.setText( "2.99 € /Kg");
                break;

            case 16:
                codebar.setText("Haricots");
                this.item_icon.setImageResource(R.drawable.item_haricots_icon);
                prix.setText( "1.50 € /Kg");
                break;

        }

        // use pattern to convert int keycode to some character
        Matcher matcher = KEYCODE_PATTERN.matcher(key);
        if (matcher.matches()) {
            // append character to textview
            // codebar.append(matcher.group(1));

        }

        // let the default implementation handle the event
        return super.onKeyDown(keyCode, event);

    }

}
