package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.entity.CEFormula;
import pe.unjfsc.daw.spring5.utility.CUInteres;

public class CV02RevisionFormula {
	private static final Logger log = LoggerFactory.getLogger("CV02RevisionFormula");
	
	public static void main(String[] args) {
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context-proyeccion-interes.xml");

		CUInteres oCUInteres = oCntx.getBean(CUInteres.class);
		log.info("[EVL] CUInteres: {}", oCUInteres);
		
		CEFormula oCEFormula = oCntx.getBean(CEFormula.class);
		log.info("[EVL] CEFormula: {}", oCEFormula);

		oCEFormula.setPlazo(30);
		oCEFormula.setTasa(0.0570);
		log.info("[EVL] Determinar Factor: {}", oCUInteres.calcularFactor(oCEFormula));
		
		((ConfigurableApplicationContext) oCntx).close();
	}
}
