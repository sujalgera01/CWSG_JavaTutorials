import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int countInt = 0, countFloat = 0, countString = 0, totalInt = 0;
		float totalFloat = 0;
		
		while (true){
			if (sc.hasNextInt()){
				countInt++;
				countString = 0;
				totalInt += sc.nextInt();
			}
			else if (sc.hasNextFloat()){
				countFloat++;
				countString = 0;
				totalFloat += sc.nextFloat();
			}
			else{
				countString++;
				sc.next();
				if (countString == 3){
					break;
				}
			}
		}
		
		System.out.println("Integer Value Count is: " + countInt);
		System.out.println("Float Value Count is: " + countFloat);
		System.out.println("Integer average is: " + (totalInt/countInt));
		System.out.println("Float average is: " + (totalFloat/countFloat));
	}

}