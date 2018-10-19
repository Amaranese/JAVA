package volumen2;

import java.io.IOException;
import java.util.Scanner;

public class P245_LosDalton {

	static Scanner sc = new Scanner(System.in);
	static int in;
	static long pre;
	static long current;
	static boolean asc;
	static boolean areDalton = true;
	static StringBuilder sb = new StringBuilder(1000);
	static String dalton = "DALTON\n";
	static String desconocidos = "DESCONOCIDOS\n";

	public static void main(String[] args) throws IOException {
		while ((in = sc.nextInt()) != 0) {
			pre = sc.nextLong();
			for (int i = 1; i < in && areDalton; i++) {
				current = sc.nextLong();
				if (i == 1) {
					asc = pre < current;
				}
				if (asc) {
					if (current <= pre) {
						areDalton = false;
						sc.nextLine();
					}
				} else {
					if (current >= pre) {
						areDalton = false;
						sc.nextLine();
					}
				}
				pre = current;
			}
			if (areDalton) {
				sb.append(dalton);
			} else {
				sb.append(desconocidos);
			}
			areDalton = true;
		}
		System.out.print(sb.toString());
	}

}
