package day_02;

class Solution5 {
	public static void main(String[] args) {
		System.out.println(solution("He11oWor1d", "lloWorl", 2));
		System.out.println(solution("Program29b8UYP", "merS123", 7));
	}

	public static String solution(String my_string, String overwrite_string, int s) {
		String result = my_string.substring(0, s) + overwrite_string
				+ my_string.substring(s + overwrite_string.length());
		return result;
	}
}
