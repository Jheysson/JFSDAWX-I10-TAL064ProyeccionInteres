package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.entity.CEMeses;
import pe.unjfsc.daw.spring5.entity.CESaldoAfiliado;
import pe.unjfsc.daw.spring5.model.CDLoadData;

public class CV01RevisionContext {
	private static final Logger log = LoggerFactory.getLogger("CV01RevisionContext");
	
	public static void main(String[] args) {
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context-proyeccion-interes.xml");
		
		CEMeses oCEMeses = oCntx.getBean(CEMeses.class);
		log.info("[EVL] CESMeses: {}", oCEMeses);
		
		CESaldoAfiliado oCESaldo = oCntx.getBean(CESaldoAfiliado.class);
		log.info("[EVL] CESMeses: {}", oCESaldo);
		
		CDLoadData oCDLoadData = oCntx.getBean(CDLoadData.class);
		log.info("[EVL] CESMeses: {}", oCDLoadData);
		
		((ConfigurableApplicationContext) oCntx).close();
	}
}
