import java.util.Scanner;
public class AverageOfTen {
	public static void main(String [] args){
		Scanner marks = new Scanner(System.in);
		int stuMark =0;
		int count = 0;
		for(int i =1;i<=10;i++){
			int sum = 0;

			for(int j =1;j<=6;j++){
				System.out.println("Enter " + j + " mark");
				stuMark = marks.nextInt();
				sum = sum + stuMark;
			}
			double average = sum/6;
			System.out.println("the " + i + "students average is " +average);
			if (average >= 50){
				count++;
			}
			System.out.println ((i - count) +" students failed.6");
		}
	}
}
