package day_08;

//04.9로 나눈 나머지 
class Solution4 {
	public int solution(String number) {
		int answer = 0;

		int sum = 0;
		for (char ch : number.toCharArray()) {
			sum += Integer.parseInt(String.valueOf(ch));
		}
		answer = sum % 9;
		return answer;
	}

	public static void main(String[] args) {
		Solution4 s = new Solution4();
		System.out.println(s.solution("123"));
		System.out.println(s.solution("78720646226947352489"));
	}
}