package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P186_YElGanadorEs {

	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		String valor;
		while(!(valor = entrada.readLine()).equals("0 0")){
			String[] equiposGlobos = valor.split(" ");
			int[] globosEquipo = new int[Integer.parseInt(equiposGlobos[0])];
			int globos = Integer.parseInt(equiposGlobos[1]);
			for (int i = 0; i < globos; i++) {
				String[] equipoGlobo = entrada.readLine().split(" ");
				globosEquipo[Integer.parseInt(equipoGlobo[0]) - 1]++;
			}
			int ganador = 0;
			int maxGlobos = globosEquipo[0];
			for (int i = 1; i < globosEquipo.length; i++) {
				if(globosEquipo[i] == maxGlobos){
					ganador = -1;
				} else if(globosEquipo[i] > maxGlobos){
					ganador = i;
					maxGlobos = globosEquipo[i];
				}
			}
			if(ganador == -1){
				System.out.println("EMPATE");
			} else {
				System.out.println(ganador + 1);
			}
		}

	}

}
