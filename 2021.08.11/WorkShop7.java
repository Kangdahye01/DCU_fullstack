import java.util.Scanner;

public class WorkShop7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("number : ");
		int number = scanner.nextInt();
		System.out.println("number = " + number);
		
		
		if((number%2) == 0 ) System.out.println("Â¦¼ö!!!");
			
		else System.out.println("È¦¼ö!!!");
	}

}
