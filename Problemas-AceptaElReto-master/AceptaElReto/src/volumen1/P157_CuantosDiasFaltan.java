package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P157_CuantosDiasFaltan {

	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	static int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(entrada.readLine());
		for (int i = 0; i < n; i++) {
			String[] fecha = entrada.readLine().split(" ");
			int diasTranscurridos = Integer.parseInt(fecha[0]);
			int mes = Integer.parseInt(fecha[1]);
			for(int j = 0; j < mes - 1; j++){
				diasTranscurridos += diasMes[j];
			}
			System.out.println(365 - diasTranscurridos);
		}
	}

}
