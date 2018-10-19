package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P106_CodigoBarras {

	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	static String cero = "0";
	static String si = "SI";
	static String no = "NO";
	static StringBuilder salida = new StringBuilder(10000);

	public static void main(String[] args) throws IOException {
		String valor;
		while (!(valor = entrada.readLine()).equals(cero)) {
			StringBuilder codigoAux = new StringBuilder(valor);
			if (codigoAux.length() < 8) {
				rellena(codigoAux, 8);
			} else if (codigoAux.length() > 8 && codigoAux.length() < 13) {
				rellena(codigoAux, 13);
			}
			String codigo = codigoAux.toString();
			if (valido(codigo)) {
				salida.append(si);
				if (codigo.length() == 13) {
					salida.append(' ').append(procedencia(codigo));
				}
			} else {
				salida.append(no);
			}
			salida.append('\n');
		}
		System.out.print(salida);
	}

	private static boolean valido(String codigo) {
		int control = 0;
		boolean par = false;
		for (int i = codigo.length() - 2; i >= 0; i--) {
			int digito = Character.getNumericValue(codigo.charAt(i));
			control += par ? digito : digito * 3;
			par = !par;
		}
		return (control + Character.getNumericValue(codigo.charAt(codigo.length() - 1))) % 10 == 0;
	}

	private static String procedencia(String codigo) {
		if (codigo.startsWith("0")) {
			return "EEUU";
		}
		if (codigo.startsWith("380")) {
			return "Bulgaria";
		}
		if (codigo.startsWith("50")) {
			return "Inglaterra";
		}
		if (codigo.startsWith("539")) {
			return "Irlanda";
		}
		if (codigo.startsWith("560")) {
			return "Portugal";
		}
		if (codigo.startsWith("70")) {
			return "Noruega";
		}
		if (codigo.startsWith("759")) {
			return "Venezuela";
		}
		if (codigo.startsWith("850")) {
			return "Cuba";
		}
		if (codigo.startsWith("890")) {
			return "India";
		}
		return "Desconocido";
	}

	private static void rellena(StringBuilder codigoAux, int digitos) {
		while (codigoAux.length() < digitos) {
			codigoAux.insert(0, '0');
		}
	}

}
