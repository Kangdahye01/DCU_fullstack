import java.util.Scanner;

public class MenuTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		boolean stop = false;
		
		do {
		System.out.println("====ȸ������====");
		System.out.println("1. ȸ�����"); //C(Create)
		System.out.println("2. ȸ����Ϻ���"); //R(Read)
		System.out.println("3. ȸ����������"); //U(Update)
		System.out.println("4. ȸ����������"); //D(Delete)
		System.out.println("5. ���α׷�����"); 
		
		System.out.print("�޴���ȣ : ");
		int menuNumber = scanner.nextInt();
		
		switch (menuNumber) {
		case 1:
			System.out.println("ȸ�����ó��");
			break;
		case 2:
			System.out.println("ȸ����Ϻ���ó��");
			break;
		case 3:
			System.out.println("ȸ����������ó��");
			break;
		case 4:
			System.out.println("ȸ����������ó��");
			break;
		case 5:
			System.out.println("���α׷�����");
			stop = true;
			break;
			
		default:
			System.out.println("�޴���ȣ�� �߸��Ǿ����ϴ�.");
			break;
		}
		}while(!stop);
		
		
	}

}
