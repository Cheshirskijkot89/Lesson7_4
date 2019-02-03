package chizhenko;

public class Main {

	public static void main(String[] args) {

		double pi = 0;
		pi = Math.PI;

		for (int i = 2; i <= 11; i++) {

			getPi(i, pi);
		}

	}

	public static void getPi(int n, double value) {

		String text = String.format("%." + n + "f", value);
		System.out.println(text);
		
	}

}
