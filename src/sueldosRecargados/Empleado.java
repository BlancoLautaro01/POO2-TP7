package sueldosRecargados;

public abstract class Empleado {

		//Clase abstracta (Application)
	
		//Template Method
		public double sueldo() {

			return this.calcularSueldo() * 0.87;
		}
		
		//Primitive Operation
		abstract double calcularSueldo();
}
