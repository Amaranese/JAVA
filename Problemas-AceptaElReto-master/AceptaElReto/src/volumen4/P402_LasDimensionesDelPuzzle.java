package volumen4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P402_LasDimensionesDelPuzzle {

	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		String line;
		while(!(line = reader.readLine()).equals("0")) {
			int dim = Integer.parseInt(line);
			int factor = (int) Math.sqrt(dim);
			while(dim % factor != 0) {
				factor--;
			}
			System.out.println(dim / factor);
		}
	}

}
