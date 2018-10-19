package volumen2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P252_AcasoHuboBuhosAca {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in;
		String si = "SI\n";
		String no = "NO\n";
		StringBuilder outSb = new StringBuilder(1000);
		while(!(in = br.readLine()).equals("XXX")){
			String aux = in.replace(" ","").toLowerCase();
			String reverse = new StringBuilder(aux).reverse().toString();
			if(aux.equals(reverse)){
				outSb.append(si);
			}else{
				outSb.append(no);
			}
		}
		System.out.print(outSb.toString());
	}

}
