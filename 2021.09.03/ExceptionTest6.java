//PipeException ����

public class ExceptionTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int num = Integer.parseInt(args[0]);
			
		}
		catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
			if(e.getClass().getName().equals("java.lang.ArrayInexOutOfBoundException")) {
				System.out.println("���ڸ� �Է��ϼ���");
			}
			else {
				System.out.println("���ڸ� �Է��ϼ���");
			}
			
		}
        
	}

}
