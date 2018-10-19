package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class P169_CarreraPopular {

	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(entrada.readLine());
		for (int i = 0; i < n; i++) {
			Map<String, Integer> hermanosParticipantes = new HashMap<>();
			int participantes = 0;
			int hermanos = 0;
			String participante;
			while (!(participante = entrada.readLine()).equals("====")) {
				participante = participante.substring(0, participante.indexOf(',')).toLowerCase();
				Integer numHermanos = hermanosParticipantes.get(participante);
				if (numHermanos == null) {
					hermanosParticipantes.put(participante, 1);
				} else {
					if (numHermanos == 1) {
						hermanos += 2;
					} else {
						hermanos++;
					}
					hermanosParticipantes.put(participante, numHermanos + 1);

				}
				participantes++;
			}
			System.out.println(participantes + " " + hermanos);
		}
	}

}
