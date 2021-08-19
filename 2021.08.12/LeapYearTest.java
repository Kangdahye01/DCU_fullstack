import java.util.Scanner;

public class LeapYearTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.print("연도 : "); int year = scanner.nextInt();
		 * System.out.println("year = " + year);
		 * 
		 * if((year%4) == 0 && (year%100) != 0 || (year%400) == 0) {
		 * System.out.println(year + "는 윤년입니다."); }
		 * 
		 * else { System.out.println(year + "는 윤년이 아닙니다."); }
		 */
		
		//다중if문
		//조건이 여러개인 경우 사용
		//else if구문을 사용해서 조건을 여러개 지정
		Scanner scanner = new Scanner(System.in);
		 
		System.out.print("숫자 : "); int number = scanner.nextInt();
		System.out.println("number = " + number);
		if(number > 10) //{
			System.out.println(number + "는 10보다 크다.");
		//}
		else if(number > 8) {
			System.out.println(number + "는 8보다 크다.");
			
		}
		else {
			System.out.println(number + "는 8보다 작다.");
		}
	}

}
