public class numberPrime {
	
	public static boolean isPrime(int number) {
		for(int i = 2; i < number; i++) {
			if(number % i == 0) {
				return false;
			}
		}
		if(number == 1) {
			return false;
		}
		return true;
	}
	
	public static int sumPrimeNumber(int limitNumnber) {
		int sum = 0;
		for(int i = 0; i < limitNumnber; i++) {
			if(isPrime(i)) {
				sum += i;
			}
		}
		return sum;
	}
	
	public static int sumPrimeNumberAndNoPrimeNumber(int limitNumnber) {
		int count = 0;
		int i = 0;
		int sum = 0;
		while(limitNumnber >= count) {
			if(isPrime(i)) {
				sum += i;
				count++;
			}
			i++;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(sumPrimeNumber(50));
		System.out.println(sumPrimeNumberAndNoPrimeNumber(50));
	}
  
}
