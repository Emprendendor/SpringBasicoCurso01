package com.spring.SpringBasicoCurso01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.SpringBasicoCurso01.beans.HelloService;

public class SprintTest02_IOCConfiguration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
	 

	        
	        AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfiguration.class);
	        
	        
	        
	        HelloService   h  = ctx.getBean("saludaService", HelloService.class );
	       
	        		
	        h.Saludar();
	        
	        for (String bean_name : ctx.getBeanDefinitionNames()) {
	            System.out.println(":: " + bean_name);
	        }
	        
	        
	        
	        
	        
	        SpringConfiguration  springConfiguration = (SpringConfiguration)ctx.getBean("springConfiguration");
	        springConfiguration.Imprimir();
	        
	        ctx.close();
	      
	        		
	        		
	        
	  
	}

}
