import java.util.Scanner;

public class NumberinputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		boolean stop = false;
		
		//맞춰야 할 숫자를 난수로 설정
		int rightNumber = (int)(Math.random() * 100) + 1;
		//Math.random() : 0.0보다 크거나 같고 1.0보다 작은 double 타입의 값으 반환
		
		do {
			System.out.print("숫자입력 : ");
			int inputNumber = scanner.nextInt();
			
			if(inputNumber > rightNumber)
				System.out.println("더 작은 수를 입력하세요.");
		
			else if(inputNumber < rightNumber)
			System.out.println("더 큰 수를 입력하세요.");
			
			else
				System.out.println("맞췄습니다.");
				stop = true;
			
		} while (!stop);
		
		
	}

}
