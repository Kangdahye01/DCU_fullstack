//예외종류
//1. 런타임예외
//컴파일 타임에는 예외가 발생하지 않고 런타임에 발생하는 예외
//반드시 예외처리를 하지 않아도 된다.
//주로, 개발자들의 논리적인 오류로 발생
//NullPonterException, ArrayIndexOutOfException, ArithmeticException..
//UnCheckedException 이라고도 함

//2. 일반예외
//개발자들의 실수라기 보다는 발생할 것이 예상되는 예외들
//FileNotFoundException, SQLException, ....
//반드시 예외처리를 해야되기 때문에 CheckedException 이라고도 함
public class ExceptionTest3 {
    
	void printData() throws InterruptedException {
		wait();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1. 런타임예외 발생
		//throw : 자바에서 예외객체를 발생시키는 예약어
//		throw new RuntimeException();
		
		
		//2.일반예외 발생
		try {
		throw new Exception();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	

}
