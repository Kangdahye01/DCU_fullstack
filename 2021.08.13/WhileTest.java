
public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 1���� 10���� ���� ���ϱ�
		int sum = 0 ;
		String expression = "";
		
		int i = 1;
		while (i <= 10) {
			sum += i;
			expression += ( i == 1) ? i : " + " + i;
			i++;
		}
		System.out.println(expression + " = " + sum);
	}

}
