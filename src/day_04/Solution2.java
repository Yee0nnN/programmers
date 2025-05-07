package day_04;

//02.공배수
class Solution2 {
    public int solution(int number, int n, int m) {
        int answer = 0;
        
        if(number%n==0 && number%m==0) {
        	answer = 1;
        }else {
        	answer = 0;
        }
        return answer;
    }
    
    public static void main(String[] args) {
		Solution2 s = new Solution2();
		System.out.println(s.solution(60,2,3));
		System.out.println(s.solution(55,10,5));
	}
}