//for�� : ������ Ƚ����ŭ ��Ģ���� �ݺ��� �� �� ���
public class ForTest {
	//1 + 2 + 3...
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1���� 10���� ���ϱ�
		int sum = 0;
		String expression = "";
		for (int i= 1; i <= 10; i++) {
			expression += (i == 1) ? i : " + " + i;
			sum += i;
			}
		
		System.out.println(expression + " = " + sum);
		
	
		//¦��
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
		//�ʱ�� ����
		for (; i <= 10; i = i + 2) {
			
			expression += (i == 2) ? i : " + " + i;
			sum += i;
			}
		
		System.out.println(expression + " = " + sum);
		
		sum = 0;
		expression = "";
		i = 2;
		//������ ����
		for (;;) {
				if (i >10) break;
			expression += (i == 2) ? i : " + " + i;
			sum += i;
			i = i + 2;
			
			}
		
		System.out.println(expression + " = " + sum);
	}

}
