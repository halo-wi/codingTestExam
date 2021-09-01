class Sol {
	public String[] solution(String[] record) {
		int count=0;
		Map<String, String> map = new HashMap();

		for (int i = 0; i < record.length; i++) {
			
			String[] s = record[i].split(" ");
			
			if(s[0].equals("Change")) {
				count++;
			}
			
			if(!s[0].equals("Leave")) {
			String uid = s[1];
			String nick = s[2];

			if (map.containsKey(uid)) {
				map.replace(uid, nick);
			}
			map.putIfAbsent(uid, nick);
			}
		}
		
		String[] answer = new String[record.length-count];
		int index = 0;
		for (int i = 0; i < record.length; i++) {
			
			
			
			String[] s = record[i].split(" ");
			String be = s[0];
			
			if(be.equals("Enter")) {
				be="들어왔습니다.";
			}
			else if(be.equals("Leave")) {
				be="나갔습니다.";
			}
			else if(be.equals("Change")) {
				continue;
			}
			
			index++;
			answer[index-1] = map.get(s[1])+"님이 "+be;
			
			System.out.println(index);
		}
		
		

		return answer;
	}
}
