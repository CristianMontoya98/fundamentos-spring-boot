package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyBeanWithDEpendencyImplement implements MyBeanWithDependency {
    private MyOperation myOperation;
    private Multiply multiply;
public MyBeanWithDEpendencyImplement(MyOperation myOperation, Multiply multiply){
    this.myOperation = myOperation;
    this.multiply = multiply;
}
    @Override
    public void printWithDependency() {
        System.out.println(multiply.mult(5,5));
        System.out.println(myOperation.sum(1));
        System.out.println("Hola desde la implementación de un bean con dependencia");
    }
}
