package volumen3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class P349_JanElOlvidado {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
		int n;                                                                                                                        
		Deque<Integer> numbers = new ArrayDeque<>();
		StringBuilder sb = new StringBuilder(1000);                                
		n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String[] symbols = br.readLine().split(" ");
			for(int j = symbols.length - 1; j >= 0; j--){
				String symbol;
				if(!isOperator(symbol = symbols[j])){
					numbers.push(Integer.parseInt(symbol));
				} else {
					int op1 = numbers.pop();
					int op2 = numbers.pop();
					switch(symbol.charAt(0)){
					case '+':
						numbers.push(op1 + op2);
						break;
					case '-':
						numbers.push(op1 - op2);
						break;
					case '*':
						numbers.push(op1 * op2);
						break;
					case '/':
						numbers.push(op1 / op2);
					}
				}
			}
			sb.append(numbers.pop()).append("\n");
		}
		System.out.print(sb.toString());
	}

	private static boolean isOperator(String token) {
		return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
	}

}
