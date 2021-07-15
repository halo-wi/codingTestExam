class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        Arrays.sort(citations);
        
        for(int i=1; i<citations[citations.length-1]; i++){
            int count = 0;
            for( int j=0; j<citations.length; j++){
                if(i<=citations[j]) {
                    count++;
                }
                }
              if(i<=count && answer<i){
                    answer=i;
            }
        }
        
        return answer;
    }
}
