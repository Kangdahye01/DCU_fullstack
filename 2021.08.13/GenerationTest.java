import java.util.Scanner;

public class GenerationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner (System.in);
		System.out.print("나이 : ");
		int age = scanner.nextInt();
		
		int generation; 
		
		if(age/10 == 0) 
			System.out.println("유아입니다");	
		
		else if(age/10 == 1) {
			System.out.println("당신은 10대입니다");	
		}
		else if(age/10 == 2) {
			System.out.println("당신은 20대입니다");	
		}
		else if(age/10 == 3) {
			System.out.println("당신은 30대입니다");	
		}
		else if(age/10 == 4) {
			System.out.println("당신은 40대입니다");	
		}
		else if(age/10 == 5) {
			System.out.println("당신은 50대입니다");	
		}
		else if(age/10 == 6) {
			System.out.println("당신은 60대입니다");	
		}
		else if(age/10 == 7) {
			System.out.println("당신은 70대입니다");	
		}
		else if(age/10 == 8) {
			System.out.println("당신은 80대입니다");	
		}
		else if(age/10 == 9) {
			System.out.println("당신은 90대입니다");	
		}
		else if (age/10 >= 10) {
			System.out.println("고령이십니다");	
		}
		
		
	}

}
