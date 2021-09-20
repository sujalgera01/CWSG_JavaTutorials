import java.lang.Math;
import java.util.*;
class Main{
	public static void main(String[]args){
		double d = Math.random();
		String s = String.valueOf(d);
		String s1 = s.substring(0, 4);
		float b = Float.parseFloat(s1);
		Scanner sc = new Scanner(System.in);
		float c;
		System.out.println("Try making Guesses: ");
		
		while (true){
			c = sc.nextFloat();
			if (c<b) 
				System.out.println("Too low");
			else if 
				(c>b) System.out.println("Too high");
			else {
				System.out.println("Congratulations! You got it. The number is: " + c );
				break;
			}
		} 
	} 
}