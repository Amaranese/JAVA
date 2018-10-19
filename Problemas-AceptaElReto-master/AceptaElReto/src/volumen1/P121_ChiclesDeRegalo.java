package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P121_ChiclesDeRegalo {

	private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		String datos;
		buclePrincipal: while (!(datos = entrada.readLine()).equals("0 0 0")) {
			String[] valores = datos.split(" ");
			int envoltoriosNecesarios = Integer.parseInt(valores[0]);
			int chiclesPorEnvoltorio = Integer.parseInt(valores[1]);
			int chiclesActuales = Integer.parseInt(valores[2]);
			int chiclesTotales = 0;
			int envoltorios = 0;
			while (chiclesActuales > 0) {
				int chiclesRecuperados = (chiclesActuales / envoltoriosNecesarios) * chiclesPorEnvoltorio;
				envoltorios += chiclesActuales % envoltoriosNecesarios;
				chiclesRecuperados += envoltorios / envoltoriosNecesarios;
				envoltorios = chiclesPorEnvoltorio > 0 ? envoltorios % envoltoriosNecesarios : chiclesActuales;
				if (((chiclesRecuperados / envoltoriosNecesarios) * chiclesPorEnvoltorio) >= chiclesActuales) {
					System.out.println("RUINA");
					continue buclePrincipal;
				}
				chiclesTotales += chiclesActuales;
				chiclesActuales = chiclesRecuperados;
			}
			System.out.println(chiclesTotales + " " + envoltorios);
		}

	}

}
