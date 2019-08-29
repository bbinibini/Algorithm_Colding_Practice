import java.util.Calendar;

public class Week_2016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 24;
		
		System.out.println(solution(a,b));
	}
	
	  public static String solution(int a, int b) {
	      
	      Calendar cal = Calendar.getInstance();
	      cal.set(Calendar.YEAR, 2016);
	      cal.set(Calendar.MONTH, a-1);
	      cal.set(Calendar.DATE, b);
	      
	      switch(cal.get(Calendar.DAY_OF_WEEK)) {
	      	case 1 :
	      		return "SUN";
	      	case 2 :
	      		return "MON";
	      	case 3 :
	      		return "TUE";
	      	case 4 :
	      		return "WED";
	      	case 5 :
	      		return "THU";
	      	case 6 :
	      		return "FRI";
	      	case 7 :
	      		return "SAT";
	      }
	      
	      return "";
	  }

}
