
public class ExceptionTest2 {
    public void exceptionMethod(String[]args) { 
		try {
		int number = Integer.parseInt(args[0]); //
		int result = 10 / number; //에러발생 
		return;
		}
		catch(ArithmeticException e) { //0이 입력될떄
			System.out.println("0으로 나누면 안되요.");
			return;
		}
		catch(ArrayIndexOutOfBoundsException e) { // 아무것도 입력안할때
			System.out.println("인자를 입력하세요.");
			return;
		}
		catch(Exception e) { // 문자가 입력될때
			System.out.println("숫자를 입력하세요."); 
			
		}
		finally {
		System.out.println("여기가 반드시 실행되어야 한다 "); 
		}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionTest2 et2 = new ExceptionTest2();
		et2.exceptionMethod(args);
		
		
		
		
		
		
		
        
	}

}
