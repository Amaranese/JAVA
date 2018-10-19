package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P188_EncadenandoPalabras {

	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		String palabrasStr;
		while((palabrasStr = entrada.readLine()) != null){
			String[] palabras = palabrasStr.split(" ");
			boolean encadenadas = true;
			for (int i = 0; i < palabras.length - 1 && encadenadas; i++) {
				encadenadas = palabras[i].charAt(palabras[i].length() - 2) == palabras[i + 1].charAt(0) &&
							  palabras[i].charAt(palabras[i].length() - 1) == palabras[i + 1].charAt(1);
			}
			if (encadenadas) {
				System.out.println("SI");
			} else {
				System.out.println("NO");
			}
		}
	}

}
