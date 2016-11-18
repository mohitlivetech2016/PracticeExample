package com.example.mohit.practiceexample.factorymethod;
//package com.example.mohit.practiceexample.factorymethod.interfaces;

import com.example.mohit.practiceexample.factorymethod.interfaces.calculate;

/**
 * Created by Android on 18-Nov-16.
 */

public class ShapeFactoryMethod {

           //use getShape method to get object of type shape
        public calculate getValue(String calculateType){
            if(calculateType == null){
                return null;
            }
            if(calculateType.equalsIgnoreCase("ADD")){
                return new add();

            } else if(calculateType.equalsIgnoreCase("Subtract")){
                return new subtract();

            } else if(calculateType.equalsIgnoreCase("Multiply")){
                return new multiply();

            } else if(calculateType.equalsIgnoreCase("Divided")){
                return new divided();
            }

            return null;
        }
    }

