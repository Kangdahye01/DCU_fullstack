//�迭�� ����Ǿ� �ִ� �������� ������ ����� ���ϱ�
public class ArratTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		float average = 0;
		
		int[] score = {100,100,100,100,99};
		
		//�������ϱ�
		for (int i =0; i < score.length; i++) {
			total += score[i];
		}
		
		//��ձ��ϱ�
		average = total/ (float)score.length;
		
		System.out.println("total = " + total);
		System.out.println("average = " + average);
	}

}
