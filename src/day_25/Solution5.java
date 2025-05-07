package day_25;

class Solution5 {
	public int solution(String[] babbling) {
		int answer = 0;
		String[] words = new String[] { "aya", "ye", "woo", "ma" };
		for (int i = 0; i < babbling.length; i++) {
			for (int j = 0; j < words.length; j++) {
				if (babbling[i].contains(words[j])) {
					babbling[i] = babbling[i].replace(words[j], "word");
				}
			}
			babbling[i] = babbling[i].replace("word", "");
			if (babbling[i].equals(""))
				answer++;
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution5 s = new Solution5();
		System.out.println(s.solution(new String[] { "aya", "yee", "u", "maa", "wyeoo" }));
		System.out.println(s.solution(new String[] { "ayaye", "uuuma", "ye", "yemawoo", "ayaa" }));
	}
}
