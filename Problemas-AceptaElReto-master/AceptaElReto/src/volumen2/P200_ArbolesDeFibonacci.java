package volumen2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P200_ArbolesDeFibonacci {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static String in;
	static int[] sols;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		while (!(in = br.readLine()).startsWith("-")) {
			int n = Integer.parseInt(in);
			sols = new int[n + 1];
			for (int i = 0; i < sols.length; i++) {
				sols[i] = -1;
			}
			fibTree(n, "");
			sb.append("====\n");
			System.out.print(sb.toString());
			sb.setLength(0);
		}
	}

	private static void fibTree(int num, String tab) {
		fib(num);
		sb.append(sols[num] + "\n");
		if (num > 1) {
			String newTab = tab + "   ";
			sb.append(newTab);
			fibTree(num - 2, new String(newTab));
			sb.append(newTab);
			fibTree(num - 1, new String(newTab));
		}
	}

	private static void fib(int n) {
		if (sols[n] == -1) {
			if (n == 0) {
				sols[n] = 0;
			} else if (n == 1) {
				sols[n] = 1;
			} else {
				fib(n - 2);
				fib(n - 1);
				sols[n] = sols[n - 2] + sols[n - 1];
			}
		}
	}

}
