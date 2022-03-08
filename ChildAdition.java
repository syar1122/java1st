// This program is to learn chikdren adition
import java.util.Scanner;
public class ChildAdition {
	public static void main(String [] args){
		Scanner newS = new Scanner(System.in);
		int num1 = (int)(Math.random() *100);
		int num2 = (int)(Math.random() *100);
		System.out.println(num1 + " + " + num2 + " = ?");
		int ans = newS.nextInt();

		if(ans == (num1 + num2)){
			System.out.println("your ans is true");
		}else
		System.out.println("your ans is not true");
	}
}
