package es.pildoras.pruebaannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//@Component("ComercialExperimentado")
@Component
@Scope("prototype")
public class ComercialExperimentado implements Empleados {

	//@Autowired (Aca tambien se puede por reflexion)
	@Autowired
	@Qualifier("informefinancieroTrim2")
	private CreacionInformeFinanciero nuevoinforme;
	/*public ComercialExperimentado(){
		
	}*/
	/*@Autowired
	public ComercialExperimentado(CreacionInformeFinanciero nuevoinforme) {
		super();
		this.nuevoinforme = nuevoinforme;
	}*/
	
	//@Autowired
	/*
	public void setNuevoinforme(CreacionInformeFinanciero nuevoinforme) {
		this.nuevoinforme = nuevoinforme;
	}*/
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender, vender y vender mas";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub	
		//return "Informe generado por el comercial";
		return nuevoinforme.getInformeFinanciero();
	}

}
