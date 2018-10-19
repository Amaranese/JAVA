package volumen3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P350_TrianguloMayorArea {

	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	static String fin = "0 0";
	static String espacio = " ";
	static StringBuilder salida = new StringBuilder(10000);
	
	public static void main(String[] args) throws IOException {
		String valores;
		while(!(valores = entrada.readLine()).equals(fin)){
			String[] lados = valores.split(espacio);
			int a = Integer.parseInt(lados[0]);
			int b = Integer.parseInt(lados[1]);
			String area = String.valueOf((float) b * a / 2);
			char digito;
			int i = 0;
			while (i < area.length()) {
				digito = area.charAt(i);
				i++;
				salida.append(digito);
				if(digito == '.') {
					salida.append(area.charAt(i));
					break;
				}
			}
			salida.append('\n');
		}
		System.out.print(salida);
	}

}
