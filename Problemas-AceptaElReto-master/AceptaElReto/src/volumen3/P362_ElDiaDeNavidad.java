package volumen3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P362_ElDiaDeNavidad {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			if (br.readLine().equals("25 12")) {
				System.out.println("SI");
			} else {
				System.out.println("NO");
			}
		}
		} catch (NumberFormatException | IOException e) {
		}
	}

}
