import java.util.*;

public class Reverse_Word_9093 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int length = Integer.parseInt(sc.nextLine());
		Stack stack = new Stack();
		
		for(int i=0; i<length; i++) {
			String input = sc.nextLine();
			for(int j=0; j<input.length()+1; j++) {
				if(j==input.length() || input.charAt(j) == ' ' ) {
					int size = stack.size();
					for(int k=0; k<size; k++) {
						System.out.print(stack.pop());
					}
					System.out.print(" ");
					stack.clear();
				} else {
					stack.add(input.charAt(j));	
				}
			}
		}
	}

}
