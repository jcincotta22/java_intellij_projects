package com.pluralsight.calcengine;

import com.pluralsight.calcengine.CalculateBase;

/**
 * Created by Jscincotta on 2/14/17.
 */
public class Subtracter extends CalculateBase implements MathProcessing {
    public Subtracter() {}
    public Subtracter(double leftVal, double rightVal){
        super(leftVal, rightVal);
    }
    @Override
    public void calculate(){
        double value = getLeftVal() - getrightVal();
        setResult(value);
    }

    @Override
    public String getKeyword() { return "subtract"; }

    @Override
    public char getSymbol() { return '-'; }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        setLeftVal(leftVal);
        setRightVal(rightVal);
        calculate();

        return getResult();
    }

}
