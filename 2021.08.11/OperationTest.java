import java.util.Scanner;

public class OperationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������� (% : �������� ���ϱ�)
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.println("����1 : "); int number1 = scanner.nextInt();
		 * 
		 * System.out.println("����2 : "); int number2 = scanner.nextInt();
		 * 
		 * System.out.println(number1 + " % " + number2 + " = " + (number1 % number2 ));
		 */
		
		//���տ����� +=
		int x = 5;
		x += 5;
		//x = x + 5;
		System.out.println("x = " + x);
		
		//�񱳿����� !=
		x = 5;
		int y = 6;
		System.out.println(x + " != " + y + " ===> " + (x != y));
		
		//��������
		System.out.println("true && true = " + (true && true));
		System.out.println("true && false = " + (true && false));
		System.out.println("true || true = " + (true || true));
		System.out.println("true || false = " + (true || false));
		
		
		System.out.println("!false = " + (!false));
		System.out.println("!true = " + (!true));
	
		//ª������
		//���� �ǿ����� ������ �������� �� �� ������ ������ ����ؼ� ���� �ǿ����ڸ� 
		//�������� �ʴ´�.
		System.out.println("false && true = " + (false && true));
		System.out.println("false || true = " + (true || true));
		
		//��Ʈ������
		x = 3;
		//00000000 00000000 00000000 00000011
		y = 4;
		//00000000 00000000 00000000 00000100
		
		int result3 = x & y; 
		//00000000 00000000 00000000 00000000
		
		System.out.println(x + " & " + y + " = " + result3);
		
		result3 = x | y; 
		System.out.println(x + " | " + y + " = " + result3);
		
		result3 = x ^ y;
		System.out.println(x + " ^ " + y + " = " + result3);
		
		//��Ʈ �����ڴ� �������ڷε� ��� �����ϴ�.
		//�� ��Ʈ �����ڴ� ª�� ������ �������� �ʴ´�. 
		System.out.println("true & true = " + (true & true));
		System.out.println("true & false = " + (true & false));
		System.out.println("true | true = " + (true | true));
		System.out.println("true | false = " + (true | false));
		
		//����Ʈ ������
		// << : �̵��ϴ� �ڸ����� 2�� ������ ���ϴ� ��� 
		x = 2; 
		//00000000 00000000 00000000 00000010
		
		x = x << 2;
		//00000000 00000000 00000000 00001000
		System.out.println(x + " << 2 : " + x); // 2 * (2 * 2)
		
		x = x >> 1; //��ȣ�� �ִ� ���� �̵�
		//00000000 00000000 00000000 00000100
		System.out.println(x + " >> 2 : " + x); // 2 / (2 * 1)
		
		// >>> ////��ȣ�� ���� ���� �̵�
		
		//����������
		//��ġ ������ : ���������ڰ� �ǿ������� �տ� ���� ���
		//���������ڰ� ���� ����ǰ� �ٸ� �����ڰ� �����
		x = 5;
		y = ++x; 
		System.out.println("x = " + x + ", y = " + y);
		
		//��ġ ������ : ���������ڰ� �ǿ������� �ڿ� ���� ���
		//�ٸ������ڰ� ���� ����ǰ� ���� �����ڰ� �����
		x = 5;
		y = x++;
		System.out.println("x = " + x + ", y = " + y);
		
		//���׿�����
		//(���ǽ�) ? ���ǽ��� true�� ��ȯ�� �� ��ȯ�� �� : ���ǽ��� false�� ��ȯ�� �� ��ȯ�� ��;
		//Ư�� ������ ���밪 ���ϱ� 
		
		x = -1;
		int absX = (x >= 0) ? x : -x;
		
		System.out.println("absX = " + absX);
		
		
		
		
		
		
		
	
	}

}
