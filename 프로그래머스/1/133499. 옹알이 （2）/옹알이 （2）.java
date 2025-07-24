class Solution {
	public int solution(String[] babbling) {
		int answer = 0;
		String[] word = { "aya", "ye", "woo", "ma" };

		for (String b : babbling) {
			String pre = "";
			boolean isWord = true;

			while (!b.isEmpty()) {
				boolean isMatch = false;

				for (String w : word) {
					if (b.startsWith(w)) {
						if (w.equals(pre)) {
							isWord = false;
							break;
						}
						b = b.substring(w.length());
						pre = w;
						isMatch = true;
						break;
					}
				}

				if (!isMatch || !isWord) {
					isWord = false;
					break;
				}
			}
			if (isWord)
				answer++;
		}
		return answer;
	}
}