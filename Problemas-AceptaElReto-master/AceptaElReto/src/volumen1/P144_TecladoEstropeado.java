package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P144_TecladoEstropeado {

	private static class LineaTexto {

		private class Nodo {

			private char caracter;
			private Nodo siguiente;

			public Nodo(char caracter) {
				this.caracter = caracter;
				this.siguiente = null;
			}

		}

		private Nodo inicio;
		private Nodo fin;
		private Nodo anterior;
		private Nodo actual;
		private int numElementos;

		public LineaTexto() {
			this.inicio = null;
			this.fin = null;
			this.anterior = null;
			this.actual = null;
			this.numElementos = 0;
		}

		public void recogePulsacion(char caracter) {
			switch (caracter) {
			case '-': // Inicio
				anterior = null;
				actual = inicio;
				break;
			case '+': // Fin
				anterior = fin;
				actual = null;
				break;
			case '*': // Derecha
				if (actual != null) {
					anterior = actual;
					actual = actual.siguiente;
				}
				break;
			case '3': // Supr
				if (actual != null) { // Apunta al que tiene que borrar
					if (actual == inicio) {
						inicio = inicio.siguiente;
					}
					actual = actual.siguiente;
					if (anterior != null) {
						anterior.siguiente = actual;
					}
					if (actual == null) {
						fin = anterior;
					}
					numElementos--;
				}
				break;
			default:
				Nodo nuevoNodo = new Nodo(caracter);
				if (actual == inicio) { // Insercion inicio linea
					if (inicio == null) {
						fin = nuevoNodo;
					} else {
						nuevoNodo.siguiente = inicio;
					}
					inicio = nuevoNodo;
				} else {
					if (anterior == fin) { // insercion final linea
						fin = nuevoNodo;
					}
					nuevoNodo.siguiente = actual;
				}
				if (anterior != null) {
					anterior.siguiente = nuevoNodo;
				}
				anterior = nuevoNodo;
				numElementos++;
			}
		}

		public void muestraCaracteres() {
			StringBuilder salida = new StringBuilder(numElementos);
			actual = inicio;
			while (actual != null) {
				salida.append(actual.caracter);
				actual = actual.siguiente;
			}
			System.out.println(salida);
		}
	}

	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		String linea;
		while ((linea = entrada.readLine()) != null) {
			LineaTexto lineaTexto = new LineaTexto();
			for (int i = 0; i < linea.length(); i++) {
				lineaTexto.recogePulsacion(linea.charAt(i));
			}
			lineaTexto.muestraCaracteres();
		}
	}

}
