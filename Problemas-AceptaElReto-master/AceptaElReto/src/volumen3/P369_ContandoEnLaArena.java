package volumen3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P369_ContandoEnLaArena {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in;
		StringBuilder sb = new StringBuilder(1000);
		String[] unos = new String[] { "1", "11", "111", "1111", "11111", "111111", "1111111", "11111111", "111111111",
				"1111111111" };
		StringBuilder cienSB = new StringBuilder(100);
		for(int i = 0; i < 10; i++){
			cienSB.append(unos[9]);
		}
		String cien = cienSB.toString();
		while (!(in = br.readLine()).equals("0")) {
			int n = Integer.parseInt(in);
			int qDiv100 = n / 100;
			for(int i = 0; i < qDiv100; i++){
				sb.append(cien);
			}
			n = n % 100;
			int qDiv10 = n / 10;
			for(int i = 0; i < qDiv10; i++){
				sb.append(unos[9]);
			}
			n = n % 10;
			if(n > 0){
				sb.append(unos[n-1]);
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}

}
