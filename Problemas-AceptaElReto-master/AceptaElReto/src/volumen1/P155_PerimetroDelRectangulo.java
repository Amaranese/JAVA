package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P155_PerimetroDelRectangulo {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String[] entrada = br.readLine().split(" ");
			int a = Integer.parseInt(entrada[0]);
			int b = Integer.parseInt(entrada[1]);
			if (a < 0 || b < 0) {
				break;
			}
			System.out.println(a + a + b + b);
		}
	}

}
