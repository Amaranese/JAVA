package volumen1;

import java.io.IOException;

public class P165_Hyperpar {

	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		int c;
		boolean hyperpar = true;
		while ((c = System.in.read()) != 45) {
			if ((c != 13 && c != 10) && hyperpar) {
				if ((c & 1) == 1) {
					sb.append("NO\n");
					hyperpar = false;
				}
			} else {
				if (c == 10) {
					if (hyperpar) {
						sb.append("SI\n");
					}
					hyperpar = true;
				}
			}
		}
		System.out.print(sb.toString());
	}

}
