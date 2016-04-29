package com.example.kirakira.latihan002;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button btn1;
    TextView text1,text2;
    CoordinatorLayout coordinatorLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
//        Snackbar.make(coordinatorLayout,"Username dan Password SALAH",Snackbar.LENGTH_SHORT).show();
//        Snackbar.make(coordinatorLayout, "Snackbar", Snackbar.LENGTH_LONG)
//                .setAction("Action", null).show();
        coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coordinatorLayout);
        //make windows full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // Change custom Font
        // create folder assets/fonts on app
        //copy font to folder fonts
        TextView tx = (TextView)findViewById(R.id.textView);

        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/Demolition Crack Black.ttf");

        tx.setTypeface(custom_font);
        btn1 = (Button) findViewById(R.id.btnLogin);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //inisialisasi object
                text1 = (TextView) findViewById(R.id.textLogin);
                text2 = (TextView) findViewById(R.id.textPassword);
                Toast.makeText(getApplicationContext(),text2.getText().toString().trim(),Toast.LENGTH_SHORT).show();
                if ((text1.getText().toString().trim().equals("sp")) && (text2.getText().toString().trim().equals("sp"))) {
                    Intent intent = new Intent(LoginActivity.this,ListActivity.class);
                    startActivity(intent);
                } else {
//                                    Toast.makeText(getApplicationContext(),text1.getText().toString(),Toast.LENGTH_SHORT).show();

                    Snackbar snakbar = Snackbar.make(coordinatorLayout,"Username dan Password SALAH",Snackbar.LENGTH_SHORT).setAction("Action",null);
                    snakbar.show();
                }
            }
        });

    }
}
