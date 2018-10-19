package volumen1;

import java.util.Scanner;

public class P135_ViajeEnElTiempo {

	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		int n = entrada.nextInt();
		for (int i = 0; i < n; i++) {
			int anterior = entrada.nextInt();
			int actual;
			int diferencia = Integer.MAX_VALUE;
			int nuevaDiferencia;
			int cambios = -1;
			while ((actual = entrada.nextInt()) != -1) {
				nuevaDiferencia = actual - anterior;
				if (diferencia > 0 && nuevaDiferencia < 0) {
					nuevaDiferencia = 1000000 - anterior + actual;
				} else if (diferencia < 0 && nuevaDiferencia > 0) {
					nuevaDiferencia = -(1000000 - actual + anterior);
				}
				if (nuevaDiferencia != diferencia) {
					diferencia = nuevaDiferencia;
					cambios++;
				}
				anterior = actual;
			}
			int siguiente = anterior + diferencia;
			if (siguiente >= 1000000) {
				siguiente -= 1000000;
			} else if (siguiente < 0) {
				siguiente += 1000000;
			}
			System.out.println(cambios + " " + siguiente);
		}
	}

}
