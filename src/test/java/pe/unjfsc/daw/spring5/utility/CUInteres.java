package pe.unjfsc.daw.spring5.utility;

import pe.unjfsc.daw.spring5.entity.CEConstant;
import pe.unjfsc.daw.spring5.entity.CEFormula;

public class CUInteres {
	
	private CEFormula oCEResult;
	
	public CEFormula calcularFactor(CEFormula poCEFormula) {
		
		double dFactor = (Math.pow(1+poCEFormula.getTasa(), poCEFormula.getPlazo()/CEConstant.BASECALCULO)-1);
		oCEResult = poCEFormula;
		oCEResult.setFactor(dFactor);
		return oCEResult;
	}

	public void setoCEResult(CEFormula oCEResult) {
		this.oCEResult = oCEResult;
	}
	
}
