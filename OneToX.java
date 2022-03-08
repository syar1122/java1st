import javax.swing.JOptionPane;
public class OneToX {
	public static void main (String [] args) {
		String num = JOptionPane.showInputDialog(null , "Enter number");
		int number = Integer.parseInt(num);
		int sum = 0;
		for(int i = 0; i < number ; i++){
			 sum = sum + i;
		}

			//System.out.println(sum);


			 JOptionPane.showMessageDialog(null , sum);















		}
		}