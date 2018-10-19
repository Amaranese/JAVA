package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class P142_QuienEmpieza {

	private static class Lista {

		private class Nodo {
			public int elemento;
			private Nodo siguiente;

			public Nodo(int elemento) {
				this.elemento = elemento;
				this.siguiente = null;
			}
		}

		private Nodo inicio;
		private Nodo actual;
		private Nodo anterior;
		private int elementos;

		public Lista() {
			this.inicio = null;
			this.actual = null;
			this.anterior = null;
			this.elementos = 0;
		}

		public int primero() {
			return inicio.elemento;
		}

		public void criba(int numSaltos) {
			anterior = actual;
			actual = inicio;
			int numSaltosAux;
			while (this.elementos > 1) {
				numSaltosAux = numSaltos;
				while (numSaltosAux > 0) {
					anterior = actual;
					actual = actual.siguiente;
					numSaltosAux--;
				}
				// Eliminar nodo;
				if (actual == inicio) {
					inicio = actual.siguiente;
				}
				anterior.siguiente = actual.siguiente;
				actual = actual.siguiente; // GC
				this.elementos--;
			}
		}

		public void inserta(int i) {
			Nodo nuevoNodo = new Nodo(i);
			if (inicio == null) {
				inicio = nuevoNodo;
			} else {
				anterior = actual;
				actual.siguiente = nuevoNodo;
			}
			actual = nuevoNodo;
			nuevoNodo.siguiente = inicio;
			this.elementos++;
		}

	}

	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		String datos;
		while (!(datos = entrada.readLine()).equals("0 0")) {
			String[] valores = datos.split(" ");
			int numNinyos = Integer.parseInt(valores[0]);
			int numSaltos = Integer.parseInt(valores[1]);
			Lista lista = new Lista();
			for (int i = 1; i <= numNinyos; i++) {
				lista.inserta(i);
			}
			lista.criba(numSaltos);
			System.out.println(lista.primero());
		}
	}

}
