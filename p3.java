package aa;

import java.util.*;

class Solution {
	public String solution(int n, int k, String[] cmd) {
		String answer = "";
		List<String> list = new ArrayList<String>();
		Stack<Integer> st = new Stack<Integer>();
		for (int i = 0; i < n; i++) {
			list.add("O");
		}
		for (int i = 0; i < cmd.length; i++) {
			if (cmd[i].contains("U")) {
				k = k - Integer.parseInt(cmd[i].substring(2, 3));
			} else if (cmd[i].contains("D")) {
				k = k + Integer.parseInt(cmd[i].substring(2, 3));
			} else if (cmd[i].contains("C")) {
				list.remove(k);
				st.push(k);
				if(k>=list.size()) k=k-1;
				System.out.println(k);
			} else if (cmd[i].contains("Z")) {
				int index = st.pop();
				list.add(index, "O");
			}
		}
		while (!st.empty()) {
			list.add(st.pop(), "X");
		}
		for (String a : list) {
			answer += a;
		}
		return answer;
	}
}