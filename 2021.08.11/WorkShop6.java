import java.util.Scanner;

public class WorkShop6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� : ");
		int score = scanner.nextInt();
		System.out.println("���� = " + score);
		
		
		if(score<0 || score>100) System.out.println("�Է¿���!!!");
			
		else System.out.println("����ó����!!!");
		
		
	}	

}
