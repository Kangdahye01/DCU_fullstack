import java.util.Scanner;

public class GenerationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner (System.in);
		System.out.print("���� : ");
		int age = scanner.nextInt();
		
		int generation; 
		
		if(age/10 == 0) 
			System.out.println("�����Դϴ�");	
		
		else if(age/10 == 1) {
			System.out.println("����� 10���Դϴ�");	
		}
		else if(age/10 == 2) {
			System.out.println("����� 20���Դϴ�");	
		}
		else if(age/10 == 3) {
			System.out.println("����� 30���Դϴ�");	
		}
		else if(age/10 == 4) {
			System.out.println("����� 40���Դϴ�");	
		}
		else if(age/10 == 5) {
			System.out.println("����� 50���Դϴ�");	
		}
		else if(age/10 == 6) {
			System.out.println("����� 60���Դϴ�");	
		}
		else if(age/10 == 7) {
			System.out.println("����� 70���Դϴ�");	
		}
		else if(age/10 == 8) {
			System.out.println("����� 80���Դϴ�");	
		}
		else if(age/10 == 9) {
			System.out.println("����� 90���Դϴ�");	
		}
		else if (age/10 >= 10) {
			System.out.println("����̽ʴϴ�");	
		}
		
		
	}

}
