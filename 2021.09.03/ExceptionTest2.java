
public class ExceptionTest2 {
    public void exceptionMethod(String[]args) { 
		try {
		int number = Integer.parseInt(args[0]); //
		int result = 10 / number; //�����߻� 
		return;
		}
		catch(ArithmeticException e) { //0�� �Էµɋ�
			System.out.println("0���� ������ �ȵǿ�.");
			return;
		}
		catch(ArrayIndexOutOfBoundsException e) { // �ƹ��͵� �Է¾��Ҷ�
			System.out.println("���ڸ� �Է��ϼ���.");
			return;
		}
		catch(Exception e) { // ���ڰ� �Էµɶ�
			System.out.println("���ڸ� �Է��ϼ���."); 
			
		}
		finally {
		System.out.println("���Ⱑ �ݵ�� ����Ǿ�� �Ѵ� "); 
		}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionTest2 et2 = new ExceptionTest2();
		et2.exceptionMethod(args);
		
		
		
		
		
		
		
        
	}

}
