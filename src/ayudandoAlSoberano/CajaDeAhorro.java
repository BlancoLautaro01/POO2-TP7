package ayudandoAlSoberano;

public class CajaDeAhorro extends CuentaBancaria {
	
	//Clase Concreta
	private int limite;
	
	public CajaDeAhorro(String titular, int limite){
		super(titular);
		this.limite=limite;
	}
	
	public int getLimite(){
		return this.limite;
	}
	
	//Operacion concreta
	@Override
	public boolean condicionParaExtraer(int monto) {
		return (this.getSaldo() >= monto && this.getLimite() >= monto);
	}
}
