package volumen1;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

public class P143_Tortitas {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		Deque<Integer> tortitasStack;
		Queue<Integer> auxQueue;
		StringBuilder sbOut = new StringBuilder(1000);
		while (true) {
			int n;
			tortitasStack = new ArrayDeque<>();
			while ((n = scan.nextInt()) != -1) {
				tortitasStack.push(n);
			}
			auxQueue = new ArrayDeque<>();
			int num = scan.nextInt();
			if(num == 0 && tortitasStack.size() == 0){
				break;
			}
			for (int i = 0; i < num; i++) {
				int it = scan.nextInt();
				for (int j = 0; j < it; j++) {
					auxQueue.add(tortitasStack.pop());
				}
				while (!auxQueue.isEmpty()) {
					tortitasStack.push(auxQueue.remove());
				}
			}
			sbOut.append(tortitasStack.pop()).append('\n');
		}
		System.out.print(sbOut.toString());
		scan.close();
	}

}
