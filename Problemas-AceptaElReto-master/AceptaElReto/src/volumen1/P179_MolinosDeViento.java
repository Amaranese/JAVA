package volumen1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P179_MolinosDeViento {

	private static class Intervalo {
		private int inicio;
		private int fin;
		private int energia;

		public Intervalo(int inicio, int fin, int energia) {
			this.inicio = inicio;
			this.fin = fin;
			this.energia = energia;
		}

		public boolean intersecan(int inicio, int fin) {
			return !(fin < this.inicio || inicio > this.fin);
		}

		public boolean incluidoInicio(int inicio) {
			return this.inicio <= inicio;
		}

		public boolean incluidoFin(int fin) {
			return this.fin >= fin;
		}

	}

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int numMolinos;
		while ((numMolinos = entrada.nextInt()) != 0) {
			int[] molinos = new int[numMolinos];
			for (int i = 0; i < molinos.length; i++) {
				molinos[i] = entrada.nextInt();
			}
			List<Intervalo> intervalos = new ArrayList<>();

			int totalEnergia;
			int numConsultas = entrada.nextInt();
			for (int i = 0; i < numConsultas; i++) {
				int inicio = entrada.nextInt();
				int fin = entrada.nextInt();

				totalEnergia = 0;
				boolean calculado = false;
				boolean esInterseccion = false;

				for (int j = 0; j < intervalos.size() && !calculado; j++) {

					Intervalo intervalo = intervalos.get(j);

					boolean interseca = intervalo.intersecan(inicio, fin);
					esInterseccion |= interseca;
					if (interseca) {

						int diferencia = 0;
						int ampliacion = 0;

						if ((fin - inicio) > (inicio - intervalo.inicio) + (intervalo.fin - fin)) {
							if (intervalo.incluidoInicio(inicio)) {
								for (int k = intervalo.inicio - 1; k < inicio - 1; k++) {
									diferencia += molinos[k];
								}
								if (intervalo.incluidoFin(fin)) {
									for (int k = fin; k < intervalo.fin; k++) {
										diferencia += molinos[k];
									}
								} else {
									for (int k = intervalo.fin; k < fin; k++) {
										ampliacion += molinos[k];
									}
								}
							} else {
								for (int k = inicio - 1; k < intervalo.inicio - 1; k++) {
									ampliacion += molinos[k];
								}
								if (intervalo.incluidoFin(fin)) {
									for (int k = fin - 1; k < intervalo.fin - 1; k++) {
										diferencia += molinos[k];
									}
								} else {
									for (int k = intervalo.fin; k < fin; k++) {
										ampliacion += molinos[k];
									}
								}
							}
							totalEnergia = intervalo.energia - diferencia + ampliacion;
							calculado = true;
						}
					}

				}
				if (!calculado) {
					for (int j = inicio - 1; j < fin; j++) {
						totalEnergia += molinos[j];
					}
					if (!esInterseccion) {
						intervalos.add(new Intervalo(inicio, fin, totalEnergia));
					}
				}
				System.out.println(totalEnergia);
			}
		}
	}

}
