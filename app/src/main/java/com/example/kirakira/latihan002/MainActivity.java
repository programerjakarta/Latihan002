package com.example.kirakira.latihan002;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //make windows full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // Change custom Font
        // create folder assets/fonts on app
        //copy font to folder fonts
        TextView tx = (TextView)findViewById(R.id.textView);
        TextView tz = (TextView)findViewById(R.id.textView2);

        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/Demolition Crack Black.ttf");

        tx.setTypeface(custom_font);
        tz.setTypeface(custom_font);

        //add on click on page
        RelativeLayout rl = (RelativeLayout) findViewById(R.id.mainlayout);
        rl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
