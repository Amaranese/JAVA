package volumen3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P331_ParrillaSalida {

	private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	private static final int MAXIMO_PILOTOS = 26;

	public static void main(String[] args) throws IOException {
		String valor;
		while (!(valor = entrada.readLine()).equals("0")) {
			int pilotos = Integer.parseInt(valor);
			String[] parrillaSalida = new String[MAXIMO_PILOTOS];
			boolean posible = true;
			for (int i = 0; i < pilotos; i++) {
				String posicionPilotoStr = entrada.readLine();
				if (posible) {
					int finPosicion = posicionPilotoStr.indexOf(' ');
					int posicionSalida = i + Integer.parseInt(posicionPilotoStr.substring(0, finPosicion));
					if (posicionSalida >= 0 && posicionSalida <= MAXIMO_PILOTOS - 1) {
						if (parrillaSalida[posicionSalida] == null) {
							parrillaSalida[posicionSalida] = posicionPilotoStr.substring(finPosicion,
									posicionPilotoStr.length());
						} else {
							posible = false;
						}
					} else {
						posible = false;
					}
				}
			}
			if (posible) {
				StringBuilder salida = new StringBuilder(1000);
				for (int i = 0; i < parrillaSalida.length; i++) {
					if (parrillaSalida[i] != null) {
						salida.append(i + 1).append(parrillaSalida[i]).append('\n');
					}
				}
				System.out.print(salida);
			} else {
				System.out.println("IMPOSIBLE");
			}
			System.out.println("-----");
		}
	}

}
