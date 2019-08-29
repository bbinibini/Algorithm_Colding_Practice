
public class Middle_Letter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcdef";
		System.out.println(solution(s));
	}
	
	public static String solution(String s) {
	    String answer = "";
	    
	    if(s.length() % 2 == 0)
	    	answer += s.charAt(s.length()/2 -1);
	    answer += s.charAt(s.length()/2);
	    
	    return answer;
	}
}
