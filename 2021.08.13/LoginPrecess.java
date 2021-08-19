import java.util.Scanner;

public class LoginPrecess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//데이터베이스에 저장된 값
		String dbId = "Java";
		String dbPasswd = "1111";
		
		//1. 데이터 입력
		Scanner scanner = new Scanner(System.in);
		System.out.print("아이디 : ");
		String userId = scanner.next();
		System.out.print("비밀번호 : ");
		String userPassword = scanner.next();
		
		//2. 연산
		int loginResult;
		
		if(!dbId.contentEquals(userId)) {
			loginResult = 1;	
		}
		else if(!dbPasswd.contentEquals(userPassword)) {
			loginResult = 2;
		}
		else {
			loginResult = 3;	
		}
		
		//3.출력
		if(loginResult == 1) {
			System.out.println("당신은 우리회원이 아닙니다.");
		}
		else if(loginResult == 2) {
			System.out.println("비밀번호가 일치하지 않습니다.");
		}	
		else {
			System.out.println("로그인 성공.");
		}
	}

}
