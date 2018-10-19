package volumen2;

import java.io.IOException;
import java.util.Scanner;

public class P207_SombrasEnElCamping {

	static Scanner scanner = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder(10000);

	public static void main(String[] args) throws IOException {
		while (true) {
			int c = scanner.nextInt();
			int r = scanner.nextInt();
			int a = scanner.nextInt();
			if(c == 0 || r == 0){
				break;
			}
			char[][] camping = new char[r][c];
			for(int i = 0; i < a; i++) {
				int ct = scanner.nextInt();
				int rt = scanner.nextInt();
				camping[rt - 1][ct - 1] = 'T';
			}
			int shades = 0;
			for (int i = 0; i < camping.length; i++) {
				for (int j = 0; j < camping[i].length; j++) {
					if (camping[i][j] == 'T') {
						if (j - 1 >= 0) {
							shades += shadesInRow(camping, i, j - 1);
						}
						if (i - 1 >= 0) {
							shades += shadesInColumn(camping, i - 1, j);
						}
						if (j + 1 < camping[i].length) {
							shades += shadesInRow(camping, i, j + 1);
						}
						if (i + 1 < camping.length) {
							shades += shadesInColumn(camping, i + 1, j);
						}
					}
				}
			}
			sb.append(shades).append('\n');
		}
		System.out.print(sb);
	}

	private static boolean checkPosition(char position) {
		return position != 'S' && position != 'T';
	}

	private static int shadesInColumn(char[][] camping, int i, int j) {
		int shades = 0;
		if (checkPosition(camping[i][j])) {
			camping[i][j] = 'S';
			shades++;
		}
		return shades;
	}

	private static int shadesInRow(char[][] camping, int i, int j) {
		int shades = 0;
		if (i - 1 >= 0) {
			if (checkPosition(camping[i - 1][j])) {
				camping[i - 1][j] = 'S';
				shades++;
			}
		}
		if (checkPosition(camping[i][j])) {
			camping[i][j] = 'S';
			shades++;
		}
		if (i + 1 < camping.length) {
			if (checkPosition(camping[i + 1][j])) {
				camping[i + 1][j] = 'S';
				shades++;
			}
		}
		return shades;
	}
}
