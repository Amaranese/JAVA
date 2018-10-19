package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P103_ProblemasDeHerencia {

	public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		String gradoStr;
		while (!(gradoStr = entrada.readLine()).equals("20")) {
			int grado = Integer.parseInt(gradoStr);
			String[] coeficientes = entrada.readLine().split(" ");
			int rectangulos = Integer.parseInt(entrada.readLine());
			if (rectangulos > 1000) {
				rectangulos = 1000; // Precision
			}
			// Suma de Riemann
			double area = 0;
			for (int i = 0; i < rectangulos; i++) {
				// im(f)
				double im = 0;
				for (int j = 0; j < coeficientes.length - 1; j++) {
					im += Float.parseFloat(coeficientes[j]) * Math.pow((float) i / rectangulos, grado - j);
				}
				im += Float.parseFloat(coeficientes[coeficientes.length - 1]); // termino independiente
				if (im > 1) {
					area++; // Si im(f) excede 1 (sobrepasa la hectarea), area = area + 1
				} else if (im > 0) {
					area += im;
				}
				// im(f) negativa (por debajo de la hectarea) no suma
			}
			area /= rectangulos; // Sacamos la constante del sumatorio
			double diferencia = area - (1 - area);
			if (Math.abs(diferencia) <= 0.001) {
				System.out.println("JUSTO");
			} else if (diferencia > 0) {
				System.out.println("CAIN");
			} else {
				System.out.println("ABEL");
			}
		}
	}

}
