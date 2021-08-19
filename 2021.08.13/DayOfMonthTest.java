import java.util.Scanner;

public class DayOfMonthTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner (System.in);
		System.out.print("���� : ");
		int year = scanner.nextInt();
		
		System.out.print("�� : ");
		int month = scanner.nextInt();
	
		int dayCount = 0;
		boolean rightMonth = true;
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			dayCount = 31;
			break;
			
			
		case 4:
		case 6:
		case 9:
		case 11:
			dayCount = 30;
			break;
			
		case 2:
			if((year%4) == 0 && (year%100) != 0 || (year%400) == 0) {
			dayCount = 29;
			}
			else{
				dayCount = 28;
			}
			break;
	
		default:
			rightMonth = false;
			break;
		}
		
		if(rightMonth) {
			System.out.println(year + "��" + month + "���� ���ϼ��� " + dayCount + "���Դϴ�");
		}
		else {
			System.out.println("�ް��� �߸��Ǿ����ϴ�.");
		}
	}
	

}
