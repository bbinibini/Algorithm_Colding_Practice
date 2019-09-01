import java.util.ArrayList;
import java.util.Arrays;

public class NumberArrayDevidePerfectly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,36,1,3};
		int divisor = 1;
		int[] answer = solution(arr, divisor);
		for(int a : answer) {
			System.out.println(a);
		}
	}
	
	  public static int[] solution(int[] arr, int divisor) {
	      ArrayList<Integer> answer = new ArrayList<>(); 
	      
	      for(int a : arr) {
	    	  if(a%divisor == 0)
	    		  answer.add(a);
	      }
	      
	      if(answer.size() == 0)
	    	  answer.add(-1);
	      
	      int[] return_answer = answer.stream().mapToInt(Integer::intValue).toArray();
	      Arrays.sort(return_answer);
	      
	      return return_answer;
	  }

}
