package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P161_CalculoDeLaMediana {

	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		String nStr;
		while (!(nStr = entrada.readLine()).equals("0")) {
			int n = Integer.parseInt(nStr);
			String[] numerosStr = entrada.readLine().split(" ");
			int[] numeros = new int[n];
			for (int i = 0; i < numeros.length; i++) {
				numeros[i] = Integer.parseInt(numerosStr[i]);
			}
			Arrays.sort(numeros);
			int mitad = n / 2;
			System.out.println(n % 2 == 0 ? numeros[mitad] + numeros[mitad - 1] : numeros[mitad] * 2);
		}
	}

}
