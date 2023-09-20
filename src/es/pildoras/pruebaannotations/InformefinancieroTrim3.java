package es.pildoras.pruebaannotations;
import org.springframework.stereotype.Component;

@Component
public class InformefinancieroTrim3 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Trim3";
	}

}
