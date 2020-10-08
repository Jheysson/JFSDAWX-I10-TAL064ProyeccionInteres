package pe.unjfsc.daw.spring5.entity;

public class CEProyeccion {
	
	private CESaldoAfiliado oCESaldo;
	private double interesCompleto;
	private double interesSinFeriado;
	private double diferenciaInteres;
	private double saldoFinal;
	public CESaldoAfiliado getoCESaldo() {
		return oCESaldo;
	}
	public void setoCESaldo(CESaldoAfiliado oCESaldo) {
		this.oCESaldo = oCESaldo;
	}
	public double getInteresCompleto() {
		return interesCompleto;
	}
	public void setInteresCompleto(double interesCompleto) {
		this.interesCompleto = interesCompleto;
	}
	public double getInteresSinFeriado() {
		return interesSinFeriado;
	}
	public void setInteresSinFeriado(double interesSinFeriado) {
		this.interesSinFeriado = interesSinFeriado;
	}
	public double getDiferenciaInteres() {
		return diferenciaInteres;
	}
	public void setDiferenciaInteres(double diferenciaInteres) {
		this.diferenciaInteres = diferenciaInteres;
	}
	public double getSaldoFinal() {
		return saldoFinal;
	}
	public void setSaldoFinal(double saldoFinal) {
		this.saldoFinal = saldoFinal;
	}
	@Override
	public String toString() {
		return "CEProyeccion [oCESaldo=" + oCESaldo + ", interesCompleto=" + interesCompleto + ", interesSinFeriado="
				+ interesSinFeriado + ", diferenciaInteres=" + diferenciaInteres + ", saldoFinal=" + saldoFinal
				+ ", getoCESaldo()=" + getoCESaldo() + ", getInteresCompleto()=" + getInteresCompleto()
				+ ", getInteresSinFeriado()=" + getInteresSinFeriado() + ", getDiferenciaInteres()="
				+ getDiferenciaInteres() + ", getSaldoFinal()=" + getSaldoFinal() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
