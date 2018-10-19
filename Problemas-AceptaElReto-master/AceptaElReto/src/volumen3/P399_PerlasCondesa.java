package volumen3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.StringTokenizer;

public class P399_PerlasCondesa {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder(10000);
	static String zero = "0";
	static String space = " ";
	static String ln = "\n";
	static String no = "NO\n";

	public static void main(String[] args) throws IOException {
		String in;
		mainLoop: while (!(in = br.readLine()).equals(zero)) {
			in = in.substring(0, in.length() - 2);
			StringTokenizer st = new StringTokenizer(in);
			if(st.countTokens() % 2 == 0) {
				sb.append(no);
				continue mainLoop;
			}
			int[] pearls = new int[st.countTokens()];
			for (int i = 0; i < pearls.length; i++) {
				pearls[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(pearls);
			List<Integer> necklace = new ArrayList<>(1000);
			Deque<Integer> necklaceStack = new ArrayDeque<>(500);
			for (int i = 0; i < pearls.length; i++) {
				if (i % 2 == 0) {
					necklace.add(pearls[i]);
				} else {
					if (pearls[i] == (necklace.get(necklace.size() - 1))) {
						necklaceStack.push(pearls[i]);
					} else {
						sb.append(no);
						continue mainLoop;
					}
				}
			}
			while(!necklaceStack.isEmpty()){
				necklace.add(necklaceStack.pop());
			}
			for (Integer pearl : necklace) {
				sb.append(pearl).append(' ');
			}
			sb.replace(sb.length() - 1, sb.length(), ln);
		}
		System.out.print(sb);

	}

}
