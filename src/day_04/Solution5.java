package day_04;

//05.flag에 따라 다른 값 반환하기
class Solution5 {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        
        if(flag == true) {
        	answer = a+b;
        }
        else {
        	answer = a-b;
        }
        return answer;
    }
    
	public static void main(String[] args) {
		Solution5 s = new Solution5();
		System.out.println(s.solution(-4, 7, true));
		System.out.println(s.solution(-4, 7, false));
	}
}