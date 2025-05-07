package day_23;

class Solution2 {
	public String solution(String[] str_list, String ex) {
        String answer = "";
        for(int i=0; i<str_list.length; i++) {
        	if(!str_list[i].contains(ex)) {
        		answer += str_list[i];
        	}
        }
        return answer;
    }
	public static void main(String[] args) {
		Solution2 s = new Solution2();
		System.out.println(s.solution(new String[] {"abc", "def", "ghi"}, "ef"));
	}
}
