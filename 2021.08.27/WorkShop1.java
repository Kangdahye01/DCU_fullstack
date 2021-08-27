import java.util.Scanner;

public class WorkShop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean stop = false;

		do {
			System.out.println("**** 도형선택 *****");
			System.out.println("1. 삼각형");
			System.out.println("2. 원");
			System.out.println("3. 사다리꼴");
			System.out.println("4. 종료");
			System.out.print("원하는 값을 입력 하세요 : ");
			int menunum = sc.nextInt();

			switch(menunum) {
			case 1 :
				System.out.println("**** 삼각형넓이 ****");
				System.out.print("밑변 : ");
				int hori = sc.nextInt();
				System.out.print("높이 : ");
				int vert = sc.nextInt();
				double total = (double)((hori * vert) /2);
				System.out.println("넓이 : %.2f\n" + total);
				break; 
			
			case 2:		
				System.out.println("**** 원의 넓이 ****");
				System.out.print("반지름 : ");
				int redi = sc.nextInt();
				double total1 = (double)(3.14*redi);
				System.out.println("넓이 : %.2f\n" + total1);		
				break; 
				
			case 3 :
				System.out.println("**** 사다리꼴넓이 ****");
				System.out.print("아랫변 : ");
				int hori1 = sc.nextInt();
				System.out.print("윗변 : ");
				int hori2 = sc.nextInt();
				System.out.print("높이 : ");
				int vert1 = sc.nextInt();
				float total2 = (float)((hori1+hori2)*vert1)/2;
				System.out.printf("넓이 : %.2f\n",total2);		
				break; 
			
			case 4:
				System.out.println("프로그램종료");
				stop = true;
				break;

			default:
				System.out.println("메뉴번호가 잘못되었습니다.");
				break;	
			}

		}while(!stop);
	}

}

