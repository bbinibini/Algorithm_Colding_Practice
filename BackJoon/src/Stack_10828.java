import java.util.Stack;
import java.util.Scanner;

public class Stack_10828 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Stack stack = new Stack();
		int length = sc.nextInt();
		for(int i=0 ; i<length; i++) {
			String input = sc.next();
			if(input.equals("push")) {
				stack.push(sc.nextInt());
			}
			if(input.equals("pop")) {
				System.out.println(stack.pop());
				// empty 체크 못함
			}
			if(input.equals("size")){
				System.out.println(stack.size());
			}
			if(input.equals("empty")){
				System.out.println(stack.empty());
				//true, false로 반환
			}
			if(input.equals("top")) {
				System.out.println(stack.peek());
			}
		}
		sc.close();
	}
}
