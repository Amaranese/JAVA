package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P123_ConjugarVerbos {

	private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	private static String[] pronombres = new String[] { "yo", "tu", "el", "nosotros", "vosotros", "ellos" };
	private static String[][][] tablaConjugaciones = new String[][][]
			{
				{ { "o", "as", "a", "amos", "ais", "an" } ,  { "e", "aste", "o", "amos", "asteis", "aron"   } ,  { "are", "aras", "ara", "aremos", "areis", "aran" } },
				{ { "o", "es", "e", "emos", "eis", "en" } ,  { "i", "iste", "io", "imos", "isteis", "ieron" } ,  { "ere", "eras", "era", "eremos", "ereis", "eran" } },
				{ { "o", "es", "e", "imos", "is", "en"  } ,  { "i", "iste", "io", "imos", "isteis", "ieron"  },  { "ire", "iras", "ira", "iremos", "ireis", "iran" } }
			};

	public static void main(String[] args) throws IOException {
		while (true) {
			String[] verboTiempo = entrada.readLine().split(" ");
			if (verboTiempo[1].equals("T")) {
				break;
			}
			int indiceCojugacion;
			switch (verboTiempo[0].substring(verboTiempo[0].length() - 2, verboTiempo[0].length())) {
				case "ar":
					indiceCojugacion = 0;
					break;
				case "er":
					indiceCojugacion = 1;
					break;
				default:
					indiceCojugacion = 2;
			}
			int indiceTiempo;
			switch (verboTiempo[1]) {
				case "A":
					indiceTiempo = 0;
					break;
				case "P":
					indiceTiempo = 1;
					break;
				default:
					indiceTiempo = 2;
			}
			String raiz = verboTiempo[0].substring(0, verboTiempo[0].length() - 2);
			StringBuilder conjugacion = new StringBuilder(1000);
			for (int i = 0; i < pronombres.length; i++) {
				conjugacion.append(pronombres[i]).append(' ').append(raiz)
						.append(tablaConjugaciones[indiceCojugacion][indiceTiempo][i]).append('\n');
			}
			System.out.print(conjugacion);
		}
	}

}
