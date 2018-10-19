package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P192_Por3oMas5 {

	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		String nStr;
		while (!(nStr = entrada.readLine()).equals("0")) {
			int n = Integer.parseInt(nStr);
			if (por3oMas5(n)) {
				System.out.println("SI");
			} else {
				System.out.println("NO");
			}
		}

	}

	private static boolean por3oMas5(int n) {
		boolean[] flags = new boolean[20001];
		por3oMas5Aux(n, 1, flags);
		return flags[n];
	}

	private static void por3oMas5Aux(int n, int m, boolean[] flags) {
		if (m == n) {
			flags[m] = true;
		} else if (m < n) {
			flags[m] = true;
			int por3 = m * 3;
			int mas5 = m + 5;
			if (((n - mas5) % 5) == 0) {
				por3oMas5Aux(n, n, flags);
			}
			if (por3 <= n) {
				if (!flags[por3]) {
					por3oMas5Aux(n, por3, flags);
					if (!flags[mas5]) {
						por3oMas5Aux(n, mas5, flags);
					}
				}
			}
		}
	}

}
