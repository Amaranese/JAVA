package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P105_Ventas {

	private static String[] dias = new String[] { "MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO", "DOMINGO" };
	private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	private static StringBuilder salida = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException, IOException {
		int diaMasVentas = 0;
		int diaMenosVentas = 0;
		float suma = 0;
		float maxVentas = 0;
		float minVentas = 0;
		int diaProcesado = 0;
		String in;
		while (!(in = entrada.readLine()).equals("-1")) {
			float valor = Float.parseFloat(in);
			if (diaProcesado == 0) {
				maxVentas = valor;
				diaMasVentas = 0;
				minVentas = valor;
				diaMenosVentas = 0;
			} else {
				if (valor > maxVentas) {
					maxVentas = valor;
					diaMasVentas = diaProcesado;
				}
				if (valor < minVentas) {
					minVentas = valor;
					diaMenosVentas = diaProcesado;
				}
			}
			suma += valor;
			if (diaProcesado == 5) {
				if (diaMasVentas == diaMenosVentas) {
					salida.append("EMPATE\n");
				} else {
					salida.append(dias[diaMasVentas] + " ");
					salida.append(dias[diaMenosVentas] + " ");
					if (valor > (suma / (diaProcesado + 1))) {
						salida.append("SI\n");
					} else {
						salida.append("NO\n");
					}
				}
				diaProcesado = 0;
				suma = 0;
			} else {
				diaProcesado++;
			}
		}

		System.out.print(salida.toString());

	}

}
