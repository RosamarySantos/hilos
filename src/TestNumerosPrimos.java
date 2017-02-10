import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestNumerosPrimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long inicio = System.currentTimeMillis();
		ExecutorService executor = Executors.newFixedThreadPool(26);
		            
		try (Scanner in = new Scanner(new File("numeros_primos.txt"));){
			while (in.hasNextLong()){
				//imprimirSiEsPrimo(in.nextLong());
				Runnable worker = new Primo(in.nextLong());
				executor.execute(worker);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		executor.shutdown();
		while ( !executor.isTerminated() ) {}
		long fin = System.currentTimeMillis();
		System.out.println("TIEMPO DE EJECUCION: " + (fin -inicio) + " milisegundos");

	}
	public static void imprimirSiEsPrimo(long numero) {
		boolean esPrimo = false;
		if (numero <= 3) {
			esPrimo = numero > 1;
		} else if (numero % 2 == 0 || numero % 3 == 0) {
			esPrimo = false;
		} else {
			for (long i = 5; i * i <= numero; i += 6) {
			if (numero % i == 0 || numero % (i + 2) == 0) {
				esPrimo = false;
			}
			}
			esPrimo = true;
		}
		if (esPrimo)
			System.out.println(numero + " SI es primo");
		else
			System.out.println(numero + " NO es primo");

	}

}
class Primo implements Runnable {
	private long numero;
	
	public Primo(long valor) {
		
		this.numero = valor;
	}

	@Override
	public void run() {
		boolean esPrimo = false;
		if (numero <= 3) {
			esPrimo = numero > 1;
		} else if (numero % 2 == 0 || numero % 3 == 0) {
			esPrimo = false;
		} else {
			for (long i = 5; i * i <= numero; i += 6) {
			if (numero % i == 0 || numero % (i + 2) == 0) {
				esPrimo = false;
			}
			}
			esPrimo = true;
		}
		if (esPrimo)
			System.out.println(numero + " SI es primo");
		else
			System.out.println(numero + " NO es primo");

		
	}
	
}






