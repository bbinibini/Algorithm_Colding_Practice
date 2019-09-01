
public class Three {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] estimates = {1,1,9,3,7,6,5,10};
		int second = 4;
		System.out.println(solution(estimates,second));
	}

    public static int solution(int[] estimates, int k) {
        int max = 0;
        for(int i=0; i<estimates.length-k+1; i++) {
        	int compare_max = 0;
        	for(int j=0 ;j<k; j++) {
        		compare_max += estimates[i+j];
        	}
        	if(compare_max > max)
        		max = compare_max;
        }
        return max;
    }
}
