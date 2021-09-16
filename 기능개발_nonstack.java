import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
		int[] answer = {};

		List<Integer> list = new ArrayList<Integer>();

		int temp = (100-progresses[0]) / speeds[0], count = 0;
		
		if ((100-progresses[0]) % speeds[0] != 0) {
			temp++;
		}

		for (int i = 0; i < speeds.length; i++) {
			int work = (100-progresses[i]) / speeds[i];
			if ((100-progresses[i]) % speeds[i] != 0) {
				work++;
			}
	
			if (temp < work) {
				list.add(count);
				count=1;
				temp = work;
				continue;
			}
			count++;
		}
		list.add(count);

		answer = new int[list.size()];

		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}

		return answer;
    }
}
