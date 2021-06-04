class Solution {
    public String solution(String s, int n) {
        String answer = "";
		char[] y = new char[s.length()];  
		for (int i = 0; i <= s.length() - 1; i++) {
			char pw = s.charAt(i);
			y[i] = pw;
			
			char c = (char) (y[i] + n);
			
			if (c > 'z') {
				c = (char) (c - 26);
			}
			else if(y[i]< 'a' && c > 'Z') {
				c = (char) (c - 26);
			}
			if (y[i] == ' ') {
				c = ' ';
			}
			answer += c;
		}
		return answer;
    }
}
