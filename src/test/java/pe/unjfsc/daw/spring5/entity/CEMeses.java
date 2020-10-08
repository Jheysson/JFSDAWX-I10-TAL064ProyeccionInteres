package pe.unjfsc.daw.spring5.entity;

public class CEMeses {
	private int idMes;
	private String nombreMes;
	private int numeroDiasMes;
	private int cantidadFeriado;
	private double tasaInteres;
	public CEMeses() {
		
	}
	
	public CEMeses(int idMes, String nombreMes, int numeroDiasMes, int cantidadFeriado, double tasaInteres) {
		super();
		this.idMes = idMes;
		this.nombreMes = nombreMes;
		this.numeroDiasMes = numeroDiasMes;
		this.cantidadFeriado = cantidadFeriado;
		this.tasaInteres = tasaInteres;
	}


	public int getIdMes() {
		return idMes;
	}
	public void setIdMes(int idMes) {
		this.idMes = idMes;
	}
	public String getNombreMes() {
		return nombreMes;
	}
	public void setNombreMes(String nombreMes) {
		this.nombreMes = nombreMes;
	}
	public int getNumeroDiasMes() {
		return numeroDiasMes;
	}
	public void setNumeroDiasMes(int numeroDiasMes) {
		this.numeroDiasMes = numeroDiasMes;
	}
	public int getCantidadFeriado() {
		return cantidadFeriado;
	}
	public void setCantidadFeriado(int cantidadFeriado) {
		this.cantidadFeriado = cantidadFeriado;
	}
	public double getTasaInteres() {
		return tasaInteres;
	}
	public void setTasaInteres(double tasaInteres) {
		this.tasaInteres = tasaInteres;
	}
	
	
}
