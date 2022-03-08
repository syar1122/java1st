import java.util.Scanner;
public class Test {
	public static void main (String [] args){
		String [][] array = new String[3][4];
		Scanner input = new Scanner(System.in);

		for (int row = 0;row < array.length ;row++){
			for(int col = 0;col < array[0].length;col++){
				array[row][col] = input.next();

			}
		}

		for (int row = 0;row < array.length ;row++){
			System.out.println();
					for(int col = 0;col < array[0].length;col++){
						System.out.print(array[row][col] + " ");

					}
		}

		for (int row = 0;row < array.length ;row++){

				for(int col = 0;col < array[0].length;col++){
					if (col == array[0].length-2){
					System.out.println( array[row][col] + " ");
					}

			}
		}
	}
}