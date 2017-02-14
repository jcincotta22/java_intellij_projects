package com.pluralsight.CalcEngine;

/**
 * Created by Jscincotta on 2/14/17.
 */
public class Divider extends CalculateBase {

    public Divider() {}
    public Divider(double leftVal, double rightVal){
        super(leftVal, rightVal);
    }
    @Override
    public void calculate(){
        double value = getLeftVal() / getrightVal();
        setResult(value);
    }
}
