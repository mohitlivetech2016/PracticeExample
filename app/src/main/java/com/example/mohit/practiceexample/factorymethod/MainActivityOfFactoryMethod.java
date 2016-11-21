package com.example.mohit.practiceexample.factorymethod;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mohit.practiceexample.R;
import com.example.mohit.practiceexample.factorymethod.interfaces.calculate;

public class MainActivityOfFactoryMethod extends AppCompatActivity implements View.OnClickListener{

    protected Button mBtnAdd, mBtnSub, mBtnDiv, mBtnMul;
    protected EditText mEtFirst, mEtSecond;
    protected TextView mTvShow;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_of_factory_method);

        mBtnAdd = (Button) findViewById(R.id.id_Btn_Add);
        mBtnAdd.setOnClickListener(this);
        mBtnSub = (Button) findViewById(R.id.id_Btn_Subtract);
        mBtnSub.setOnClickListener( this);
        mBtnDiv = (Button) findViewById(R.id.id_Btn_Divide);
        mBtnDiv.setOnClickListener(this);
        mBtnMul = (Button) findViewById(R.id.id_Btn_Multiply);
         mBtnMul.setOnClickListener( this);




    }

    public void onClick(View v)
    {
        int mvalue1, mvalue2, result;
        mEtFirst = (EditText) findViewById(R.id.id_Et_FirstValue);
        mEtSecond = (EditText) findViewById(R.id.id_Et_SecondValue);
        mTvShow = (TextView) findViewById(R.id.id_Tv_ShowResult);
        String value = mEtFirst.getText().toString();
        mvalue1 = Integer.parseInt(value);

        String value1 = mEtSecond.getText().toString();
        mvalue2 = Integer.parseInt(value1);


        ShapeFactoryMethod shapeFactory = new ShapeFactoryMethod();

        if (v.getId()==R.id.id_Btn_Add)
        {
            //get an object of Circle and call its draw method.
            calculate shape1 = shapeFactory.getValue("ADD");

            //call draw method of Circle
           result= shape1.calculateValue(mvalue1, mvalue2);
            Toast.makeText(getApplicationContext(), "Your Answer" +result,  Toast.LENGTH_SHORT).show();
        }
        else if(v.getId()==R.id.id_Btn_Subtract)
        {
            //get an object of Rectangle and call its draw method.
            calculate shape2 = shapeFactory.getValue("Subtract");

            //call draw method of Rectangle
            result= shape2.calculateValue(mvalue1, mvalue2);

            Toast.makeText(getApplicationContext(), "Your Answer " +result,  Toast.LENGTH_SHORT).show();
          //  Toast.makeText(MainActivityOfFactoryMethod.this,result1, Toast.LENGTH_SHORT).show();

        }
        else if(v.getId()==R.id.id_Btn_Divide)
        {

            //get an object of Square and call its draw method.
            calculate shape3 = shapeFactory.getValue("Divided");

            //call draw method of circle
            result= shape3.calculateValue(mvalue1, mvalue2);
            Toast.makeText(getApplicationContext(), "Your Answer " +result,  Toast.LENGTH_SHORT).show();
        }
        else if(v.getId()==R.id.id_Btn_Multiply)
        {

            //get an object of Square and call its draw method.
            calculate shape4 = shapeFactory.getValue("Multiply");

            //call draw method of circle
            result= shape4.calculateValue(mvalue1, mvalue2);
            Toast.makeText(getApplicationContext(), "Your Answer " +result,  Toast.LENGTH_SHORT).show();
            Toast.makeText(getApplicationContext(), "Your Answer " +result,  Toast.LENGTH_SHORT).show();
        }


    }
}