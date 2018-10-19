package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class SieveOfEratostenes {

	boolean[] numbers;
	int size;

	public SieveOfEratostenes(int n) {
		numbers = new boolean[n];
		numbers[0] = true;
		size = n - 1; // 1
	}

	public SieveOfEratostenes sieve() {
		int endI = (int) Math.sqrt(numbers.length);
		for (int i = 2; i <= endI; i++) {
			if (!numbers[i - 1]) {
				int endJ = numbers.length / i;
				for (int j = i; j <= endJ; j++) {
					if (!numbers[i * j - 1]) {
						numbers[i * j - 1] = true;
						size--;
					}
				}
			}
		}
		return this;
	}

	public int size() {
		return size;
	}

}

public class P107_AproximacionDeGauss {

	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		String line;
		while (!(line = reader.readLine()).equals("0 0")) {
			String[] values = line.split(" ");
			int n = Integer.parseInt(values[0]);
			// double error = Math.abs((double) new SieveOfEratostenes(n).sieve().size() /
			// (double) n - (1 / Math.log(n)));
			// double maxError = 1 / Math.pow(10, Integer.parseInt(values[1]));
			double error = Math.abs(new SieveOfEratostenes(n).sieve().size() - (n / Math.log(n)));
			double maxError = n / Math.pow(10, Integer.parseInt(values[1]));
			if (error > maxError) {
				System.out.println("Mayor");
			} else if (error == maxError) {
				System.out.println("Igual");
			} else {
				System.out.println("Menor");
			}
		}

	}

}
