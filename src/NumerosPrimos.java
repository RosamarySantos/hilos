
public class NumerosPrimos {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long numero =  12111111111111L;
			System.out.println("es primo: "+numero+" "+isPrime(numero));
		}
		public static boolean isPrime(long n) {
			if (n <= 3) {
				return n > 1;
			} else if (n % 2 == 0 || n % 3 == 0) {
				return false;
			} else {
				for (long i = 5; i * i <= n; i += 6) {
					if (n % i == 0 || n % (i + 2) == 0) {
						return false;
					}
				}
				return true;
			}
		}
}
