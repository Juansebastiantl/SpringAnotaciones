package es.pildoras.pruebaannotations;
import org.springframework.stereotype.Component;

@Component
public class InformefinancieroTrim2 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Presentacion de informe catastrofico informe2";
	}

}
