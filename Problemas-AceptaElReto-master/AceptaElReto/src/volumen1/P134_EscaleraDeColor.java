package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P134_EscaleraDeColor {

	private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

	private static class Naipe implements Comparable<Naipe> {
		private int numero;
		private String palo;

		public Naipe(int numero, String palo) {
			this.numero = numero;
			this.palo = palo;
		}

		public Naipe(String numero, String palo) {
			this.numero = decimal(numero);
			this.palo = palo;
		}

		@Override
		public int compareTo(Naipe otro) {
			return this.numero - otro.numero;
		}

//		@Override
//		public String toString() {
//			return "[" + numero + ", " + palo + "]";
//		}

	}

	public static void main(String[] args) throws IOException {
		String valor;
		while (!(valor = entrada.readLine()).equals("0")) {
			String[] valores = valor.split(" ");
			Naipe[] naipes = new Naipe[4];
			
			// Comprobar palos
			boolean posible = true;
			String palo = null;
			for (int i = 0; i < valores.length && posible; i += 2) {
				if(i == 0){
					palo = valores[i + 1];
				} else {
					posible = valores[i + 1].equals(palo);
				}
				naipes[i / 2] = new Naipe(valores[i], valores[i + 1]);
			}
			// Comprobar numeros
			Naipe falta = null;
			if(posible){
				Arrays.sort(naipes);
				int numeroAnterior = naipes[0].numero;
				for (int i = 1; i < naipes.length && posible; i++) {
					int diferencia = naipes[i].numero - numeroAnterior;
					if (diferencia == 0 || diferencia > 2 || (diferencia == 2 && falta != null)) {
						posible = false;
					} else if (diferencia == 2) { // rellenar hueco
						falta = new Naipe(numeroAnterior + 1, naipes[i].palo);
					}
					numeroAnterior = naipes[i].numero;
				}
				if (posible && falta == null) {
					if(numeroAnterior == 14){
						numeroAnterior = 9; // para completar escalera real ;)
					}
					falta = new Naipe(numeroAnterior + 1, naipes[0].palo);
				}
			}
			if (posible) {
				System.out.println(numeroBaraja(falta.numero) + " " + falta.palo);
			} else {
				System.out.println("NADA");
			}
		}
	}

	private static int decimal(String numero) {
		try {
			return Integer.parseInt(numero);
		} catch (NumberFormatException e) {
			switch (numero) {
			case "J":
				return 11;
			case "Q":
				return 12;
			case "K":
				return 13;
			default:
				return 14;
			}
		}
	}

	private static String numeroBaraja(int numero) {
		if (numero <= 10) {
			return "" + numero;
		} else {
			switch (numero) {
			case 11:
				return "J";
			case 12:
				return "Q";
			case 13:
				return "K";
			default:
				return "A";
			}
		}
	}

}
