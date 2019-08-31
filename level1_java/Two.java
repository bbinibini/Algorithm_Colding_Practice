
public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] office = {{1,0,0,0},{0,0,0,1},{0,0,1,0},{0,1,1,0}};
		int k = 4;

		System.out.println(solution(office,k));
	}

    public static int solution(int[][] office, int k) {
        int Max_Number = 0;
        int N = office.length;
        for(int i =0; i<N-k+1; i++) {
        	for(int j = 0; j<N-k+1; j++) {
        		int Number = 0;
	        	for(int row=0; row<k; row++) {
	        		System.out.println(row+i);
	        		for(int col=0; col<k; col++) {
	        			System.out.println(col+j);
	        			Number += office[row+i][col+j];
	        		}
	        		System.out.println();
	        	}
	        	if(Max_Number < Number) {
	        		Max_Number = Number;
	        	}
        	}
        }
//        
        return Max_Number;
    }
}
