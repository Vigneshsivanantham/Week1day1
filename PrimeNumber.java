package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		int pr = 13;
		boolean prime = true;
		for (int i = 2; i < pr; i++) {
			if (pr % i == 0) {

				prime = false;
				break;
			}
		}

		if (prime) {
			System.out.println("Prime Number");
		}

		else {
			System.out.println("Not Prime");
		}
	}

}
