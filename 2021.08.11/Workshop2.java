import java.util.Scanner;

public class Workshop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scanner = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = scanner.next();
		System.out.println("name = " + name);
		
		System.out.print("�μ� : ");
		String department = scanner.next();
		System.out.println("department = " + department);
		
		System.out.print("���� : ");
		String position = scanner.next();
		System.out.println("position = " + position);
		
		System.out.print("�޿� : ");
		int pay = scanner.nextInt();
		System.out.println("pay = " + pay);
	}

}
