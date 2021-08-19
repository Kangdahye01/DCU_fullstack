import java.util.Scanner;

public class OperationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//산술연산자 (% : 나머지값 구하기)
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.println("숫자1 : "); int number1 = scanner.nextInt();
		 * 
		 * System.out.println("숫자2 : "); int number2 = scanner.nextInt();
		 * 
		 * System.out.println(number1 + " % " + number2 + " = " + (number1 % number2 ));
		 */
		
		//복합연산자 +=
		int x = 5;
		x += 5;
		//x = x + 5;
		System.out.println("x = " + x);
		
		//비교연산자 !=
		x = 5;
		int y = 6;
		System.out.println(x + " != " + y + " ===> " + (x != y));
		
		//논리연산자
		System.out.println("true && true = " + (true && true));
		System.out.println("true && false = " + (true && false));
		System.out.println("true || true = " + (true || true));
		System.out.println("true || false = " + (true || false));
		
		
		System.out.println("!false = " + (!false));
		System.out.println("!true = " + (!true));
	
		//짧은연산
		//앞의 피연산자 값으로 연산결과를 알 수 있으면 성능을 고려해서 뒤의 피연산자를 
		//연산하지 않는다.
		System.out.println("false && true = " + (false && true));
		System.out.println("false || true = " + (true || true));
		
		//비트연산자
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
		
		//비트 연산자는 논리연산자로도 사용 가능하다.
		//단 비트 연산자는 짧은 연산은 지원하지 않는다. 
		System.out.println("true & true = " + (true & true));
		System.out.println("true & false = " + (true & false));
		System.out.println("true | true = " + (true | true));
		System.out.println("true | false = " + (true | false));
		
		//시프트 연산자
		// << : 이동하는 자릿수의 2의 제곱을 곱하는 결과 
		x = 2; 
		//00000000 00000000 00000000 00000010
		
		x = x << 2;
		//00000000 00000000 00000000 00001000
		System.out.println(x + " << 2 : " + x); // 2 * (2 * 2)
		
		x = x >> 1; //부호가 있는 우측 이동
		//00000000 00000000 00000000 00000100
		System.out.println(x + " >> 2 : " + x); // 2 / (2 * 1)
		
		// >>> ////부호가 없는 우측 이동
		
		//증감연산자
		//전치 연산자 : 증감연산자가 피연산자의 앞에 오는 경우
		//증감연산자가 먼저 실행되고 다른 연산자가 실행됨
		x = 5;
		y = ++x; 
		System.out.println("x = " + x + ", y = " + y);
		
		//후치 연산자 : 증감연산자가 피연산자의 뒤에 오는 경우
		//다른연산자가 먼저 실행되고 증감 연산자가 실행됨
		x = 5;
		y = x++;
		System.out.println("x = " + x + ", y = " + y);
		
		//삼항연산자
		//(조건식) ? 조건식이 true를 반환할 때 반환할 값 : 조건식이 false를 반환할 때 반환할 값;
		//특정 숫자의 절대값 구하기 
		
		x = -1;
		int absX = (x >= 0) ? x : -x;
		
		System.out.println("absX = " + absX);
		
		
		
		
		
		
		
	
	}

}
