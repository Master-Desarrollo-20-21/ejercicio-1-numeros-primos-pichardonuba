public class primeNumber {
	
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
	
	public static int sumPrimeNumberUntil(int limitNumber) {
		int sum = 0;
		for(int i = 0; i < limitNumber; i++) {
			if(isPrime(i)) {
				sum += i;
			}
		}
		return sum;
	}
	
	public static int sumPrimeNumberCount(int limitNumber) {
		int count = 0;
		int i = 0;
		int sum = 0;
		while(limitNumber >= count) {
			if(isPrime(i)) {
				sum += i;
				count++;
			}
			i++;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(sumPrimeNumberUntil(50));
		System.out.println(sumPrimeNumberCount(50));
	}
  
}
