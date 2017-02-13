package sincronizacion;

public class TransaccionRetirada implements Runnable {
	CuentaBancariaSincronizada cuenta;
	int cantidad;
	
	public TransaccionRetirada(CuentaBancariaSincronizada cuenta, int cantidad) {
		
		this.cuenta = cuenta;
		this.cantidad = cantidad;
	}

	@Override
	public void run() {
		cuenta.retirarDinero(cantidad);
		try {
			Thread.sleep((long) (Math.random() * 3_000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
