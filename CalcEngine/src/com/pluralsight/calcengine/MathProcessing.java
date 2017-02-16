package com.pluralsight.calcengine;

/**
 * Created by Jscincotta on 2/16/17.
 */
public interface MathProcessing {
    String SEPARATOR = " ";
    String getKeyword(); // add
    char getSymbol();
    double doCalculation(double leftVal, double rightVal);
}
