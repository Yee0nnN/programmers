package day_04;

//01.n의 배수
class Solution {
    public int solution(int num, int n) {
        int answer = 0;
        
        if(num%n==0) {
        	answer = 1;
        }else {
        	answer = 0;
        }
        return answer;
    }
    
    public static void main(String[] args) {
    	Solution s = new Solution();
		System.out.println(s.solution(98,2));
		System.out.println(s.solution(34,3));
	}
}

