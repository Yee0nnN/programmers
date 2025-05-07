package day_06;

//02.수 조작하기 1
class Solution2 {
	public int solution(int n, String control) {
		int answer = 0;
		for (int i = 0; i < control.length(); i++) {
			char ch = control.charAt(i);
			switch (ch) {
			case 'w' -> n += 1;
			case 's' -> n -= 1;
			case 'd' -> n += 10;
			case 'a' -> n -= 10;
			}

			answer = n;

		}
		return answer;
	}

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		System.out.println(s.solution(0, "wsdawsdassw"));
	}
}
