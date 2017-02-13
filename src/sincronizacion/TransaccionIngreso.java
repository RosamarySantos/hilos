package sincronizacion;

public class TransaccionIngreso extends Thread {
	CuentaBancariaSincronizada cuenta;
	int cantidad;
	public TransaccionIngreso(CuentaBancariaSincronizada cuenta, int cantidad) {
		super();
		this.cuenta = cuenta;
		this.cantidad = cantidad;
	}
	@Override
	public void run() {
		cuenta.ingresarDinero(cantidad);
		try {
			Thread.sleep((long) (Math.random() * 3_000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
