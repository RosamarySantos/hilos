
public class Numeros {

	public static void main(String[] args) {
		Digito d1 = new Digito();
		Digito d2 = new Digito();
		Digito d3 = new Digito();
		Digito d4 = new Digito();

		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(d2);
		Thread t3 = new Thread(d3);
		Thread t4 = new Thread(d4);
		
		t1.start(); t2.start(); t3.start(); t4.start();
		try {
			t1.join(); t2.join(); t3.join();t4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println( "La suma vale: " + ( d1.getSuma() + d2.getSuma() + 
				d3.getSuma() + d4.getSuma() ) );
		System.out.println("Fin del hilo principal");
	}

}
class Digito implements Runnable{
	private long suma = 0;
	@Override
	public void run() {
		for (long i = 0; i < 100_000_000; i++)
			suma += i;
	}
	public long getSuma() {
		return suma;
	}
	
}