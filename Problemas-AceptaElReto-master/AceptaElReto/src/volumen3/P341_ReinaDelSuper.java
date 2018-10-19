package volumen3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P341_ReinaDelSuper {

	private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	private static String espacio = " ";

	public static void main(String[] args) throws IOException {
		String valores;
		while ((valores = entrada.readLine()) != null) {
			String[] numeroCajasClientes = valores.split(espacio);
			int[] cajas = new int[Integer.parseInt(numeroCajasClientes[0])];
			String[] tiemposClientes = entrada.readLine().split(espacio);
			int clientesAtendidos = 0;
			int menorTiempoCliente = Integer.MAX_VALUE;
			int indiceCajaLibre = 0;
			
			while (clientesAtendidos < tiemposClientes.length) {
				int tiempoCliente = Integer.parseInt(tiemposClientes[clientesAtendidos]);
				if (indiceCajaLibre < cajas.length) {
					cajas[indiceCajaLibre] = tiempoCliente;
					clientesAtendidos++;
					if (cajas[indiceCajaLibre] < menorTiempoCliente) {
						menorTiempoCliente = cajas[indiceCajaLibre];
					}
					// Busca la posición de la siguiente caja libre si la hay
					while (indiceCajaLibre < cajas.length) {
						if (cajas[indiceCajaLibre] == 0) {
							break;
						}
						indiceCajaLibre++;
					}	
				} else {
					int decremento = menorTiempoCliente;
					menorTiempoCliente = Integer.MAX_VALUE;
					for (int i = 0; i < cajas.length; i++) {
						cajas[i] -= decremento;
						if (cajas[i] == 0) {
							if (indiceCajaLibre == cajas.length) {
								indiceCajaLibre = i; // Primera caja libre
							}
						} else {
							if (cajas[i] < menorTiempoCliente) {
								menorTiempoCliente = cajas[i];
							}
						}
					}
				}
			}
			indiceCajaLibre = 0;
			menorTiempoCliente = Integer.MAX_VALUE;
			int i = 0;
			while (i < cajas.length) {
				if (cajas[i] == 0) {
					indiceCajaLibre = i;
					break;
				}
				if (cajas[i] < menorTiempoCliente) {
					indiceCajaLibre = i;
					menorTiempoCliente = cajas[i];
				}
				i++;
			}
			System.out.println(indiceCajaLibre + 1);
		}
	}

}
