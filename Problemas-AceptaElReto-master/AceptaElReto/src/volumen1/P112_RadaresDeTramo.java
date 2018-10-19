package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P112_RadaresDeTramo {

	private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		String datos;
		while (!(datos = entrada.readLine()).equals("0 0 0")) {
			String[] valores = datos.split(" ");
			int distancia = Integer.parseInt(valores[0]); // m
			int velocidadMaximaPermitida = Integer.parseInt(valores[1]); // km/h
			int tiempo = Integer.parseInt(valores[2]); // s
			if (distancia <= 0 || velocidadMaximaPermitida <= 0 || tiempo <= 0) {
				System.out.println("ERROR");
			} else {
				float velocidad = (float) distancia / (float) tiempo; // m/s
				velocidad *= (float) 3.6; // km/h
				if (velocidad < velocidadMaximaPermitida) {
					System.out.println("OK");
				} else {
					float tope = (float) 0.2 * velocidadMaximaPermitida;
					if (velocidad - velocidadMaximaPermitida < tope) {
						System.out.println("MULTA");
					} else {
						System.out.println("PUNTOS");
					}
				}
			}
		}

	}

}
