import java.util.*;

public class Stack_10828 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List list = new ArrayList();
		int length = sc.nextInt();
		for(int i=0 ; i<length; i++) {
			String input = sc.next();
			if(input.equals("push")) {
				list.add(sc.nextInt());
			}
			if(input.equals("pop")) {
				if(list.size()==0) {
					System.out.println(-1);
				} else {
					System.out.println(list.get(list.size()-1));
					list.remove(list.size()-1);
						
				}
			}
			if(input.equals("size")){
				System.out.println(list.size());
			}
			if(input.equals("empty")){
				if(list.size()==0) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
			}
			if(input.equals("top")) {
				if(list.size()==0) {
					System.out.println(-1);
				} else {
					System.out.println(list.get(list.size()-1));
				}
			}
		}
		sc.close();
	}
}
