package com.pluralsight.calcengine;

/**
 * Created by Jscincotta on 2/14/17.
 */
public class Adder extends CalculateBase {
    public Adder(){}
    public Adder(double leftVal, double rightVal){
        super(leftVal, rightVal);
    }

    @Override
    public void calculate(){
        double value = getLeftVal() + getrightVal();
        setResult(value);
    }

}
