package es.pildoras.pruebaannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("ComercialExperimentado")
@Component
public class ComercialExperimentado implements Empleados {

	
	private CreacionInformeFinanciero nuevoinforme;
	
	@Autowired
	public ComercialExperimentado(CreacionInformeFinanciero nuevoinforme) {
		super();
		this.nuevoinforme = nuevoinforme;
	}

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
