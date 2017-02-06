import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoolHilos {

	public static void main(String[] args) {
		int nProcesadores = Runtime.getRuntime().availableProcessors();
		//System.out.println(nProcesadores);
		ExecutorService executor = Executors.newFixedThreadPool(nProcesadores);
		for (int i = 0; i < 20; i++){
			Runnable worker = new HilosParaPool(i);
            executor.execute(worker);
		}
		executor.shutdown();
	}

}
class HilosParaPool extends Thread {
	private int numero;

	public HilosParaPool(int numero) {
		super();
		this.numero = numero;
	}

	@Override
	public void run() {
		System.out.println("Arrancando hilo: " + numero);
		try {
			Thread.sleep((long) (Math.random() * 3_000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("Acabado hilo: " + numero);
		}
	}
	
}