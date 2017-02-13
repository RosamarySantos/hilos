package sincronizacion;

public class CuentaBancaria {
	private int saldo;

	public CuentaBancaria(int saldo) {
		this.saldo = saldo;
	}
	public void retirarDinero(int cantidad){
		if ( cantidad > 0 && saldo > cantidad ){
			saldo -= cantidad;
			System.out.println("RETIRADO: " + cantidad + "  SALDO: " + saldo);
		}
	}
	public void ingresarDinero(int cantidad){
		if ( cantidad > 0 ){
			saldo += cantidad;
			System.out.println("INGRESADO: " + cantidad + "  SALDO: " + saldo);
		}	
	}
}
