package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P138_CerosFactorial {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static StringBuilder out = new StringBuilder();

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			int ceros = 0;
			while(num > 0){
				ceros += num / 5;
				num = num / 5;
			}
			out.append(ceros + "\n");
		}
		System.out.print(out.toString());
	}

}
