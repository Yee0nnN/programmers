package day_18;

class Solution5 {
    public String solution(String rny_string) { 
        return rny_string.replace("m", "rn"); 
    }
    
	public static void main(String[] args) {
		Solution5 s = new Solution5 ();
		System.out.println(s.solution("masterpiece"));
		System.out.println(s.solution("programmers"));
		System.out.println(s.solution("jerry"));
		System.out.println(s.solution("burn"));
	}
}


