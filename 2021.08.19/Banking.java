import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account myAccount = new Account();
		
		Scanner scanner = new Scanner(System.in);
		
		int amount = 0;
		boolean stop = false;
		do {
			System.out.println("1. �Ա�");
			System.out.println("2. ���");
			System.out.println("3. �ܾ���ȸ");
			System.out.println("4. ���α׷� ����");
		
		System.out.print("�޴���ȣ : ");
		int menunumber = scanner.nextInt();
		
		
		switch (menunumber) {
		case 1:
			System.out.print("�Աݾ� :");
			amount = scanner.nextInt();
			myAccount.deposit(amount);
			break;
		case 2:
			System.out.print("��ݾ� :");
			amount = scanner.nextInt();
			myAccount.withdraw(amount);
			break;
		case 3:
//			System.out.print("�����ܾ��� " + myAccount.balance + "�� �Դϴ�.");
			myAccount.showBalance();
			break;
		case 4:
			System.out.print("���α׷����� ");
			stop = true;
			break;
			
		default:
			System.out.println("�޴���ȣ�� �߸��Ǿ����ϴ�.");
			break;		
			
		}
		
		} while (!stop);
		
	}

}
