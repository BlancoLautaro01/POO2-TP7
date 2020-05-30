package sueldosRecargados;

public class EmpleadoTemporario extends Empleado {
	
	//Concrete Class (MyApplication)
	private int horasTrabajadas;
	private boolean tieneHijos, estaCasado;
	
	//Constructor
	public EmpleadoTemporario(int horasTrabajadas, boolean tieneHijos, boolean estaCasado) {
		super();
		this.setHorasTrabajadas(horasTrabajadas);
		this.setTieneHijos(tieneHijos);
		this.setEstaCasado(estaCasado);
	}

	//Getters y Setters
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public boolean tieneHijos() {
		return tieneHijos;
	}

	public void setTieneHijos(boolean tieneHijos) {
		this.tieneHijos = tieneHijos;
	}
	
	public boolean estaCasado() {
		return estaCasado;
	}

	public void setEstaCasado(boolean estaCasado) {
		this.estaCasado = estaCasado;
	}
	
	//Implementacion
	@Override
	protected double calcularSueldo() {
		double sueldo = 1000 + (5 * this.getHorasTrabajadas());
		if(this.tieneHijos() || this.estaCasado()) {
			sueldo += 100;
		}
		return sueldo;
	}	
}
