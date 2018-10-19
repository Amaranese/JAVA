package volumen2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P216_Goteras {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder out = new StringBuilder();

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			int segs = Integer.parseInt(br.readLine());
			int horas = segs / 3600;
			rellenar(horas, out);
			int minutos = (segs % 3600) / 60;
			rellenar(minutos, out);
			int segundos = (segs % 3600) % 60;
			rellenar(segundos, out);
			out.replace(out.length() - 1, out.length(), "\n");
		}
		System.out.print(out.toString());
	}

	private static void rellenar(int num, StringBuilder sb) {
		if (num < 10) {
			sb.append("0" + num + ":");
		} else {
			sb.append(num + ":");
		}
	}

}
