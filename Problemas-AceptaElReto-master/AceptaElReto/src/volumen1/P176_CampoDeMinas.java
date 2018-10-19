package volumen1;

import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P176_CampoDeMinas {

	static Scanner scanner = new Scanner(System.in);
	static StringTokenizer st;
	static String in;
	static char[][] table;
	static StringBuilder sb = new StringBuilder(10000);

	public static void main(String[] args) throws IOException {
		while (true) {
			int w = scanner.nextInt();
			int h = scanner.nextInt();
			scanner.nextLine();
			if(w == 0 || h == 0){
				break;
			}
			table = new char[h][w];
			for (int i = 0; i < table.length; i++) {
				String line = scanner.nextLine();
				table[i] = line.toCharArray();

			}
			int squares = 0;
			for (int i = 1; i < table.length - 1; i++) {
				for (int j = 1; j < table[i].length - 1; j++) {
					int mines = 0;
					if (table[i][j] == '-') {
						if (table[i - 1][j - 1] == '*') {
							mines++;
						}
						if (table[i - 1][j] == '*') {
							mines++;
						}
						if (table[i - 1][j + 1] == '*') {
							mines++;
						}
						if (table[i][j - 1] == '*') {
							mines++;
						}
						if (table[i][j + 1] == '*') {
							mines++;
						}
						if (table[i + 1][j - 1] == '*') {
							mines++;
						}
						if (table[i + 1][j] == '*') {
							mines++;
						}
						if (table[i + 1][j + 1] == '*') {
							mines++;
						}
					}
					if (mines >= 6) {
						squares++;
					}
				}
			}
			sb.append(squares).append('\n');
		}
		System.out.print(sb);
	}

}
