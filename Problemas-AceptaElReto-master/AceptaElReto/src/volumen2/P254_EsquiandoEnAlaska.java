package volumen2;

import static java.util.Arrays.sort;
import java.util.Scanner;

public class P254_EsquiandoEnAlaska {

	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		int n;
		while ((n = reader.nextInt()) != 0) {
			int[] heights = new int[n];
			for (int i = 0; i < heights.length; i++) {
				heights[i] = reader.nextInt();
			}
			int[] lengths = new int[n];
			for (int i = 0; i < lengths.length; i++) {
				lengths[i] = reader.nextInt();
			}
			sort(heights);
			sort(lengths);
			int sum = 0;
			for (int i = 0; i < heights.length; i++) {
				sum += Math.abs(heights[i] - lengths[i]);
			}
			System.out.println(sum);
		}
	}

}
