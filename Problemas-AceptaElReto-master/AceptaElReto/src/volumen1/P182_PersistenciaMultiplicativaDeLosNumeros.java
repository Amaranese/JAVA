package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P182_PersistenciaMultiplicativaDeLosNumeros {

	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(entrada.readLine());
		for (int i = 0; i < n; i++) {
			String numeroStr = entrada.readLine();
			int persistencia = 0;
			while(numeroStr.length() > 1){
				int numero = 1;
				for (int j = 0; j < numeroStr.length(); j++) {
					numero *= Character.getNumericValue(numeroStr.charAt(j));
				}
				numeroStr = Integer.toString(numero);
				persistencia++;
			}
			System.out.println(persistencia);
		}
	}

}
