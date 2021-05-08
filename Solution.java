package aa;

import java.util.ArrayList;
import java.util.List;

class Solution {
	public int[] solution(String[][] places) {
		int[] answer = { 1, 1, 1, 1, 1 };
		for (int i = 0; i < 5; i++) {
			System.out.println("==");
			List<Integer> list = new ArrayList<Integer>();
			for (int j = 0; j < 5; j++) {
				if (places[i][j].contains("P")) {
					int k = places[i][j].indexOf("P");
					String s = places[i][j].substring(k + 1);
					int m = k;
					while (k != -1) {
						list.add(j);
						list.add(m);
						System.out.println(j+" + "+m);
						k = s.indexOf("P");
						s = s.substring(k + 1);
						m = k + m + 1;
					}
				}
			}

			for (int j = 0; j < list.size() - 3; j += 2) {
				int px = list.get(j);
				int py = list.get(j + 1);
				int a = px - list.get(j + 2);
				int b = py - list.get(j + 3);

				double l = Math.sqrt(a * a + b * b);
				System.out.println("a="+px+","+py);
				System.out.println("b="+list.get(j + 2)+","+list.get(j + 3));
					System.out.println(l);
				if (l < 1.5 && py < 4) {
					//System.out.println(places[i][px].substring(py, py + 1));
					//System.out.println(places[i][px].substring(py + 1, py + 2));
					//System.out.println(places[i][px + 1].substring(py, py + 1));
					System.out.println("!");
					if (!places[i][px].substring(py + 1, py + 2).equals("X")
							|| (!places[i][px + 1].substring(py, py + 1).equals("X")&&px<4)) {
						answer[i] = 0;
					}
				} else if (l == 2 && px < 5 && py < 5) {
					//System.out.println(places[i][px].substring(py + 1, py + 2));
					if (a == 0 && py < 3) {
						System.out.println("@");
						if (!places[i][px].substring(py + 1, py + 2).equals("X")) {
							answer[i] = 0;
						}
					}
					if (b == 0 && py < 4 && px < 4) {
						System.out.println("#");
						//System.out.println(places[i][px + 1].substring(py, py + 1));
						if (!places[i][px + 1].substring(py, py + 1).equals("X")) {
							answer[i] = 0;
						}
					}

				}

			}
		}
		return answer;
	}
}