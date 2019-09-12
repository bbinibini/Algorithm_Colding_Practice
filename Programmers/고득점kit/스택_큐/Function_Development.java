import java.util.*;

public class Function_Development {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function_Development fd = new Function_Development();
		int[] progresses = {93,30,55};
		int[] speeds = {1,30,5};
		for(int r : fd.solution(progresses, speeds)) {
			System.out.println(r);
		}
	}
	
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        Queue queue = new LinkedList<>();
        
        for(int i=0; i<progresses.length; i++) {
        	int done = (int)Math.ceil((100-progresses[i])/(double)speeds[i]);
        	queue.offer(done);
        }
        
        while(!queue.isEmpty()) {
        	int target = (int) queue.poll();
        	int length = 1;
        	int size = queue.size();
        	for(int i=0; i<size; i++) {
        		if(target >= (int)queue.peek()) {
        			queue.poll();
        			length++;
        		} else {
        			break;
        		}
        	}
        	answer.add(length);
        }
        
        
        int[] answer_ = new int[answer.size()];
        for(int i=0; i<answer.size(); i++) {
        	answer_[i] = answer.get(i);
        }
        
        return answer_;
    }

}
