package com.example.mohit.practiceexample.factorymethod;
//package com.example.mohit.practiceexample.factorymethod.interfaces;

import com.example.mohit.practiceexample.factorymethod.interfaces.Calculate;

/**
 * Created by Android on 18-Nov-16.
 */

public class Objects {

           //use getShape method to get object of type shape
        public Calculate getValue(String calculateType){
            if(calculateType == null){
                return null;
            }
            if(calculateType.equalsIgnoreCase("ADD")){
                return new Add();

            } else if(calculateType.equalsIgnoreCase("Subtract")){
                return new Subtract();

            } else if(calculateType.equalsIgnoreCase("Multiply")){
                return new Multiply();

            } else if(calculateType.equalsIgnoreCase("Divided")){
                return new Divided();
            }

            return null;
        }
    }

