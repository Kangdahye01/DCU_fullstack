//�迭�� ����� ���� �� �ִ밪�� �ּҰ��� ���ϱ�
public class ArratTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {100,100,100,100,99};
		int max = score[0];//�Ǿտ���
		int min = score[0];
		
		for (int i = 1; i < score.length; i++) {//0������ �ʱⰪ�� �־����ϱ� ���� �񱳸� 0���� ���۾��ص���.
			if(score[i] > max) {
				max = score[i];
			}
			else if(score[i] < min) {
				min = score[i];
			}
		}
		
		
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		
		
		
	}

}
