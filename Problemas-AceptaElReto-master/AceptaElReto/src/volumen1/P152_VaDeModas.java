package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class P152_VaDeModas {

	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	static String cero = "0";
	static StringBuilder salida = new StringBuilder(10000);

	public static void main(String[] args) throws NumberFormatException, IOException {
		String valor;
		while (!(valor = entrada.readLine()).equals(cero)) {
			Map<String, Integer> frecuencias = new HashMap<>(Integer.parseInt(valor));
			StringTokenizer tokenizer = new StringTokenizer(entrada.readLine());
			while (tokenizer.hasMoreTokens()) {
				String numero = tokenizer.nextToken();
				Integer frecuencia = frecuencias.get(numero);
				if (frecuencia == null) {
					frecuencias.put(numero, 1);
				} else {
					frecuencias.replace(numero, frecuencia, frecuencia + 1);
				}
			}
			String moda = "";
			int mayorFrecuencia = -1;
			Set<String> numeros = frecuencias.keySet();
			for (String numero : numeros) {
				int frecuencia = frecuencias.get(numero);
				if (frecuencia > mayorFrecuencia) {
					moda = numero;
					mayorFrecuencia = frecuencia;
				}
			}
			salida.append(moda).append('\n');
		}
		System.out.print(salida);
	}

}
