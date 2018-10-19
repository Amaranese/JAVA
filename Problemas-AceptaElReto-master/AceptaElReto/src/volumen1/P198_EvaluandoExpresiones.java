package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class P198_EvaluandoExpresiones {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in;
		Deque<Integer> numbersStack;
		Queue<Integer> numbersQueue;
		StringBuilder sb = new StringBuilder(1000);
		
		while ((in = br.readLine()) != null) {
			Exception divByZero = null;

			// Stack
			String resultStack = new String();
			numbersStack = new ArrayDeque<>();
			char[] symbols = in.toCharArray();
			try {
				for (int i = 0; i < symbols.length; i++) {
					char symbol = symbols[i];
					if (!isOperator(symbol)) {
						numbersStack.push(Character.getNumericValue(symbol));
					} else {
						int op2 = numbersStack.pop();
						int op1 = numbersStack.pop();
						switch (symbol) {
						case '+':
							numbersStack.push(op1 + op2);
							break;
						case '-':
							numbersStack.push(op1 - op2);
							break;
						case '*':
							numbersStack.push(op1 * op2);
							break;
						case '/':
							numbersStack.push(op1 / op2);
						}
					}
				}
			} catch (Exception e) {
				divByZero = e;
			}
			resultStack = divByZero != null ? "ERROR" : numbersStack.pop().toString();

			divByZero = null;
			
			// Queue
			String resultQueue = new String();
			numbersQueue = new ArrayDeque<>();
			try {
				for (int i = 0; i < symbols.length; i++) {
					char symbol = symbols[i];
					if (!isOperator(symbol)) {
						numbersQueue.add(Character.getNumericValue(symbol));
					} else {
						int op2 = numbersQueue.remove();
						int op1 = numbersQueue.remove();
						switch (symbol) {
						case '+':
							numbersQueue.add(op1 + op2);
							break;
						case '-':
							numbersQueue.add(op1 - op2);
							break;
						case '*':
							numbersQueue.add(op1 * op2);
							break;
						case '/':
							numbersQueue.add(op1 / op2);
						}
					}
				}
			} catch (Exception e) {
				divByZero = e;
			}
			resultQueue = divByZero != null ? "ERROR" : numbersQueue.remove().toString();
			
			sb.append(resultStack);
			if(resultStack.equals(resultQueue)){
				sb.append(" = ");
			} else {
				sb.append(" != ");
			}
			sb.append(resultQueue).append("\n");
		}
		System.out.print(sb.toString());
	}

	private static boolean isOperator(char symbol) {
		return symbol == '+' || symbol == '-' || symbol == '*' || symbol == '/';
	}

}
