package com.example.mohit.practiceexample.intents;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.mohit.practiceexample.R;

public class IntentMain extends AppCompatActivity {

    Button mBtn_CallImplicitIntent,mBtn_CallExplicitIntent;
    static private final String URL = "http://www.google.com";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_main);

        mBtn_CallImplicitIntent=(Button)findViewById(R.id.id_Btn_CallImplicitIntent);
        mBtn_CallExplicitIntent=(Button)findViewById(R.id.id_Btn_CallExplicitIntent);

        mBtn_CallImplicitIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               // String url="www.google.com";

                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(URL));
                startActivity(intent);
            }
        });


        mBtn_CallExplicitIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(IntentMain.this,IntentSecondActivity.class);
                startActivity(intent);

            }
        });
    }

}
