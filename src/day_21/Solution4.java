package day_21;

class Solution4 {
    public int solution(String num_str) {
        int answer = 0;
        for(char ch : num_str.toCharArray()) {
        	answer += ch - '0';
        }
        return answer;
    }
    public static void main(String[] args) {
		Solution4 s = new Solution4();
		System.out.println(s.solution("123456789"));
		System.out.println(s.solution("1000000"));
	}
}
