
public class TestEjemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new ClaseConHilos("AAAAAAAAAAAAAAA");
		Thread t2 = new ClaseConHilos("BBBBBBBBBBBBBBB");
		Thread t3 = new ClaseConHilos("CCCCCCCCCCCCCCC");
		Thread t4 = new ClaseConHilos("DDDDDDDDDDDDDDD");
		t1.start(); t2.start(); t3.start();t4.start();


	}

}
class ClaseConHilos extends Thread{
	private String nombre;

	public ClaseConHilos(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5_000; i++)
			System.out.print(nombre+"\t");
	}
	
}