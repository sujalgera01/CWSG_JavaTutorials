import java.util.*;

class Main{
	static int Tribonacci(int n){
		if (n==1) return 0;
		if (n==2) return 0;
		if (n==3) return 1;
		else return (Tribonacci(n-1) + Tribonacci(n-2) + Tribonacci(n-3));
	}
	
	static void call_method(int n){
		if (n==0) return;
		else {
		call_method(n-1);
		System.out.printf("%d ", Tribonacci(n));
		} 
	}
	
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to display Tribonacci series: ");
		int n = sc.nextInt();
		call_method(n);
	} 
}