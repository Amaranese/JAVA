package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class P145_TrenAmor {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static String in;
	private static char[] inChars;
	private static Deque<Character> women;
	private static int couples;

	public static void main(String[] args) throws IOException {
		while ((in = br.readLine()) != null) {
			couples = 0;
			women = new ArrayDeque<>();
			inChars = in.toCharArray();
			for (int i = inChars.length - 1; i >= 0; i--) {
				switch (inChars[i]) {
				case 'm':
					women.push(inChars[i]);
					break;
				case 'M':
					women.push(inChars[i]);
					break;
				case 'h':
					if (!women.isEmpty()) {
						if (women.peek().equals('m')) {
							women.pop();
							couples++;
						} else {
							women.clear();
						}
					}
					break;
				case 'H':
					if (!women.isEmpty()) {
						if (women.peek().equals('M')) {
							women.pop();
							couples++;
						} else {
							women.clear();
						}
					}
					break;
				case '@':
					women.clear();
				}
			}
			System.out.println(couples);
		}

	}

}
