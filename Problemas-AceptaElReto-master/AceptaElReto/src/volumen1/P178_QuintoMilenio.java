package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P178_QuintoMilenio {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sbOut = new StringBuilder(1000);
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String text = br.readLine().toLowerCase();
			String message = br.readLine().replace(" ","").toLowerCase();
			int indMessage = 0;
			for (int j = 0; j < text.length() && indMessage < message.length(); j++) {
				if(text.charAt(j) == message.charAt(indMessage)){
					indMessage++;
				}
			}
			if(indMessage == message.length()){
				sbOut.append("SI\n");
			} else {
				sbOut.append("NO\n");
			}
		}
		System.out.print(sbOut.toString());
	}

}
