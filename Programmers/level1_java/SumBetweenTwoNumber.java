
public class SumBetweenTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = 5;
		System.out.println(solution(a,b));
	}

	  public static long solution(int a, int b) {
	      long answer = 0;
	      
	      //Math.min(a,b)
	      //Math.amx(b,a)
	      for(int i = (a<b)?a:b; i<=((a<b)?b:a); i++) 
	    	  answer += i;
	      
	      return answer;
	  }
}
