package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P181_LasTorresPerezosas {

	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		String line;
		while (!(line = reader.readLine()).equals("0")) {
			int n = Integer.parseInt(line);
			char[][] table = new char[n][n];
			for (int i = 0; i < table.length; i++) {
				table[i] = reader.readLine().toCharArray();
			}
			System.out.println(ways(table));
		}
	}

	private static int ways(char[][] table) {
		int[][] ways = new int[table.length][table.length];
		ways[ways.length - 1][0] = 1;
		for (int i = ways.length - 1; i >= 0; i--) {
			for (int j = i == ways.length - 1 ? 1 : 0; j < ways[i].length; j++) {
				if (table[i][j] == '.') {
					if (j != 0) {
						ways[i][j] += ways[i][j - 1];
					}
					if (i != ways.length - 1) {
						ways[i][j] += ways[i + 1][j];
					}
				}
			}
		}
		for (int i = 0; i < ways.length; i++) {
			System.out.println(Arrays.toString(ways[i]));
		}
		return ways[0][ways.length - 1];
	}

}
