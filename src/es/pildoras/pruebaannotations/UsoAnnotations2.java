package es.pildoras.pruebaannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		// pedir el bean al contenedor-
		Empleados Antonio= contexto.getBean("comercialExperimentado", Empleados.class);
		Empleados Juan= contexto.getBean("comercialExperimentado", Empleados.class);
		if(Antonio == Juan) {
			System.out.println("Apuntan al mismo lugar en memoria");
			System.out.println(Antonio +"\n"+ Juan);
		}
		else {
			System.out.println("No apuntan al mismo lugar de memoria");
			System.out.println(Antonio +"\n"+ Juan);
		}

	}

}
