package sincronizacion;

public class TestBancario {

	public static void main(String[] args) {
		CuentaBancariaSincronizada cuenta =
				new CuentaBancariaSincronizada(1_000);
		int cantidad = (int) (Math.random() * 11);
		for(int i = 0; i < 100; i++ ){
			Thread hiloRetirada = new Thread(new TransaccionRetirada(cuenta, cantidad));
			hiloRetirada.start();
			cantidad = (int) (Math.random() * 11);
			Thread hiloIngreso = new TransaccionIngreso(cuenta, cantidad);
			hiloIngreso.start();
			System.out.println();
		}

	}

}
