package volumen1;

import java.io.IOException;

public class P116_HolaMundo {
	public static void main(String[] args) throws IOException {
		int n = System.in.read();
		switch (n) {
		case 49:
			System.out.print("Hola mundo.\n");
			break;
		case 50:
			System.out.print("Hola mundo.\nHola mundo.\n");
			break;
		case 51:
			System.out.print("Hola mundo.\nHola mundo.\nHola mundo.\n");
			break;
		case 52:
			System.out.print("Hola mundo.\nHola mundo.\nHola mundo.\nHola mundo.\n");
			break;
		case 53:
			System.out.print("Hola mundo.\nHola mundo.\nHola mundo.\nHola mundo.\nHola mundo.\n");
		}
	}
}
