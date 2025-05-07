package day_05;

//03.주사위 게임 2
class Solution3 {
  public int solution(int a, int b, int c) {
      int answer = 0;
      int sum1 = a + b + c;
      int sum2 = a*a + b*b + c*c;
      int sum3 = a*a*a + b*b*b + c*c*c;
      
      
      if(a == b && b == c) answer = sum1*sum2*sum3;
      else if (a==b || a==c || b==c) {
      	answer = sum1 * sum2;
      }
      else {
      	answer = sum1;
      }
      return answer;
  }
  
  public static void main(String[] args) {
		Solution3 s = new Solution3();
		System.out.println(s.solution(2,6,1));
		System.out.println(s.solution(5,3,3));
		System.out.println(s.solution(4,4,4));
	}
}

