import java.util.Scanner;

public class GoodProfessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("����� �����ϴ� �������� �Է��ϼ���.");
			String professor = scanner.next();
			
			if(professor.contentEquals("������")) {
				System.out.println("���� �л��Դϴ�.");
				break;
			}
			else {
				System.out.println("�ٽ� ������ ������");
				
			}
		}
	}

}
