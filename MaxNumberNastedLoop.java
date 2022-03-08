/* this program let the user to enter 10 numbers and find the maximum one */

import java.util.Scanner;
public class MaxNumberNastedLoop{
	public static void main (String [] args){
		Scanner number =new Scanner (System.in);
		int num = 0;
		for(int i=1;i<=10;i++){
			System.out.println("Enter " + i + " th number.");
			num = number.nextInt();
		}


	}
}