import java.util.Scanner;

public class workshop0818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//문제1번
		Scanner scanner = new Scanner(System.in);
		System.out.print("사과의 갯수를 적으시오.");
		int numOfApples = scanner.nextInt();
		
		
		
		int sizeOfBucket = 10;
		int numOfBucket = ((numOfApples%sizeOfBucket == 0) ? numOfApples/sizeOfBucket : numOfApples/sizeOfBucket + 1);

		System.out.println("필요한 바구니의 수 :"+numOfBucket);
		

		//문제 2번
		
		System.out.print("숫자를 입력하시오.");
		int num = scanner.nextInt();
		
		String code = "";
		if(num > 0) {
			System.out.println ("양수입니다.");
			
		}
		else if(num == 0) {
			System.out.println("0입니다.");
		}
			
		else if(num < 0) {
			System.out.println ("음수입니다.");
				
	}



		//삼항연산자 (문제2번)

		System.out.print ("숫자를 입력하시오!");
		int numm = scanner.nextInt() ;
		System.out.println ((numm > 0) ? "양수입니다" :
				(numm < 0)? "음수입니다" : "0입니다");
	


		//문제 3번
		System.out.print("숫자를 입력하시오.");
			int i = scanner.nextInt();
			int iNum = (i/100)*100;
			
			System.out.println(iNum);
			
			
		//문제 4번
			System.out.print ("입력하시오! ");
			char ch = scanner.next().charAt(0);
			
			if(ch>='a' && ch<= 'z') {
				System.out.println("true");
			}
			else if(ch>='0' && ch<='9') {
				System.out.println("true");
			}
			else {
				System.out.print("잘못 입력했습니다.");
			}
			
				
		//문제 5번
			System.out.print ("이름 :");
			String name = scanner.next() ;
			
			System.out.print ("성별 :");
			char gender = scanner.next().charAt(0);
			System.out.println ((gender == 'M') ? "남자" : "여자");
			
			
			System.out.print ("나이 :");
			int age = scanner.nextInt() ;
			
			System.out.print ("신장 :");
			int tall = scanner.nextInt() ;
			
			
		//문제6번
			int e = 1, ans = 0;
			while(ans <= 100) {
				
				if(e%2 == 0) {
					ans = ans - e;
				}
				else if (e%2 == 1) {
					ans = ans + e;
				}
				e++;
			}
			System.out.println(e);
			
		//문제7번
			
			int count = 0;
			for (int q = 1; q < 7; q++) { //q=첫번째주사위
			for (int t = 1; t < 7; t++) { //t=두번째주사위
			int summ = q + t;
			if (summ == 6) {
				
				System.out.println("q:" + q + " + " + "t:" + t + " = " + summ);
				count++;
			}
			
			}
			}
			System.out.println(count + "가지");

	

}

}














