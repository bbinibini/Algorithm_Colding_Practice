
public class Racket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(volume_sphere(1));
	}
	
	public static int dollarToWon(int dollar) {
		return dollar*1200;
	}
	
	public static int digit_sum(int a, int b, int c) {
		return a+b+c;
	}
	
	public static double volume_sphere(int radius) {
		return (4/3)*3.14*radius*radius*radius;
	}
	
	public static boolean is_even(int number){
		return (number%2==2);
	}
	
	public static int combination(int n, int k) {
		int nCr = factorial(n) / (factorial(n-k) * factorial(k));
		return nCr;
	}
	
	public static int factorial(int n) {
		int fact = 1;
		for(int i=1; i<=n; i++) 
			fact = fact * i;
		return fact;
	}

}
