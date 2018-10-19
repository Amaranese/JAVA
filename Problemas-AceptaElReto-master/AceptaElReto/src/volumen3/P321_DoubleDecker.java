package volumen3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P321_DoubleDecker {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int a;
	static int n;
	static int m;
	static int rank;
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder(1000);
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		a = Integer.parseInt(br.readLine());
		for (int i = 0; i < a; i++) {
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			rank = 1;
			while(n > 0){
				rank++;
				m++;
				n--;
			}
			while(m > 0){
				rank += m;
				m--;
			}
			sb.append(rank).append("\n");
		}
		System.out.print(sb.toString());
	}

}
