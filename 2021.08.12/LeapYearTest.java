import java.util.Scanner;

public class LeapYearTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.print("���� : "); int year = scanner.nextInt();
		 * System.out.println("year = " + year);
		 * 
		 * if((year%4) == 0 && (year%100) != 0 || (year%400) == 0) {
		 * System.out.println(year + "�� �����Դϴ�."); }
		 * 
		 * else { System.out.println(year + "�� ������ �ƴմϴ�."); }
		 */
		
		//����if��
		//������ �������� ��� ���
		//else if������ ����ؼ� ������ ������ ����
		Scanner scanner = new Scanner(System.in);
		 
		System.out.print("���� : "); int number = scanner.nextInt();
		System.out.println("number = " + number);
		if(number > 10) //{
			System.out.println(number + "�� 10���� ũ��.");
		//}
		else if(number > 8) {
			System.out.println(number + "�� 8���� ũ��.");
			
		}
		else {
			System.out.println(number + "�� 8���� �۴�.");
		}
	}

}
