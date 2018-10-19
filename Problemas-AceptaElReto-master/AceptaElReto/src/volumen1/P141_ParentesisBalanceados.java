package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class P141_ParentesisBalanceados {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<Character> pila = new ArrayDeque<>();
		boolean interrumpido = false;
		String entrada;
		while ((entrada = br.readLine()) != null) {
			char[] chars = entrada.toCharArray();
			for (int i = 0; i < chars.length && !interrumpido; i++) {
				try {
					switch (chars[i]) {
					case '(':
						pila.push(chars[i]);
						break;
					case ')':
						if (pila.peek() == '(') {
							pila.pop();
						} else {
							interrumpido = true;
						}
						break;
					case '{':
						pila.push(chars[i]);
						break;
					case '}':
						if (pila.peek() == '{') {
							pila.pop();
						} else {
							interrumpido = true;
						}
						break;
					case '[':
						pila.push(chars[i]);
						break;
					case ']':
						if (pila.peek() == '[') {
							pila.pop();
						} else {
							interrumpido = true;
						}
					}
				} catch (NullPointerException | NoSuchElementException e) {
					interrumpido = true;
				}
			}
			if (!interrumpido) {
				if (pila.isEmpty()) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			} else {
				System.out.println("NO");
			}
			interrumpido = false;
			pila.clear();
		}

	}
}