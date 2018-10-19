package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P148_Nochevieja {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String entrada;
		StringBuilder totalMinutos = new StringBuilder();
		while (!(entrada = br.readLine()).equals("00:00")) {
			String[] horaEntrada = entrada.split(":");
			int hora = Integer.parseInt(horaEntrada[0]);
			int restoHora = 0;
			if (hora < 23) {
				restoHora = 23 - hora;
			}
			int minutos = Integer.parseInt(horaEntrada[1]);
			int restoMinutos = 0;
			if (minutos > 0) {
				restoMinutos = 60 - minutos;
			} else {
				restoMinutos = 60;
			}
			totalMinutos.append((restoHora * 60 + restoMinutos) + "\n");
		}
		System.out.print(totalMinutos.toString());
	}

}
