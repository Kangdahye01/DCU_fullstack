import java.util.Scanner;

public class NumberinputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		boolean stop = false;
		
		//����� �� ���ڸ� ������ ����
		int rightNumber = (int)(Math.random() * 100) + 1;
		//Math.random() : 0.0���� ũ�ų� ���� 1.0���� ���� double Ÿ���� ���� ��ȯ
		
		do {
			System.out.print("�����Է� : ");
			int inputNumber = scanner.nextInt();
			
			if(inputNumber > rightNumber)
				System.out.println("�� ���� ���� �Է��ϼ���.");
		
			else if(inputNumber < rightNumber)
			System.out.println("�� ū ���� �Է��ϼ���.");
			
			else
				System.out.println("������ϴ�.");
				stop = true;
			
		} while (!stop);
		
		
	}

}
