
public class ArrayTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ball = new int[45];
		
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}
		
		int j = -1; //ball �迭���� �����ϰ� ������ �ε��� ��ȣ
		//�� �ε��� ������ ����� ���� 0�� �ε����� ����� ���� �����ϸ鼭 �迭�� ������ ���� ����.
		int temp = 0; //0�� �ε��� ������ ���� �ӽ������� ������ ����
		
		for (int i = 0; i < 100; i++) {
			j = (int)(Math.random()*45);//0~44
			temp = ball[0];
			ball[0] = ball[j];
			ball[j] = temp;
			
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.println(ball[i] + " ");
		}
	}

}
