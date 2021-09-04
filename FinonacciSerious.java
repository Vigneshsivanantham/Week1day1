package week1.day1;

public class FinonacciSerious {

	public static void main(String[] args) {
		int a = 0, b = 1;

		for (int sum = 0; a < 20; sum++) {

			{
				System.out.println(" " + a);
				sum = a + b;
				a = b;
				b = sum;

			}
		}

	}

}
