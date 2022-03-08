import javax.swing.JOptionPane;
public class TimeTable {
	public static void main (String [] args) {
		String num = JOptionPane.showInputDialog(null , "Enter number");
		int number = Integer.parseInt(num);
		int sum = 1;
		for(int i = 1; i <= 10 ; i++){
			 sum = number * i;
			 System.out.println(number + "*" + i + "=" + sum);
		}
	}
}