import java.util.Scanner;

public class MenuTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		boolean stop = false;
		
		do {
		System.out.println("====회원관리====");
		System.out.println("1. 회원등록"); //C(Create)
		System.out.println("2. 회원목록보기"); //R(Read)
		System.out.println("3. 회원정보수정"); //U(Update)
		System.out.println("4. 회원정보삭제"); //D(Delete)
		System.out.println("5. 프로그램종료"); 
		
		System.out.print("메뉴번호 : ");
		int menuNumber = scanner.nextInt();
		
		switch (menuNumber) {
		case 1:
			System.out.println("회원등록처리");
			break;
		case 2:
			System.out.println("회원목록보기처리");
			break;
		case 3:
			System.out.println("회원정보수정처리");
			break;
		case 4:
			System.out.println("회원정보삭제처리");
			break;
		case 5:
			System.out.println("프로그램종료");
			stop = true;
			break;
			
		default:
			System.out.println("메뉴번호가 잘못되었습니다.");
			break;
		}
		}while(!stop);
		
		
	}

}
