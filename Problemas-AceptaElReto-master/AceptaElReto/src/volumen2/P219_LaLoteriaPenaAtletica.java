package volumen2;

import java.io.IOException;

public class P219_LaLoteriaPenaAtletica {

	static StringBuilder sb = new StringBuilder(1000);
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		int n = readNumber();

		for (int i = 0; i < n; i++) {
			
			int pre = -1;
			
			while((pre = System.in.read()) != 10);
			
			pre = -1;
			int pares = 0;
			int actual;
			do {
				actual = System.in.read();
				if (whiteChar(actual)) {
					if (!whiteChar(pre) && pre != 13) {
						if ((pre & 1) == 0) {
							pares++;
						}
					}
				}
				if (actual != 13) {
					pre = actual;
				}
			} while (actual != 10);
			sb.append(pares + "\n");
		}
		System.out.print(sb.toString());
	}
	
	private static int readNumber() throws IOException{
		int in;
		int[] charsCode = new int[4];
		
		for (int i = 0; i < charsCode.length; i++) {
			charsCode[i] = -1;
		}
		int index = 0;
		do {
			in = System.in.read();
			if (in != 13 && in != 10) {
				charsCode[index] = toInt(in);
			}
			index++;
		} while (in != 10);

		int number = 0;
		int factor = 1;
		for (int i = charsCode.length - 1; i >= 0; i--) {
			if (charsCode[i] != -1) {
				number += charsCode[i] * factor;
				factor *= 10;
			}
		}
		return number;
	}
	
	public static int toInt(int code) {
		switch (code) {
		case 48:
			return 0;
		case 49:
			return 1;
		case 50:
			return 2;
		case 51:
			return 3;
		case 52:
			return 4;
		case 53:
			return 5;
		case 54:
			return 6;
		case 55:
			return 7;
		case 56:
			return 8;
		default:
			return 9;
		}
	}
	
	private static boolean whiteChar(int code){
		return code == 9 || code == 10 || code == 32;
	}
}