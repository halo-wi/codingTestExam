class Solution {
	public int[] solution(String code, String day, String[] data) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<Integer>();
		for (String a : data) {
			if (a.indexOf(code) != -1 && a.indexOf(day) !=-1) {
				int blank = a.indexOf(" ");
				int time = a.indexOf("time")+5;
				String t = a.substring(time, time+10);
				String price = a.substring(6, blank);
				map.put(Integer.parseInt(t), Integer.parseInt(price));
				list.add(Integer.parseInt(t));
			}
		}
		System.out.println(list.size());
		Collections.sort(list);
		int[] answer = new int[list.size()];
		for(int i=0; i<list.size(); i++) {
			answer[i]=map.get(list.get(i));
			System.out.println(list.get(i));
			System.out.println(map.get(list.get(i)));
		}
		return answer;
	}
}
