
public class ArrayTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. ������ ����(0~9������ ����)�� 1�� �迭��ü�� �����ϰ�
		int[] number = new int[10];
		
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] = (int)(Math.random() * 10));
			//0 ~ 9 ������ ���� �Ҵ� 
		}
		System.out.println();
		
		//2. 2�� �迭��ü�� 1�� �迭��ü�� ����� �� ���ڵ��� ������ ������ ����
		//3. 2�� �迭��ü�� �ε��� ��ȣ�� 1�� �迭��ü�� ����Ǿ� �ִ� �� ���ڰ�
		int[] counter = new int[10];
		//�迭��ü�� �����ϸ� �� �ε��� ������ ���� �ش� �迭�� ������Ÿ���� �⺻������ �ʱ�ȭ �ȴ�.
		
		//�� ������Ÿ�Ե��� �⺻��
		//������ : 0
		//�Ǽ��� : 0.0
		//������ : ' ' (spacebar)
		//���� : false
		//��üŸ�� : null
		
		//number �迭��ü�� ����Ǿ� �ִ� ���ڰ����� ������ ���
		for (int i = 0; i < number.length; i++) {
			counter[number[i]]++;
			//counter[0]++ -> �� ���� ī���� 0�ε����� ���� 1 �÷��ִ°Ŵ�.
			
		}
		
		//������
		for (int i = 0; i < counter.length; i++) {
			System.out.println(i + "�� ���� : " + counter[i]);
		}
		
		
		
		
	}

}
