package volumen1;

import java.util.Scanner;

public class P149_SanFermines {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while (entrada.hasNext()) {
			int n = entrada.nextInt();
			int max = -1;
			while (n > 0) {
				int num = entrada.nextInt();
				if (num > max) {
					max = num;
				}
				n--;
			}
			sb.append(max + "\n");
		}
		entrada.close();
		System.out.print(sb.toString());
	}

}
