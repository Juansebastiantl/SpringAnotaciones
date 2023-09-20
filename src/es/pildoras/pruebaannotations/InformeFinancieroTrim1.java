package es.pildoras.pruebaannotations;

import org.springframework.stereotype.Component;

@Component
public class InformefinancieroTrim1 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Presentacion de informe financiero del trimestre 1";
	}

}
