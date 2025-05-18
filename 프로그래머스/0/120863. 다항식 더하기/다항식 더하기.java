class Solution {
	public String solution(String polynomial) {
		String answer = "";
		String[] str = polynomial.split(" ");
		int sum = 0;
		int xSum = 0;
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("+")) {
				continue;
			}
			if (str[i].contains("x")) {
				String Xnum = str[i].replace("x", "");
				xSum += Xnum.isEmpty() ? 1 : Integer.parseInt(Xnum);
			} else {
				sum += Integer.parseInt(str[i]);
			}
		}
		if (xSum == 0) {
			answer = String.valueOf(sum);
		} else if (sum == 0) {
			answer = (xSum == 1) ? "x" : String.valueOf(xSum) + "x";
		} else {
			answer = ((xSum == 1) ? "x" : String.valueOf(xSum) + "x") + " + " + sum;
		}
		return answer;
	}
}
