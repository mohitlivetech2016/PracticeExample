package com.example.mohit.practiceexample.intents;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mohit.practiceexample.R;

public class ShowResult extends AppCompatActivity {

   TextView mTv_Show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_result);
        Bundle b = getIntent().getExtras();
        mTv_Show=(TextView)findViewById(R.id.id_Tv_ShowResult);

        mTv_Show.setText(b.getCharSequence("value1"));

    }

}
