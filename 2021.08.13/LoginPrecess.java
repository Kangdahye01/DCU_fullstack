import java.util.Scanner;

public class LoginPrecess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�����ͺ��̽��� ����� ��
		String dbId = "Java";
		String dbPasswd = "1111";
		
		//1. ������ �Է�
		Scanner scanner = new Scanner(System.in);
		System.out.print("���̵� : ");
		String userId = scanner.next();
		System.out.print("��й�ȣ : ");
		String userPassword = scanner.next();
		
		//2. ����
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
		
		//3.���
		if(loginResult == 1) {
			System.out.println("����� �츮ȸ���� �ƴմϴ�.");
		}
		else if(loginResult == 2) {
			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
		}	
		else {
			System.out.println("�α��� ����.");
		}
	}

}
