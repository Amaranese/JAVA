package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P120_ConstanteMagica {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in;
		StringTokenizer st;
		StringBuilder outSb = new StringBuilder(1000);
		while (!(in = br.readLine()).equals("0 0")) {
			st = new StringTokenizer(in);
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			int[][] square = new int[n][n];
			for(int i = 0; i < square.length; i++){
				Arrays.fill(square[i], -1);
			}
			int row = 0;
			int col = n / 2;
			square[row][col] = k;
			while (!isDiagonalComplete(square)) {
				row = row - 1 < 0 ? n - 1 : row - 1;
				col = col + 1 > n - 1 ? 0 : col + 1;
				if (square[row][col] != -1) {
					row += 2;
					col--;
				}
				square[row][col] = ++k;
			}
			int constant = 0;
			int j = square[0].length - 1;
			for (int i = 0; i < square.length; i++) {
				constant += square[i][j];
				j--;
			}
			outSb.append(constant).append('\n');
		}
		System.out.print(outSb.toString());
	}

	private static boolean isDiagonalComplete(int[][] square) {
		int j = square[0].length - 1;
		for (int i = 0; i < square.length; i++) {
			if (square[i][j] == -1) {
				return false;
			}
			j--;
		}
		return true;
	}

}
