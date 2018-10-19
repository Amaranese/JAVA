package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class P185_Potitos {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in;
		StringBuilder sb = new StringBuilder();
		while (!(in = br.readLine()).equals("0")) {
			Set<String> likes = new HashSet<>();
			Set<String> dislikes = new TreeSet<>();
			int n = Integer.parseInt(in);
			for (int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String ingredient;
				int numIngredients = st.countTokens() - 1;
				if (st.nextToken().equals("SI:")) {
					for (int j = 1; j < numIngredients; j++) {
						ingredient = st.nextToken();
						likes.add(ingredient);
						dislikes.remove(ingredient);
					}
				} else {
					for (int j = 1; j < numIngredients; j++) {
						ingredient = st.nextToken();
						if (!likes.contains(ingredient)) {
							dislikes.add(ingredient);
						}
					}
				}
			}
			for (String ingredient : dislikes) {
				sb.append(ingredient).append(" ");
			}
			if (dislikes.size() > 0) {
				sb.setCharAt(sb.length() - 1, '\n');
			} else  {
				sb.append("\n");
			}
		}
		System.out.print(sb.toString());
	}
}
