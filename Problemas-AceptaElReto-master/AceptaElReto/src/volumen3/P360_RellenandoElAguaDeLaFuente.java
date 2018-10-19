package volumen3;

import java.io.IOException;
import java.util.Scanner;

public class P360_RellenandoElAguaDeLaFuente {

	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		int n = reader.nextInt();
		for (int index = 0; index < n; index++) {
			int i = reader.nextInt();
			int m = reader.nextInt();
			int aux = i;
			int count = 0;
			int leak;
			while ((leak = reader.nextInt()) != -1) {
				aux -= leak;
				if(aux < m) {
					aux = i;
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
