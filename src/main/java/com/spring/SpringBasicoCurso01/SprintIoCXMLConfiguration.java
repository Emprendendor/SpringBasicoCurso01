package com.spring.SpringBasicoCurso01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.SpringBasicoCurso01.beans.HelloService;

public class SprintIoCXMLConfiguration {

	
	
	
	
    public static void main( String[] args )
    {
        System.out.println( "Ejecutando el IoC con nuestro Bean HelloService  con XML  y  @Configuration "  );
        
        
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("springXMLConfigConfiguration.xml");
        
        
        HelloService   h  = ctx.getBean("saludaService", HelloService.class );
        	
        		
        h.Saludar();
        
        
        ctx.close();
      
        		
        		
        
    }
	
	
	
	
}
