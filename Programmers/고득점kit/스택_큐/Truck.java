import java.util.*;
public class Truck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck truck = new Truck();
		int bridge_length = 100;
		int weight = 100;
		int[] truck_weights = {10};
		System.out.println(truck.solution(bridge_length, weight, truck_weights));
	}
	
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue queue = new LinkedList<>();
        for(int tw : truck_weights) {
        	queue.offer(tw);
        }
        
        while(!queue.isEmpty()) {
        	int truck_w = 0;
        	
        }
        
        return answer;
    }

}
