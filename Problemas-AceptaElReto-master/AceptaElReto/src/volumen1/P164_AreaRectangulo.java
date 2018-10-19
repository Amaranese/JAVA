package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P164_AreaRectangulo {

	private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	private static String espacio = " ";

	public static void main(String[] args) throws IOException {
		String[] vertices;
		while (true) {
			vertices = entrada.readLine().split(espacio);
			int h = Integer.parseInt(vertices[2]) - Integer.parseInt(vertices[0]);
			int b = Integer.parseInt(vertices[3]) - Integer.parseInt(vertices[1]);
			if (h < 0 || b < 0) {
				break;
			}
			System.out.println(b * h);
		}
	}

}
