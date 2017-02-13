package sincronizacion;

public class CuentaBancariaSincronizada {
	private int saldo;

	public CuentaBancariaSincronizada(int saldo) {
		this.saldo = saldo;
	}
	public synchronized void  retirarDinero(int cantidad){
		if ( cantidad > 0 && saldo > cantidad ){
			saldo -= cantidad;
			System.out.println("RETIRADO: " + cantidad + "  SALDO: " + saldo);
		}
	}
	public synchronized void ingresarDinero(int cantidad){
		if ( cantidad > 0 ){
			saldo += cantidad;
			System.out.println("INGRESADO: " + cantidad + "  SALDO: " + saldo);
		}	
	}
}
