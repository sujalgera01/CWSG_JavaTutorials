import java.util.*;

class ques2_findAvg{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int integerCount = 0, floatingCount = 0, strCount = 0, totalIntAvg = 0;
		float totalFloatAvg = 0;
		
		while (true){
			System.out.println("Enter the Value: ");
			if (sc.hasNextInt()){
				integerCount++;
				strCount = 0;
				totalIntAvg += sc.nextInt();
			}
			else if (sc.hasNextFloat()){
				floatingCount++;
				strCount = 0;
				totalFloatAvg += sc.nextFloat();
			}
			else{
				strCount++;
				sc.next();
				if (strCount == 3){
					break;
				}
			}
		}
		
		System.out.println("Integer Value Count is: " + integerCount);
		System.out.println("Float Value Count is: " + floatingCount);
		System.out.println("Integer average is: " + (totalIntAvg/integerCount));
		System.out.println("Float average is: " + (totalFloatAvg/floatingCount));
	}

}