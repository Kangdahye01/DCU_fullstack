//throws
//���ܰ� �߻��� �޼ҵ� �ȿ��� ����ó���� ���� �ʰ�
//�ش�޼ҵ带 ����ϴ� �ʿ��� ����ó���� �ϵ��� ����ó���� �̾��ϴ� �����

public class ExceptionTest4 {
    public void exceptionMethod() throws Exception {
    	throw new Exception();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionTest4 et4 = new ExceptionTest4();
		try {
			et4.exceptionMethod();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		
	}

}
