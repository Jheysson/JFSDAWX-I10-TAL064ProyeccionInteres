package pe.unjfsc.daw.spring5.entity;

public class CEAfiliado {
	private int codiAfil;
	private String afiliado;
	private double saldoAfil;
	
	public int getCodiAfil() {
		return codiAfil;
	}
	public void setCodiAfil(int codiAfil) {
		this.codiAfil = codiAfil;
	}
	public String getAfiliado() {
		return afiliado;
	}
	public void setAfiliado(String afiliado) {
		this.afiliado = afiliado;
	}
	public double getSaldoAfil() {
		return saldoAfil;
	}
	public void setSaldoAfil(double saldoAfil) {
		this.saldoAfil = saldoAfil;
	}
	@Override
	public String toString() {
		return "CEAfiliado [codiAfil=" + codiAfil + ", afiliado=" + afiliado + ", saldoAfil=" + saldoAfil + "]";
	}
	
}
