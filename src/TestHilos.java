
public class TestHilos {

	public static void main(String[] args) {
		System.out.println("Comienzo del hilo principal");
		Thread t1 = new Hilos("HILO 1");
		Thread t2 = new Hilos("HILO 2");
		t1.setDaemon(true); t2.setDaemon(true);
		t1.start(); t2.start();
		try {
			Thread.sleep(10_000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("Finalizando del hilo principal");
		}

	}

}
class Hilos extends Thread {
	private String nombre;

	public Hilos(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public void run() {
		while(true){
			System.out.println("En el hilo: " + nombre);
			try {
				Thread.sleep(1_000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}