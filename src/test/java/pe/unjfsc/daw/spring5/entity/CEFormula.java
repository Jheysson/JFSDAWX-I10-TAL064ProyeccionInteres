package pe.unjfsc.daw.spring5.entity;

public class CEFormula {
	private double tasa;
	private int plazo;
	private double factor;
	
	public double getTasa() {
		return tasa;
	}
	public void setTasa(double tasa) {
		this.tasa = tasa;
	}
	public int getPlazo() {
		return plazo;
	}
	public void setPlazo(int plazo) {
		this.plazo = plazo;
	}
	public double getFactor() {
		return factor;
	}
	public void setFactor(double factor) {
		this.factor = factor;
	}
	@Override
	public String toString() {
		return "CEFormula [tasa=" + tasa + ", plazo=" + plazo + ", factor=" + factor + "]";
	}
	
	
}
