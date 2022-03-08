
import java.util.Scanner;

public class ReilFence {
    public static void main(String[] args) {
        encrypt();
    }
    public static void encrypt(){
            Scanner scan =new Scanner(System.in);

            System.out.println("Enter the plain text");
            String plainText=scan.next();

            scan.nextLine();

            System.out.println("Enter the reil key");
            int key=scan.nextInt();
            scan.nextLine();

            char reilArr[][]=new char[key][plainText.length()];

                for (int i = 0; i < reilArr.length; i++) {
                for (int j = 0; j < plainText.length(); j++) {
                    reilArr[i][j]='.';
                }}

            int row=0;
            int c=0;

            for (int i = 0; i < plainText.length(); i++) {

                if(c==0){
                    reilArr[row][i]=plainText.charAt(i);
                    row++;
                    if(row==(key-1)){
                        c=1;
                        row--;
                    }

                }else if(c==1){
                    row--;
                    reilArr[row][i]=plainText.charAt(i);
                    if(row==0){
                        c=0;
                        row=1;
                    }
                }
        }

                    for (int i = 0; i < key; i++) {
		                for (int j = 0; j < plainText.length(); j++) {
		                    System.out.print(reilArr[i][j]+" ");
		                }
		                System.out.println();
        }
                String cypherText="";

		            for (int i = 0; i < key; i++) {
		                for (int j = 0; j < plainText.length(); j++) {
		                    if(reilArr[i][j]!='.')
		                    cypherText += reilArr[i][j];
		                }

		            }

        System.out.println("cypher text is : "+cypherText);
	}
}