package es.pildoras.pruebaannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		
		//ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		// Leer el class de configuracion
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		// pedir el bean al contenedor-
		/*Empleados Antonio= contexto.getBean("comercialExperimentado", Empleados.class);
		Empleados Juan= contexto.getBean("comercialExperimentado", Empleados.class);
		if(Antonio == Juan) {
			System.out.println("Apuntan al mismo lugar en memoria");
			System.out.println(Antonio +"\n"+ Juan);
		}
		else {
			System.out.println("No apuntan al mismo lugar de memoria");
			System.out.println(Antonio +"\n"+ Juan);
		}*/
		Empleados empleado = contexto.getBean("directorFinanciero", Empleados.class);
		System.out.println(empleado.getTareas());
		System.out.println(empleado.getInforme());
			contexto.close();
	}

}
