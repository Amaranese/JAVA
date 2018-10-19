package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P153_RelojATravesDelEspejo {

	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(entrada.readLine());
		for (int i = 0; i < n; i++) {
			String[] horaMinutosEspejo = entrada.readLine().split(":");
			int horaEspejo = Integer.parseInt(horaMinutosEspejo[0]);
			int minutosEspejo = Integer.parseInt(horaMinutosEspejo[1]);
			int minutosReales = (60 - minutosEspejo) % 60;
			int calculoHoraReal = 12 - horaEspejo;
			int horaReal = calculoHoraReal > 0 ? calculoHoraReal : 12;
			if (minutosReales > 0) {
				horaReal--;
			}
			if (horaReal == 0) {
				horaReal = 12;
			}
			System.out.println(digitosReloj(horaReal) + ":" + digitosReloj(minutosReales));
		}

	}

	private static String digitosReloj(int digitos) {
		String digitosStr = "";
		if (digitos < 10) {
			digitosStr += "0";
		}
		digitosStr += digitos;
		return digitosStr;
	}

}
