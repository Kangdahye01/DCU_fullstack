//PipeException 예제

public class ExceptionTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int num = Integer.parseInt(args[0]);
			
		}
		catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
			if(e.getClass().getName().equals("java.lang.ArrayInexOutOfBoundException")) {
				System.out.println("인자를 입력하세요");
			}
			else {
				System.out.println("숫자를 입력하세요");
			}
			
		}
        
	}

}
