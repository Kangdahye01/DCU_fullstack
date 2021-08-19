import java.util.Scanner;

public class WorkShop5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
		
		System.out.print("InputA : ");
		int InputA = scanner.nextInt();
		System.out.println("InputA = " + InputA);
		
		System.out.print("InputB : ");
		int InputB = scanner.nextInt();
		System.out.println("InputB = " + InputB);
		
		
		int Max = (InputB > InputA) ? InputB : InputA;
		
		System.out.println("Å«¼ö = " + Max);
		
	}

}
