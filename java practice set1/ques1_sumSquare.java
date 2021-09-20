import java.util.*;

class SumOfSquares{
	static int sum_Squares(int n){
		int sum = 0;
		for (int i = 1; i <= n; i++)
			sum += i*i;
		return sum;
	}
	
	int square_Sum(int n){
		int sum = 0;
		for (int i = 1; i<= n; i++)
			sum += i;
		return sum*sum;
	}
	
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the natural number n: ");
		int n = sc.nextInt();
		System.out.println("Sum of squares of the first 'n' natural numbers:  ");
		int ans1 = sum_Squares(n);
		System.out.println(ans1);
		
		SumOfSquares obj = new SumOfSquares();
		int ans2 = obj.square_Sum(n);
		
		System.out.println("Square of sum of the first 'n' natural numbers by non-static method is ");
		System.out.println(ans2);
		System.out.println("The differences between the values: ");
		System.out.println(ans2-ans1);
	}
}