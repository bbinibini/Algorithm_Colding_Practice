import java.util.*;

public class Top {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Top top = new Top();
		int[] heights = {3,9,9,3,5,7,2};
		for(int h : top.solution(heights)) {
			System.out.println(h);
		}
	}
	
    public int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        Stack stack = new Stack();
        for(int h : heights) {
        	stack.add(h);
        }
        
        int idx = heights.length-1;
        while(!stack.isEmpty()) {
        	int target = (int) stack.pop();
        	for(int i=stack.size()-1; i>=0; i--) {
        		if(target < (int)stack.get(i)) {
        			answer[idx] = i+1;
        			break;
        		}
        	}
        	idx--;
        }

        return answer;
    }

}
