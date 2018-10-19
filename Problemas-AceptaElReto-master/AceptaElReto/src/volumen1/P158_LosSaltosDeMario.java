package volumen1;

import java.io.IOException;
import java.util.Scanner;

public class P158_LosSaltosDeMario {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		StringBuilder sbOut = new StringBuilder(1000);
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			int m = scanner.nextInt();
			int currentWall = scanner.nextInt();
			int up = 0;
			int down = 0;
			for (int j = 1; j < m; j++) {
				int nextWall = scanner.nextInt();
				if (nextWall > currentWall) {
					up++;
				} else if (nextWall < currentWall) {
					down++;
				}
				currentWall = nextWall;
			}
			sbOut.append(up).append(' ').append(down).append('\n');
		}
		System.out.print(sbOut.toString());
		scanner.close();
	}

}
