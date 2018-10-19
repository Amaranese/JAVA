package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P166_Zapping {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in;
		StringBuilder sbOut = new StringBuilder(1000);
		while(!(in = br.readLine()).equals("0 0")){
			String[] channels = in.split(" ");
			int source = Integer.parseInt(channels[0]);
			int dest = Integer.parseInt(channels[1]);
			if(dest >= source){
				sbOut.append(Math.min(dest - source, 99 - dest + source));
			} else {
				sbOut.append(Math.min(source - dest, 99 - source + dest));
			}
			sbOut.append('\n');
		}
		System.out.print(sbOut.toString());
	}

}
