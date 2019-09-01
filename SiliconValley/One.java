
public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phrases = "happy-birthday!";
		int second = 15;
		System.out.println(solution(phrases,second));
	}

    public static String solution(String phrases, int second) {
        
        String _s = String.format("%" + 14 + "s","").replace(' ', '_');
        String answer = _s.concat(phrases).concat(_s);
        answer = answer.substring( second%(phrases.length()+14) , second%(phrases.length()+14)+14);
        
        return answer;
    }
}
