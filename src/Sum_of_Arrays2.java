import java.util.Scanner;
public class Sum_of_Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner (System.in);
System.out.println("Please enter information");
int []One = new int [3];
int []Two = new int [3];


for(int i = 0; i < One.length; i++){
One[i] = scanner.nextInt();
Two[i] = scanner.nextInt();

System.out.print((One[i] + Two[i]) + " ");

	}
	}
}
