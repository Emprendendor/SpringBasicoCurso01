package com.spring.SpringBasicoCurso01.beans;

import org.springframework.stereotype.Service;

//  USamos anotaciones con Service


@Service("saludaService")
public class HelloServiceImpl implements HelloService {

	@Override
	public void Saludar() {
		// TODO Auto-generated method stub

		System.out.println("Hola  Mundo");
		
	}

}
