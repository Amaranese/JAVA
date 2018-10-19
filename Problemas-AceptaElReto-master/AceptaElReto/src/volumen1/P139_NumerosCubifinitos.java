package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P139_NumerosCubifinitos {

	private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		String numero;
		while (!(numero = entrada.readLine()).equals("0")) {
			StringBuilder salida = new StringBuilder(1000);
			List<String> cubos = new ArrayList<>();
			cubos.add(numero);
			while (!numero.equals("1")) {
				salida.append(numero);
				int sumaCubos = 0;
				for (int i = 0; i < numero.length(); i++) {
					sumaCubos += (int) Math.pow(Character.getNumericValue(numero.charAt(i)), 3);
				}
				salida.append(" - ");
				String suma = Integer.toString(sumaCubos);
				numero = suma;
				if (cubos.contains(suma)) {
					break;
				}
				cubos.add(suma);
			}
			salida.append(numero + " -> ");
			if (numero.equals("1")) {
				salida.append("cubifinito.");
			} else {
				salida.append("no cubifinito.");
			}
			System.out.println(salida);
		}
	}

}
