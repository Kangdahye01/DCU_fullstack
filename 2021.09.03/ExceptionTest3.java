//��������
//1. ��Ÿ�ӿ���
//������ Ÿ�ӿ��� ���ܰ� �߻����� �ʰ� ��Ÿ�ӿ� �߻��ϴ� ����
//�ݵ�� ����ó���� ���� �ʾƵ� �ȴ�.
//�ַ�, �����ڵ��� ������ ������ �߻�
//NullPonterException, ArrayIndexOutOfException, ArithmeticException..
//UnCheckedException �̶�� ��

//2. �Ϲݿ���
//�����ڵ��� �Ǽ���� ���ٴ� �߻��� ���� ����Ǵ� ���ܵ�
//FileNotFoundException, SQLException, ....
//�ݵ�� ����ó���� �ؾߵǱ� ������ CheckedException �̶�� ��
public class ExceptionTest3 {
    
	void printData() throws InterruptedException {
		wait();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1. ��Ÿ�ӿ��� �߻�
		//throw : �ڹٿ��� ���ܰ�ü�� �߻���Ű�� �����
//		throw new RuntimeException();
		
		
		//2.�Ϲݿ��� �߻�
		try {
		throw new Exception();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	

}
