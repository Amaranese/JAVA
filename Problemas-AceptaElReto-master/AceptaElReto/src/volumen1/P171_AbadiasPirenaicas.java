package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P171_AbadiasPirenaicas {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in;
		StringBuilder sb = new StringBuilder();
		while(!(in = br.readLine()).equals("0")){
			StringTokenizer st = new StringTokenizer(in);
			int peaks[] = new int[Integer.parseInt(st.nextToken())];
			int index = 0;
			while(st.hasMoreTokens()){
				peaks[index] = Integer.parseInt(st.nextToken());
				index++;
			}
			index--;
			int max = peaks[index];
			int count = 1;
			for(int i = index - 1; i >= 0; i--){
				if(peaks[i] > max){
					max = peaks[i];
					count++;
				}
			}
			sb.append(count).append("\n");
		}
		System.out.print(sb.toString());
	}

}
