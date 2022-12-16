package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MultiplyImplement implements Multiply{
    @Override
    public int mult(int number1, int number2) {
        return number1 * number2;
    }
}
