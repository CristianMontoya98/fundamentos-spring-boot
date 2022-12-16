package com.fundamentosplatzi.springboot.fundamentos;

import com.fundamentosplatzi.springboot.fundamentos.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {
	//Instancia de la dependencia (interface)
	private ComponentDependency componentDependency;
	/*Constructor de la class en dónde se inicializa la dependencia
	Igualando lo que está en la instancia de la dependencia en la linea 10
	con lo que está en el archivo de la dependencia*/
	public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency){
		this.componentDependency = componentDependency;
	}
	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	/*Ejecuta en la aplicación todo lo que se quiera y viene de CommandLineRunner*/
	public void run(String... args) {
		componentDependency.saludar();
	}
}
