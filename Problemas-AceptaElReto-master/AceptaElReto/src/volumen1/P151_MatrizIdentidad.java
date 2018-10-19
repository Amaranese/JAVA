package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P151_MatrizIdentidad {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String entrada;
		StringBuilder salida = new StringBuilder();
		boolean noIdentidad;
		while (!(entrada = br.readLine()).equals("0")) {
			noIdentidad = false;
			int n = Integer.parseInt(entrada);
			for (int f = 0; f < n; f++) {
				String fila = br.readLine();
				StringTokenizer elementos = new StringTokenizer(fila);
				int c = 0;
				while (elementos.hasMoreTokens() && !noIdentidad) {
					String elemento = elementos.nextToken();
					noIdentidad = ((c == f && !elemento.equals("1")) || (c != f && !elemento.equals("0")));
					c++;
				}
			}
			salida.append(noIdentidad ? "NO\n" : "SI\n");
		}
		System.out.print(salida.toString());

	}

}
