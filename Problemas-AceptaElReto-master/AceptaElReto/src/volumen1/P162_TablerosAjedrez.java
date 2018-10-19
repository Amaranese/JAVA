package volumen1;

import java.io.IOException;
import java.util.Scanner;

public class P162_TablerosAjedrez {

	public static void main(String[] args) throws IOException {
		StringBuilder board = new StringBuilder(1000);
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int boxSize = scan.nextInt();
			if(boxSize == 0){
				break;
			}
			char symbol = scan.next().charAt(0);
			printBorder(board, boxSize);
			for (int i = 0; i < 8; i++) {
				for (int k = 0; k < boxSize; k++) {
					board.append('|');
					for (int j = 0; j < 8; j++) {
						for (int l = 0; l < boxSize; l++) {
							if (i % 2 == 0) {
								if (j % 2 == 0) {
									board.append(' ');
								} else {
									board.append(symbol);
								}
							} else {
								if (j % 2 == 0) {
									board.append(symbol);
								} else {
									board.append(' ');
								}
							}
						}
					}
					board.append('|').append('\n');
				}
			}
			printBorder(board, boxSize);
		}
		System.out.print(board.toString());
		scan.close();
	}

	private static void printBorder(StringBuilder board, int boxSize) {
		board.append('|');
		for(int i = 0; i < boxSize * 8; i++) {
			board.append('-');
		}
		board.append('|').append('\n');
	}

}
