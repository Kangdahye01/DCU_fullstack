import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = scanner.next();
		System.out.println("name = " + name);
		
		
		System.out.print("���� : ");
		int age = scanner.nextInt();
		System.out.println("age = " + age);
		
		
	}

}
