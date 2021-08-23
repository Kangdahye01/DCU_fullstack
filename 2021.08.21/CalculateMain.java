import java.util.Scanner;

public class CalculateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate cal = new Calculate();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("연산할 값 : ");
		int number = sc.nextInt();
		
		cal.getFactorial(number);
		cal.getPower(number);
	}

}
