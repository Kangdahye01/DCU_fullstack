//��������� ����
//�䱸����
//1. ���α׷��� ����� �� ���ڸ� �Է¹޴´�.
//2. ���ڰ� �ΰ��� �� ������ ���� ���ؼ� ����Ѵ�.
//3. ���ڰ� �ΰ��� �ƴϸ� "���ڸ� �ΰ� �Է��ϼ���" ��� ���ܸ޽����� ����ϰ�
//"����� �Է��� ������ ������ (    )�� �Դϴ�" ��� ����Ѵ�.

//����Ŭ���� : ���������� �����ϴ� ��
class ArgsException extends Exception{
	
	//���ܸ޽����� �ʱ�ȭ �ϴ� ������
	public ArgsException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
	
	private int argsNumber;
	
	public int getArgsNumber() {
		return argsNumber;
	}

	public void setArgsNumber(int length) {
		// TODO Auto-generated method stub
		this.argsNumber = argsNumber;
	}
	
}
public class ExceptionTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			if(args.length != 2) {
				ArgsException ae = new ArgsException("���ڸ� �ΰ� �Է��ϼ���.");
				ae.setArgsNumber(args.length);
				throw ae;
			}
			else {
				int number1 = Integer.parseInt(args[0]);
				int number2 = Integer.parseInt(args[1]);
				System.out.println(number1 +"+"+number2 +"="+(number1+number2));
			}
		} catch (ArgsException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.out.println("����� �Է��� ������ ������ " + e.getArgsNumber()+"���Դϴ�.");
		}
		
		
		
		
		
        
		
	}

}








