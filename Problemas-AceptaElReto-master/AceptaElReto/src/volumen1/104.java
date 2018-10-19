package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P104_Moviles {

	private static class Submovil {
		private boolean equilibrado = true;
		private int peso = 0;
	}

	private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	private static String fin = "0 0 0 0";

	public static void main(String[] args) throws IOException {
		String movil;
		while (!(movil = entrada.readLine()).equals(fin)) {
			String[] pesosDistancias = movil.split(" ");
			
			boolean equilibradoIzquierda = true;
			Submovil submovilIzquierda;
			int pi = Integer.parseInt(pesosDistancias[0]);
			if (pi == 0) {
				submovilIzquierda = submovil();
				pi = submovilIzquierda.peso;
				equilibradoIzquierda = submovilIzquierda.equilibrado;
			} 
			int di = Integer.parseInt(pesosDistancias[1]);

			boolean equilibradoDerecha = true;
			Submovil submovilDerecha;
			int pd = Integer.parseInt(pesosDistancias[2]);
			if (pd == 0) {
				submovilDerecha = submovil();
				pd = submovilDerecha.peso;
				equilibradoDerecha = submovilDerecha.equilibrado;
			} 
			int dd = Integer.parseInt(pesosDistancias[3]);
				
			if (equilibradoIzquierda && equilibradoDerecha && pi * di == pd * dd) {
				System.out.println("SI");
			} else {
				System.out.println("NO");
			}
		}

	}

	private static Submovil submovil() throws IOException {
		String[] pesosDistancias = entrada.readLine().split(" ");
		Submovil informacion = new Submovil();

		// Submovil izquierda
		Submovil submovilIzquierda;
		int pi = Integer.parseInt(pesosDistancias[0]);
		if (pi == 0) {
			submovilIzquierda = submovil();
			pi = submovilIzquierda.peso;
		} else {
			submovilIzquierda = new Submovil();
			submovilIzquierda.peso = pi;
		}
		int di = Integer.parseInt(pesosDistancias[1]);

		// Submovil derecha
		Submovil submovilDerecha;
		int pd = Integer.parseInt(pesosDistancias[2]);
		if (pd == 0) {
			submovilDerecha = submovil();
			pd = submovilDerecha.peso;
		} else {
			submovilDerecha = new Submovil();
			submovilDerecha.peso = pd;
		}
		int dd = Integer.parseInt(pesosDistancias[3]);

		informacion.equilibrado = submovilIzquierda.equilibrado && submovilDerecha.equilibrado && pi * di == pd * dd;
		informacion.peso = submovilIzquierda.peso + submovilDerecha.peso;

		return informacion;
	}

}
