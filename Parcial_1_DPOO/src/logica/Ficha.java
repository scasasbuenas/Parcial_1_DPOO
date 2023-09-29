package logica;

public abstract class Ficha {
	
	// ATRIBUTOS
	protected int espaciosPermitidos;
	
	//METODOS
	public Ficha( int espaciosPermitidos) {
		this.espaciosPermitidos = espaciosPermitidos;
	}

	public int getEspaciosPermitidos() {
		return espaciosPermitidos;
	}

	public void setEspaciosPermitidos(int espaciosPermitidos) {
		this.espaciosPermitidos = espaciosPermitidos;
	}
	
	public abstract int calcularCantidadCasillas();
	
	
}
