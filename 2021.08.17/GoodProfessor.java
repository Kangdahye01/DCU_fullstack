import java.util.Scanner;

public class GoodProfessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("당신이 좋아하는 교수님을 입력하세요.");
			String professor = scanner.next();
			
			if(professor.contentEquals("오정원")) {
				System.out.println("좋은 학생입니다.");
				break;
			}
			else {
				System.out.println("다시 생각해 보세요");
				
			}
		}
	}

}
