package com.example.kirakira.latihan002;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        TextView tx = (TextView)findViewById(R.id.textView);
        TextView tz = (TextView)findViewById(R.id.textView2);

        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/Demolition Crack Black.ttf");

        tx.setTypeface(custom_font);
        tz.setTypeface(custom_font);
    }
}
