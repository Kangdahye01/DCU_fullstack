import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account myAccount = new Account();
		
		Scanner scanner = new Scanner(System.in);
		
		int amount = 0;
		boolean stop = false;
		do {
			System.out.println("1. 입금");
			System.out.println("2. 출금");
			System.out.println("3. 잔액조회");
			System.out.println("4. 프로그램 종료");
		
		System.out.print("메뉴번호 : ");
		int menunumber = scanner.nextInt();
		
		
		switch (menunumber) {
		case 1:
			System.out.print("입금액 :");
			amount = scanner.nextInt();
			myAccount.deposit(amount);
			break;
		case 2:
			System.out.print("출금액 :");
			amount = scanner.nextInt();
			myAccount.withdraw(amount);
			break;
		case 3:
//			System.out.print("현재잔액은 " + myAccount.balance + "원 입니다.");
			myAccount.showBalance();
			break;
		case 4:
			System.out.print("프로그램종료 ");
			stop = true;
			break;
			
		default:
			System.out.println("메뉴번호가 잘못되었습니다.");
			break;		
			
		}
		
		} while (!stop);
		
	}

}
