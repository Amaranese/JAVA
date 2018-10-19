package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P172_ElPanDeLasBodas {

	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		String configuracionMesa;
		while (!(configuracionMesa = entrada.readLine()).equals("0")) {
			String panes = configuracionMesa.substring(configuracionMesa.indexOf(' ') + 1, configuracionMesa.length());
			if (panes.indexOf('D') != -1 && panes.indexOf('I') != -1) {
				System.out.println("ALGUNO NO COME");
			} else {
				System.out.println("TODOS COMEN");
			}
		}
	}

}
