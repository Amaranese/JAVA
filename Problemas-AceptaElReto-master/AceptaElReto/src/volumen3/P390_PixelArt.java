package volumen3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P390_PixelArt {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static String si = "SI ";
	static String no = "NO\n";
	static StringBuilder sb = new StringBuilder(1000);

	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int[] mac = new int[3];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < mac.length; j++) {
				mac[j] = Integer.parseInt(st.nextToken());
			}
			String pixels = st.nextToken();
			boolean puede = mac[0] >= 0 && mac[1] >= 0 && mac[2] >= 0;
			for (int j = 0; j < pixels.length() && puede; j++) {
				switch (pixels.charAt(j)) {
				case 'M':
					mac[0]--;
					break;
				case 'A':
					mac[1]--;
					break;
				case 'C':
					mac[2]--;
					break;
				case 'R':
					mac[0]--;
					mac[1]--;
					break;
				case 'N':
					mac[0]--;
					mac[1]--;
					mac[2]--;
					break;
				case 'V':
					mac[1]--;
					mac[2]--;
					break;
				case 'L':
					mac[0]--;
					mac[2]--;
					break;
				default:

				}
				puede = mac[0] >= 0 && mac[1] >= 0 && mac[2] >= 0;
			}
			if (puede) {
				sb.append(si + mac[0] + ' ' + mac[1] + ' ' + mac[2] + "\n");
			} else {
				sb.append(no);
			}
		}
		System.out.print(sb);

	}

}
