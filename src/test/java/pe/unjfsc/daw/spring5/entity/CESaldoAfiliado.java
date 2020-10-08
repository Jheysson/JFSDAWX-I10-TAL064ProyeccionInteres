package pe.unjfsc.daw.spring5.entity;

public class CESaldoAfiliado {
	private String id;
	private String codigoAfiliado;
	private double saldoCIC;
	
	public CESaldoAfiliado() {
		
	}
	

	public CESaldoAfiliado(String id, String codigoAfiliado, double saldoCIC) {
		super();
		this.id = id;
		this.codigoAfiliado = codigoAfiliado;
		this.saldoCIC = saldoCIC;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCodigoAfiliado() {
		return codigoAfiliado;
	}

	public void setCodigoAfiliado(String codigoAfiliado) {
		this.codigoAfiliado = codigoAfiliado;
	}

	public double getSaldoCIC() {
		return saldoCIC;
	}

	public void setSaldoCIC(double saldoCIC) {
		this.saldoCIC = saldoCIC;
	}

	@Override
	public String toString() {
		return "CESaldoAfiliado [id=" + id + ", codigoAfiliado=" + codigoAfiliado + ", saldoCIC=" + saldoCIC + "]";
	}

	
}
