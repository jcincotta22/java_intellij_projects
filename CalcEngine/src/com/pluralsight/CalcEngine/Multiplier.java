package com.pluralsight.calcengine;

import com.pluralsight.calcengine.CalculateBase;

/**
 * Created by Jscincotta on 2/14/17.
 */
public class Multiplier extends CalculateBase {

    public Multiplier() {}
    public Multiplier(double leftVal, double rightVal){
        super(leftVal, rightVal);
    }
    @Override
    public void calculate(){
        double value = getLeftVal() * getrightVal();
        setResult(value);
    }
}
