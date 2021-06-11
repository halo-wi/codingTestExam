import java.util.HashMap;

public class sol {
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (String s : participant) {
			map.put(s, map.getOrDefault(s, 0) + 1);
		}
		for (String s : completion) {
			map.put(s, map.getOrDefault(s, 0) - 1);
		}
		for (String s : map.keySet()) {
			if(map.get(s).equals(1)) answer=s;
		}
		return answer;
	}
}
