package solution;

import java.util.HashMap;

public class BackTracking {

	static String input = "256";
	static String[] array = new String[input.length()];
	static HashMap<String, String[]> map = new HashMap<String, String[]>();

	public static void main(String[] args) {

		map.put("2", new String[] { "a", "b", "c" });
		map.put("3", new String[] { "d", "e", "f" });
		map.put("4", new String[] { "h", "i", "j" });
		map.put("5", new String[] { "k", "l", "m" });
		map.put("6", new String[] { "n", "o", "p" });
		map.put("7", new String[] { "q", "r", "s" });
		map.put("8", new String[] { "t", "u", "v" });
		map.put("9", new String[] { "w", "c", "y", "z" });

		bt(0, "");

	}

	private static void bt(int i, String s) {

		if (i >= input.length()) {
			System.out.println(s);
		}

		else {

			String num = input.substring(i, i + 1);
			String[] tr = map.get(num);
			for (String c : tr) {
				bt(i + 1, s + c);
			}
		}

	}

}
