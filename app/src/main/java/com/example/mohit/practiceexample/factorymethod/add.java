package com.example.mohit.practiceexample.factorymethod;

import com.example.mohit.practiceexample.factorymethod.interfaces.Calculate;

/**
 * Created by Android on 18-Nov-16.
 */

public class Add implements Calculate {

    int value1,value2,result;
    @Override
    public int calculateValue(int value1,int value2) {

       // this.value1=value1;
       // this.value2=value2;

        result=value1+value2;
        return result ;
    }
}
