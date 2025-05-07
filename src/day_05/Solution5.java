package day_05;

//05.이어 붙인 수
class Solution5 {
    public int solution(int[] num_list) {
        int answer = 0;
        String even = "";
        String odd = "";
        
        for(int i : num_list) {
            if(i % 2 == 0) {
            	even += i;
            }
            else {
            	odd += i;
            }
            
        }
        answer = Integer.parseInt(even) + Integer.parseInt(odd);
        return answer;
    }
    
  public static void main(String[] args) {
		Solution5 s = new Solution5();
		System.out.println(s.solution(new int[]{3, 4, 5, 2, 1}));
		System.out.println(s.solution(new int[]{5, 7, 8, 3}));
	}
}
