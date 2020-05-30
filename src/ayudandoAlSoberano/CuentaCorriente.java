package ayudandoAlSoberano;

public class CuentaCorriente extends CuentaBancaria {
	
	//Clase Concreta
	private int descubierto;
		
	public CuentaCorriente(String titular, int descubierto){
		super(titular);
		this.descubierto=descubierto;
	}
		
	public int getDescubierto(){
		return this.descubierto;
	}
	
	//Operacion concreta
	@Override
	public boolean condicionParaExtraer(int monto) {
		return (this.getSaldo() + this.getDescubierto() >= monto);
	}
}
