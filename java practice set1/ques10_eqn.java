import java.io.*;
import java.util.Scanner;
public class eqn{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String e=in.nextLine();
        int i;
        System.out.print("Reactants of the equation are: ");
        for(String p : e.split("-")[0].split(" ")){
            if(p.charAt(0)>='A' && p.charAt(0)<='Z') 
				System.out.print("1 mole of "+ p);
            else if(p.charAt(0)>='0' && p.charAt(0)<='9'){
                for(i=0;i<p.length() && p.charAt(i)>='0' && p.charAt(i)<='9';i++);
					System.out.print(p.substring(0,i));
					System.out.print(" mole of "+p.substring(i)+" , ");
            }
        }
        System.out.print("\nProducts formed are: ");
        for(String p : e.split("-")[1].split(" ")){
            if(p.charAt(0)>='A' && p.charAt(0)<='Z') 
				System.out.print("1 mole of "+p + " ,");
            else if(p.charAt(0)>='0' && p.charAt(0)<='9'){
                for(i=0;i<p.length() && p.charAt(i)>='0' && p.charAt(i)<='9';i++);
					System.out.print(p.substring(0,i));
					System.out.print(" mole of "+p.substring(i)+", ");
            }
        }
        System.out.print("\n");
    }
}
