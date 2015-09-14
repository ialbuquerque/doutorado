package com.company;

/**
 * Created by isa on 9/14/15.
 */
public class Calculator {
    private int divisor;
    private float value;

    public void add(String valueAsString) {
        float valueAsFloat = transformValueFromStringToInt(valueAsString);
        value += valueAsFloat;
    }

    private float transformValueFromStringToInt(String valueAsString) {
        return Float.parseFloat(valueAsString);
    }
    
    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    public float calculateAverage() {
        return value/divisor;
    }
}
