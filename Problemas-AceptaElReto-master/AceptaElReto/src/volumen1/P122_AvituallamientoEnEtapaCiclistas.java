package volumen1;

import java.io.IOException;
import java.util.Scanner;

public class P122_AvituallamientoEnEtapaCiclistas {

	private static Scanner entrada = new Scanner(System.in);

	public static class PuntoAvituallamiento {
		private int kmInicio;
		private int kmsTotales;

		public PuntoAvituallamiento(int kmInicio, int kmsTotales) {
			this.kmInicio = kmInicio;
			this.kmsTotales = kmsTotales;
		}
	}

	public static void main(String[] args) throws IOException {
		int alturaAnterior;
		while ((alturaAnterior = entrada.nextInt()) != -1) {
			int kmInicio = -1;
			int kmsTotales = 0;
			PuntoAvituallamiento mejorPunto = null;
			int kmActual = 1;
			while (alturaAnterior != - 1) {
				int altura = entrada.nextInt();
				if (altura == alturaAnterior) {
					if (kmInicio == -1) {
						kmInicio = kmActual - 1;
					}
					kmsTotales++;
				} else {
					if (kmInicio != -1) {
						if (mejorPunto == null || (mejorPunto != null && kmsTotales > mejorPunto.kmsTotales)) {
							mejorPunto = new PuntoAvituallamiento(kmInicio, kmsTotales);
						}
						kmInicio = -1;
						kmsTotales = 0;
					}
				}
				alturaAnterior = altura;
				kmActual++;
			}
			if (mejorPunto == null) {
				System.out.println("HOY NO COMEN");
			} else {
				System.out.println(mejorPunto.kmInicio + " " + mejorPunto.kmsTotales);
			}
		}
	}

}
