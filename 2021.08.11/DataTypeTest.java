
public class DataTypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//����Ÿ��(byte, short, int, long)
		byte b1 = 120;
		
		//�ش� ������ Ÿ�Կ��� ������� �ʴ� ���� �Ҵ��ϸ� ������ ���� �߻�
		//b1 = 200;
		
		
		short s1 = 200;
		
		//����
		int num1 = 010; //8����
		System.out.println("num1 = " + num1);
		int num2 = 0X11; //16����
		System.out.println("num2 = " + num2);
		int num3 = 0B0011; //2����
		System.out.println("num3 = " + num3);
		
		//_�� ����ؼ� �ڸ������� ���� �Ҵ�
		//L, l �� long Ÿ���� �����͸� �����ϸ� ���̻� 
		long l1 = 123_123_123_123L;
		System.out.println("11 = " + 11);
		
		//2������ �ڸ������� �Ҵ�
		int binaryNumber = 0B1111_0000_1010_0000;
		System.out.println("binaryNumber = " + binaryNumber);

		//L ���̻縦 �ٿ��� �ϴ� ���
		long l2 = 12000000;
		//�ڹٿ��� ����Ÿ���� �����ϸ� �⺻������ int Ÿ������ ������ �����
		//���� ���ϱ� ������ �� �������� int Ÿ������ ��ȯ��
		//�̷� ���� ���ڵڿ� L ���̻縦 �ٿ��� �������� longŸ���� �ǵ��� ó���ؾ� ��
		long l3 = 12000000 * 1000000L;
		System.out.println("13 =" + 13);

		//����Ÿ��(char) : �����ڵ�� �ν�
		char han = '��' ;
		System.out.println("han = " + han);
		
		char en = 'A';
		System.out.println("en = " +en);

		//char Ÿ���� 2����Ʈ ������ �Ҵ� ����
		//�� ������ �ڵ尪�� �ǹ���
		char en1 = 0X0041;
		System.out.println("en1 = " +en1);
		
		char japanese = 0X3055;
		System.out.println("japanese = " + japanese);
		
		//���ڴ� �Ҵ��� �� ����. 
//		char char1 = '';
//		but, char char1 = ' '(spacebar���� �� ����)
		//���ڸ� ����Ϸ��� String Ÿ���� ����ؾ� ��.
		String str1 = "";
		
		//char Ÿ���� �ι��� �̻��� �Ҵ��� �� ����. 
		//�ι��� �̻� �Ҵ��Ϸ��� String�� ����ؾ� ��
//		char char2 = 'AB';
		String str2 = "AB";
		
		//����(boolean)
		boolean bool1 = false;
		boolean bool2 = true;
		System.out.println("bool1 = " + bool1);
		System.out.println("bool2 = " + bool2);
		
		//�Ǽ�Ÿ��(float(4byte),double(8byte))
		//float Ÿ���� ���̻� : F, f
		//double Ÿ���� ���̻� : D, d
		//�ڹٿ��� �Ǽ� Ÿ���� �⺻Ÿ���� double ��
		
		float f1 = 4.1f;
		
		double d1 = 4.1;
		
		//d ���̻縦 �ݵ�� �ٿ��� �ϴ� ���
		double avg = 100 / 30d;
		System.out.println("avg = " + avg);
		
		
		
		
		
		
	}

}