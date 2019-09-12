import java.util.Arrays;

public class KthNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		int[] answer = solution(array, commands);
		for(int a  : answer) {
			System.out.println(a);
		}
	}
	
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0; i<commands.length; i++) {
            int[] sub_array = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
            Arrays.sort(sub_array);
            answer[i] = sub_array[commands[i][2]-1];
        }
        
        return answer;
    }

}
