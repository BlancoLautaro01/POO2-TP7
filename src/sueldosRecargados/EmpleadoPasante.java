package sueldosRecargados;

public class EmpleadoPasante extends Empleado {
	
	//Concrete Class (MyApplication)
	private int horasTrabajadas;
	
	//Constructor
	public EmpleadoPasante(int horasTrabajadas) {
		super();
		this.setHorasTrabajadas(horasTrabajadas);
	}

	//Getters y Setters
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
	//Implementacion
	@Override
	protected double calcularSueldo() {
		return 40 * this.getHorasTrabajadas();
	}	
}
