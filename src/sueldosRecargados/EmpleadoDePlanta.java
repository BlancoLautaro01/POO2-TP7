package sueldosRecargados;

public class EmpleadoDePlanta extends Empleado {
	
	//Concrete Class (MyApplication)
	private int cantHijos;
	
	//Constructor
	public EmpleadoDePlanta(int cantHijos) {
		super();
		this.cantHijos(cantHijos);
	}

	//Getters y Setters
	public int getCantHijos() {
		return cantHijos;
	}

	public void cantHijos(int cantHijos) {
		this.cantHijos = cantHijos;
	}
	
	//Implementacion
	@Override
	protected double calcularSueldo() {
		return ( 3000 + (150 * this.getCantHijos()) );
	}	
}
