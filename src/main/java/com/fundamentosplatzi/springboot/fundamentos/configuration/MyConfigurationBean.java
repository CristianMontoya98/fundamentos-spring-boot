package com.fundamentosplatzi.springboot.fundamentos.configuration;

import com.fundamentosplatzi.springboot.fundamentos.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @Bean
    public MyBean beanOperation(){
        return new MyBean2Implement();

    }
    @Bean
    public MyOperation beanOperation2(){
        return new MyOperationImplement();
    }
    @Bean
    public Multiply beanMultiplication(){
        return new MultiplyImplement();
    }
    @Bean
    public MyBeanWithDependency beanOperationsum(MyOperation myOperation, Multiply multiply){
        return new MyBeanWithDEpendencyImplement(myOperation, multiply);
    }
}
