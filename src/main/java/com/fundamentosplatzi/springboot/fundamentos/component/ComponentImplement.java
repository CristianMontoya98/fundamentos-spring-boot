package com.fundamentosplatzi.springboot.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
//Clase que implementa la interface (Dependencia) ComponentDependency
public class ComponentImplement implements ComponentDependency {
    @Override
    //Método definido en la interfaz que se sobre escribe
    public void saludar() {
        System.out.println("Hola desde mi componente");
    }
}
