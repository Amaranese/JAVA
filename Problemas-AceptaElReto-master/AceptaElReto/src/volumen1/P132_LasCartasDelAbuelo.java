package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P132_LasCartasDelAbuelo {

	public static class Intervalo {
		
		private int a;
		private int b;

		public Intervalo(int a, int b) {
			this.a = a;
			this.b = b;
		}

		public boolean incluye(Intervalo otro) {
			return otro.a >= this.a && otro.b <= this.b;
		}

		public boolean puedeAmpliarExtremoIzquierdo(Intervalo otro) {
			return otro.b <= this.b && otro.b >= (this.a - 1) && otro.a < this.a;
		}

		public boolean puedeAmpliarExtremoDerecho(Intervalo otro) {
			return otro.a >= this.a && otro.a <= (this.b + 1) && otro.b > this.b;
		}

		@Override
		public String toString() {
			return "[" + a + ", " + b + "]";
		}

	}

	private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	private static StringBuilder salida;

	public static void main(String[] args) throws IOException {
		while (true) {
			String linea = entrada.readLine();
			String intervalos = entrada.readLine();
			if (intervalos.equals("0")) {
				break;
			}
			int n = Integer.parseInt(intervalos);
			salida = new StringBuilder(3 * n);
			List<Intervalo> intervalosCaracteresIguales = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				String[] intervaloStr = entrada.readLine().split(" ");
				int a = Integer.parseInt(intervaloStr[0]);
				int b = Integer.parseInt(intervaloStr[1]);
				if (a > b) {
					int temp = a;
					a = b;
					b = temp;
				}
				// inicializacion para descartar a != b
				boolean caracteresSiguenIgual = linea.charAt(a) == linea.charAt(b);
				// b > a, para ahorrarnos intervalos del tipo [1-1]
				if (caracteresSiguenIgual && b > a) {
					Intervalo nuevoIntervalo = new Intervalo(a, b);
					boolean incluido = false;
					for (int j = 0; j < intervalosCaracteresIguales.size() && !incluido; j++) {
						incluido = intervalosCaracteresIguales.get(j).incluye(nuevoIntervalo);
					}
					if (!incluido) {
						for (int j = a + 1; j < b && caracteresSiguenIgual; j++) {
							caracteresSiguenIgual = linea.charAt(j - 1) == linea.charAt(j);
						}
						if (caracteresSiguenIgual) {
							boolean puedeAmpliar = false;
							for (int j = 0; j < intervalosCaracteresIguales.size() && !puedeAmpliar; j++) {
								Intervalo intervalo = intervalosCaracteresIguales.get(j);
								if (intervalosCaracteresIguales.get(j).puedeAmpliarExtremoIzquierdo(nuevoIntervalo)) {
									intervalo.a = nuevoIntervalo.a;
									puedeAmpliar |= true;
								}
								if (intervalosCaracteresIguales.get(j).puedeAmpliarExtremoDerecho(nuevoIntervalo)) {
									intervalo.b = nuevoIntervalo.b;
									puedeAmpliar |= true;
								}
							}
							if (!puedeAmpliar) {
								intervalosCaracteresIguales.add(nuevoIntervalo);
							}
						}
					}
				}
				if (caracteresSiguenIgual) {
					salida.append("SI\n");
				} else {
					salida.append("NO\n");
				}
			}
			System.out.println(salida);
		}
	}

}
