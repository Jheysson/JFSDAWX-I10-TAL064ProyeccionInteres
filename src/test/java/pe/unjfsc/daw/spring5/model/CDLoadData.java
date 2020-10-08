package pe.unjfsc.daw.spring5.model;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.daw.spring5.entity.CEMeses;
import pe.unjfsc.daw.spring5.entity.CESaldoAfiliado;

public class CDLoadData {
	private static final Logger log = LoggerFactory.getLogger("CDLoadData");
	
	private ArrayList<CEMeses> oRequestListMeses;
	private  List<CESaldoAfiliado> oRequestListAfiliado;
	
	
	public CDLoadData() {
		oRequestListMeses = beginMeses();
		oRequestListAfiliado = beginSaldoAfiliado();
		log.info("[]Numero de meses: {}", oRequestListMeses.size());
		log.info("[]Numero de Afiliados: {}", oRequestListAfiliado.size());
		
	}protected ArrayList<CEMeses> beginMeses(){
		ArrayList<CEMeses> oListMeses = new ArrayList<>();
		
		oListMeses.add(new CEMeses(1, "ENERO", 31, 1, 0.5));
		oListMeses.add(new CEMeses(2, "FEBRERO", 31, 1, 0.5));
		oListMeses.add(new CEMeses(3, "MARZO", 31, 1, 0.5));
		oListMeses.add(new CEMeses(4, "ABRIL", 31, 1, 0.5));
		oListMeses.add(new CEMeses(5, "MAYO", 31, 1, 0.5));
		oListMeses.add(new CEMeses(6, "JUNIO", 31, 1, 0.5));
		oListMeses.add(new CEMeses(7, "JULIO", 31, 1, 0.5));
		oListMeses.add(new CEMeses(8, "AGOSTO", 31, 1, 0.5));
		oListMeses.add(new CEMeses(9, "SEPTIEMBRE", 31, 1, 0.5));
		oListMeses.add(new CEMeses(10, "OCTUBRE", 31, 1, 0.057));
		oListMeses.add(new CEMeses(11, "NOVIEMBRE", 31, 1, 0.0586));
		oListMeses.add(new CEMeses(12, "DICIEMBRE", 31, 1, 0.5));

		
		return oListMeses;
		
	}
	protected List<CESaldoAfiliado> beginSaldoAfiliado(){
				
		List<CESaldoAfiliado> oListSaldo = new ArrayList<>();
		
		oListSaldo.add(new CESaldoAfiliado("A8398", "Aportante 1", 189.78));
		oListSaldo.add(new CESaldoAfiliado("A8399", "Aportante 2", 3485.43));
		oListSaldo.add(new CESaldoAfiliado("A8497", "Aportante 3", 8728023.98));
		oListSaldo.add(new CESaldoAfiliado("A8697", "Aportante 4", 8475.878));
		oListSaldo.add(new CESaldoAfiliado("A8897", "Aportante 5", 4509.9));
		oListSaldo.add(new CESaldoAfiliado("B9893", "Aportante 6", 0.99));
		oListSaldo.add(new CESaldoAfiliado("C9483", "Aportante 7", 847.74));
		oListSaldo.add(new CESaldoAfiliado("D9842", "Aportante 8", 173647.94));
		oListSaldo.add(new CESaldoAfiliado("E8484", "Aportante 9", 2000048.4));
		oListSaldo.add(new CESaldoAfiliado("F8483", "Aportante 10", 94849.86));
		

		return oListSaldo;
	}
}
