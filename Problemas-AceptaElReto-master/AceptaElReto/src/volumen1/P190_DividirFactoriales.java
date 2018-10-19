package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P190_DividirFactoriales {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException {
		while(true){
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			int den = Integer.parseInt(st.nextToken());
			if(den > num){
				break;
			}
			long res = 1;
			for(int i = den + 1; i <= num; i++){
				res *= i;
			}
			System.out.println(res);
		}
	}

}
