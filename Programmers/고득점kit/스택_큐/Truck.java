import java.util.*;
public class Truck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck truck = new Truck();
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = {7,4,5,6};
		System.out.println(truck.solution(bridge_length, weight, truck_weights));
	}
	
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue queue = new LinkedList<>();
        for(int tw : truck_weights) {
        	queue.offer(tw);
        }
        if()
        
        return answer;
    }

}
