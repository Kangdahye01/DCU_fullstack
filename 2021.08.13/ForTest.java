//for문 : 지정된 횟수만큼 규칙적인 반복을 할 때 사용
public class ForTest {
	//1 + 2 + 3...
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1부터 10까지 더하기
		int sum = 0;
		String expression = "";
		for (int i= 1; i <= 10; i++) {
			expression += (i == 1) ? i : " + " + i;
			sum += i;
			}
		
		System.out.println(expression + " = " + sum);
		
	
		//짝수
		sum = 0;
		expression = "";
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0)
			expression += (i == 2) ? i : " + " + i;
			sum += i;
			}
		
		System.out.println(expression + " = " + sum);
		
		sum = 0;
		expression = "";
		
		for (int i = 2; i <= 10; i = i + 2) {
			
			expression += (i == 2) ? i : " + " + i;
			sum += i;
			}
		
		System.out.println(expression + " = " + sum);
		
		sum = 0;
		expression = "";
		int i = 2;
		//초기식 생략
		for (; i <= 10; i = i + 2) {
			
			expression += (i == 2) ? i : " + " + i;
			sum += i;
			}
		
		System.out.println(expression + " = " + sum);
		
		sum = 0;
		expression = "";
		i = 2;
		//증감식 생략
		for (;;) {
				if (i >10) break;
			expression += (i == 2) ? i : " + " + i;
			sum += i;
			i = i + 2;
			
			}
		
		System.out.println(expression + " = " + sum);
	}

}
