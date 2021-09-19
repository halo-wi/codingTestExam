class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
     int[] answer = new int[2];        
        int count = 0, zero =0;        
        for(int l : lottos) {
        	for(int w : win_nums) {
        		if(l==w) count++;
        	}
        	if(l==0) zero++;
        }
        answer[1] = 7 -count;
        answer[0] = 7 -count - zero;
        
        for(int i =0; i<2; i++) {
        	if(answer[i]==7) answer[i]--;
        }
        return answer;
    }
}
