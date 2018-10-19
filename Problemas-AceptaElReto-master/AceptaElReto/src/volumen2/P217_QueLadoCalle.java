package volumen2;

import java.io.IOException;

public class P217_QueLadoCalle {

	public static void main(String[] args) throws IOException {
		int in;
		StringBuilder out = new StringBuilder(1000);
		int pre = 10;
		while (!((in = System.in.read()) == 48 && pre == 10)) {
			if (in == 10) {
				if ((pre & 1) == 0) {
					out.append("DERECHA\n");
				} else {
					out.append("IZQUIERDA\n");
				}
			}
			//if (in != 13) { 
				pre = in;
			//}
		}
		System.out.print(out.toString());
	}

}
