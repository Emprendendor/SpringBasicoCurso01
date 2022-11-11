package com.spring.SpringBasicoCurso01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.SpringBasicoCurso01.beans.HelloService;
import com.spring.SpringBasicoCurso01.beans.HelloServiceImpl;

@Configuration
public class SpringConfiguration {

	
	
	
    @Bean
    public HelloService saludaService(){
        return new HelloServiceImpl();
    }
	
	
	
	
	
	
}
