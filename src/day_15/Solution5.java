package day_15;

class Solution5 {
    public int solution(String myString, String pat) {
        int answer = 0;
        myString = myString.toUpperCase();
        pat = pat.toUpperCase();
        if(myString.contains(pat)) {
        	answer = 1;
        }else {
        	answer = 0;
        }
        return answer;
    }
	public static void main(String[] args) {
		Solution5 s = new Solution5();
		System.out.println(s.solution("AbCdEfG","aBc"));
		System.out.println(s.solution("aaAA","aaaaa"));
	}
}
