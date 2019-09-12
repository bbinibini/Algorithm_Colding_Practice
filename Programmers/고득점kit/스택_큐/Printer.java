import java.util.*;

public class Printer{
    public static void main(String[] args){
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;
        Printer printer = new Printer();
        System.out.println(printer.solution(priorities, location));
        
    }
    public int solution(int[] priorities, int location){
    	PriorityQueue<Printer_Request> priorityqueue = new PriorityQueue<Printer_Request>();
    	Queue<Printer_Request> queue = new LinkedList<Printer_Request>();
    	
    	for(int i=0; i<priorities.length; i++) {
    		priorityqueue.offer(new Printer_Request(i, priorities[i]));
    		queue.offer(new Printer_Request(i, priorities[i]));
    	}
    	
    	int i = 1;
    	while(!queue.isEmpty()) {
    		if(queue.peek().priority == priorityqueue.peek().priority) {
    			if(queue.peek().location == location) {
    				return i;
    			}
    			else {
    				queue.poll();
    				priorityqueue.poll();
    			}
    			i++;
    		} else {
    			Printer_Request pr = queue.poll();
    			queue.offer(pr);
    		}
    	}
    	
        return -1;
    }
    
    public class Printer_Request implements Comparable<Printer_Request>{
    	int location;
    	int priority;
    	public Printer_Request(int location, int priority) {
    		this.location = location;
    		this.priority = priority;
    	}
    	@Override
    	public int compareTo(Printer_Request target) {
    		if (this.priority < target.priority) {
    			return 1;
    		} else if (this.priority > target.priority) {
    			return -1;
    		} return 0;
    	}
    }
}