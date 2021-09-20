import java.util.*;
class Main{
	public static void main(String[]args){
		System.out.println("\nPart-a)");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to print the pattern: ");
		int a = sc.nextInt();
		System.out.println();
		for (int i = 1; i <= a; i++){
			for (int j = 1; j <= (2*i - 1); j++){
				if (j <= i ) 
					System.out.printf("%d ",j);
				else 
					System.out.printf("%d ", 2*i - j);
			}
			System.out.println();
		}
		System.out.println("\nPart-b)");
		System.out.println("Enter the number of cols for the pattern.");
		a = sc.nextInt();
		System.out.println();
		for (int i = 1; i <= a*2 - 1; i++){
			for (int j = 1; j <= a; j++){
				if (i < a){
					if (j < i) 
						System.out.printf(" \t");
					else 
						System.out.printf("%d\t", j);
				}
				else{
					if (j > a*2 - 1 - i) 
						System.out.printf("%d\t", j);	
					else 
						System.out.printf("\t");
				} 
			}
			System.out.println();
		} 
	} 
}