package volumen4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P418_RENUM {

	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(reader.readLine());
		for (int i = 0; i < n; i++) {
			StringBuilder renumSb = new StringBuilder(1000);
			Map<String, String> renumMap = new HashMap<>(100);
			List<String[]> program = new ArrayList<>(100);
			String line;
			int newNum = 10;
			while (!(line = reader.readLine()).equals("0")) {
				String[] statement = line.split(" ");
				String newNumStr = String.valueOf(newNum);
				renumMap.put(statement[0], newNumStr);
				statement[0] = newNumStr;
				program.add(statement);
				newNum += 10;
			}
			for (String[] statement : program) {
				renumSb.append(statement[0]).append(' ').append(statement[1]);
				if (statement.length == 3) {
					statement[2] = renumMap.get(statement[2]);
					renumSb.append(' ').append(statement[2]);
				}
				renumSb.append('\n');
			}
			renumSb.append("---");
			System.out.println(renumSb);
		}
	}

}
