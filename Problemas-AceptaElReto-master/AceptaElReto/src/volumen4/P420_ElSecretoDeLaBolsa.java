package volumen4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P420_ElSecretoDeLaBolsa {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		int n = Integer.parseInt(reader.readLine());
		for (int i = 0; i < n; i++) {
			String[] values = reader.readLine().split(" ");
			int checksum = Integer.parseInt(values[0]);
			int[] numbers = new int[values[1].length()];
			for (int j = 0; j < numbers.length; j++) {
				numbers[j] = Character.getNumericValue(values[1].charAt(j));
			}
			int j = 0;
			int k = 0;
			int sum = 0;
			int count = 0;
			while (j < numbers.length) {
				if (sum < checksum) {
					if (k < numbers.length) {
						sum += numbers[k];
						k++;
					} else {
						j = numbers.length;
					}
				} else {
					if (sum == checksum) {
						count++;
					}
					sum -= numbers[j];
					j++;
				}
			}
			System.out.println(count);
		}
	}

}
