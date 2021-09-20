import java.util.Scanner;

class HailstoneSequence{
	public static void main(String[] args){
		System.out.println("Enter the number for finding Hailstone sequence: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		System.out.println("The sequence is: ");
		while (n!=1){
			System.out.printf("%d ", n);
			count++;
			if (n%2 == 0)
				n /= 2;
			else
				n = n*3 + 1;
		}
			System.out.printf("%d \n", 1);
			System.out.printf("The number of elements in the sequence is %d.", count+1);
	} 
}