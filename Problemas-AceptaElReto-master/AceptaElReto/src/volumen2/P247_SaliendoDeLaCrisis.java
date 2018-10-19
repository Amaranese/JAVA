package volumen2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P247_SaliendoDeLaCrisis {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		String nStr;
		while(!(nStr = reader.readLine()).equals("0")){
			int n = Integer.parseInt(nStr);
			String[] numbers = reader.readLine().split(" ");
			boolean grows = true;
			int prev = Integer.parseInt(numbers[0]);
			for (int i = 1; i < n && grows; i++) {
				int current = Integer.parseInt(numbers[i]);
				grows = current > prev;
				prev = current;
			}
			System.out.println(grows ? "SI" : "NO");
		}
	}

}
