package volumen2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class P214_AbdicacionRey {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in;
		StringBuilder sb = new StringBuilder();
		while(!(in = br.readLine()).equals("0")){
			StringTokenizer reyes = new StringTokenizer(br.readLine());
			Map<String, Integer> reyesMap = new HashMap<>();
			int nReyes = Integer.parseInt(in);
			int i = 0;
			while(reyes.hasMoreTokens() && i < nReyes){
				String rey = reyes.nextToken();
				if(reyesMap.containsKey(rey)){
					reyesMap.put(rey, reyesMap.get(rey)+1);
				} else {
					reyesMap.put(rey, 1);
				}
				i++;
			}
			int nSucesores = Integer.parseInt(br.readLine());
			StringTokenizer sucesores = new StringTokenizer(br.readLine());
			i = 0;
			while(sucesores.hasMoreTokens() && i < nSucesores){
				String sucesor = sucesores.nextToken();
				int numero = 1;
				if(reyesMap.containsKey(sucesor)){
					numero += reyesMap.put(sucesor, reyesMap.get(sucesor) + 1);
				} else {
					reyesMap.put(sucesor, 1);
				}
				i++;
				sb.append(numero+"\n");
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}

}
