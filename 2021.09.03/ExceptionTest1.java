//1.���α׷����� ������ �߻����� �� ����ó���� ���� ������
//���α׷��� ��� ����ȴ�.
//2. ���α׷��� ������������ ����Ǵ� ���� �����Ϸ���
//����ó���� �ؾ��Ѵ�.
public class ExceptionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //�ڹٿ��� ������ 0���� ������ ���� �߻�
		
		
		//1.
		/*System.out.println("���� �߻� ��");
		int result = 10 / 0; //�����߻� 
		
		System.out.println("���Ⱑ ����ɱ�? ");*/
		
		
		//2.
		//2-1. �ڹٿ��� �߻��� ���� ������������ �̹� Ŭ������ �� ���ǵǾ� �ִ�.
		//try ��� �ȿ��� �߻��� �������� ��ü�� catch �������� ���޵�
		//2-3. catch ������ ���ǵ� �Ķ���� ������ try ��Ͽ��� ���޵� ��ü��
		//�����Ͽ� �߻��� ���������� ���, ����ó���� �Ѵ�.
		
		
		/*System.out.println("���� �߻� ��");
		try {
		int result = 10 / 0; //�����߻� 
		}
		catch(ArithmeticException e) {
			System.out.println("0���� ������ �ȵǿ�.");
		}
		System.out.println("���Ⱑ ����ɱ�? "); */
		
		
		//3. try ��� �ȿ��� ���� ������ ���ܰ� �߻��� ���� 
		// catch ������ ���� ���� ����ؼ� �߻��Ҽ� �ִ� ���ܵ��� ��� ó���Ҽ� �ִ�.
		
		System.out.println("���� �߻� ��");
		try {
		int number = Integer.parseInt(args[0]); //
		int result = 10 / number; //�����߻� 
		}
		catch(ArithmeticException e) { //0�� �Էµɋ�
			System.out.println("0���� ������ �ȵǿ�.");
		}
		catch(ArrayIndexOutOfBoundsException e) { // �ƹ��͵� �Է¾��Ҷ�
			System.out.println("���ڸ� �Է��ϼ���.");
		}
		catch(Exception e) { // ���ڰ� �Էµɶ�
			System.out.println("���ڸ� �Է��ϼ���."); 
		}
		System.out.println("���Ⱑ ����ɱ�? "); 
		    
		
		
		
		
		
		
	}

}
