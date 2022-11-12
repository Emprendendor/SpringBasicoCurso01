package com.spring.SpringBasicoCurso01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.spring.SpringBasicoCurso01.beans.HelloService;
import com.spring.SpringBasicoCurso01.beans.HelloServiceImpl;



@Configuration
// @ComponentScan("com.spring.SpringBasicoCurso01.beans")  


@PropertySource("classpath:application.properties")


public class SpringConfiguration {

	/**
	 *    Anotacion   @value    para recuperar de  un fichero de propiedades 
	 */
	
	
    @Value("${autor}")
    private String autor;
	
    @Value("${mensaje}")
    private String mensaje;
	

	/**
	 *   Clase para recuperar el fichero de propiedades
	 */
	
    
	   @Bean
	    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
	        return new PropertySourcesPlaceholderConfigurer();
	    }
	
	
	
	
    @Bean
    public HelloService saludaService(){
        return new HelloServiceImpl();
    }
	
	
    public  void Imprimir() {
    	
      System.out.print( mensaje);
    }
	
 
}
