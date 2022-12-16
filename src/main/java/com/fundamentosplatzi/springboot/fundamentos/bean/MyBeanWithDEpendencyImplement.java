package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyBeanWithDEpendencyImplement implements MyBeanWithDependency {
    private MyOperation myOperation;
public MyBeanWithDEpendencyImplement(MyOperation myOperation){
    this.myOperation = myOperation;

}
    @Override
    public void printWithDependency() {
        System.out.println(myOperation.sum(1));
        System.out.println("Hola desde la implementación de un bean con dependencia");
    }
}
