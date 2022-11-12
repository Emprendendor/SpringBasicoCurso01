package com.spring.SpringBasicoCurso01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.SpringBasicoCurso01.beans.Errores;
import com.spring.SpringBasicoCurso01.beans.HelloService;
import com.spring.SpringBasicoCurso01.beans.Mensajes;

public class SpringTest04_Beans {

	
	 /**
	  
	        Probando
	        
	   
	   
	  */
	
	
	
    public static void main( String[] args )
    {

        
        
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
        
        
        Mensajes  m   = ctx.getBean("miBean", Mensajes.class );
        Mensajes  m2   = ctx.getBean("miBean2", Mensajes.class );
        Mensajes  m3   = ctx.getBean("miBean3", Mensajes.class );
        Mensajes  m4   = ctx.getBean("miBean4", Mensajes.class );
        Errores   e1   = ctx.getBean("errores1",Errores.class );       	       	
        Errores    e2   = ctx.getBean("errores2",Errores.class );        
        
        System.out.println( "Ejecutando el IoC con nuestro Bean definidos sim constructor, con, propiedades ,etc"  );
        
        
        
        m.setMensaje("hola mundo");
        System.out.println( " Bean1   Mensaje " + m.getMensaje() );
        System.out.println( " Bean2   Mensaje " + m2.getMensaje() );
        System.out.println( " Bean3   Mensaje " + m3.getMensaje() );
        System.out.println( " Bean4   Mensaje " + m4.getMensaje() );        
        
        System.out.println( " Bean1   Errores " + e1.getMensajes() ); 
        
        System.out.println( " Bean1   Errores " + e2.getMensajes() );     
        System.out.println( " Bean1   Errores " + e1.getMensajes().getMensaje() ); 
        
        System.out.println( " Bean1   Errores " + e2.getMensajes().getMensaje() );      
        
        
        
        for (String bean_name : ctx.getBeanDefinitionNames()) {
            System.out.println(":: " + bean_name);
        }
        
        
        ctx.close();
      
        		
        		
        
    }
	
	
	
	
}
