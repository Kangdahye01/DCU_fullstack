//throws
//예외가 발생한 메소드 안에서 예외처리를 하지 않고
//해당메소드를 사용하는 쪽에서 예외처리를 하도록 예외처리를 이양하는 예약어

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
