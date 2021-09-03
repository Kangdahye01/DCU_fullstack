//1.프로그램에서 에러가 발생했을 때 예외처리를 하지 않으면
//프로그램은 즉시 종료된다.
//2. 프로그램이 비정상적으로 종료되는 것을 방지하려면
//예외처리르 해야한다.
public class ExceptionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //자바에서 정수를 0으로 나누면 예외 발생
		
		
		//1.
		/*System.out.println("에러 발생 전");
		int result = 10 / 0; //에러발생 
		
		System.out.println("여기가 실행될까? ");*/
		
		
		//2.
		//2-1. 자바에서 발생할 만한 예외종류들은 이미 클래스로 다 정의되어 있다.
		//try 블록 안에서 발생한 예외종류 객체가 catch 구문으로 전달됨
		//2-3. catch 구문에 정의된 파라미터 변수가 try 블록에서 전달된 객체를
		//참조하여 발생한 예외정보를 얻고, 예외처리를 한다.
		
		
		/*System.out.println("에러 발생 전");
		try {
		int result = 10 / 0; //에러발생 
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나누면 안되요.");
		}
		System.out.println("여기가 실행될까? "); */
		
		
		//3. try 블록 안에서 여러 종류의 예외가 발생할 경우는 
		// catch 구문을 여러 개를 사용해서 발생할수 있는 예외들을 모두 처리할수 있다.
		
		System.out.println("에러 발생 전");
		try {
		int number = Integer.parseInt(args[0]); //
		int result = 10 / number; //에러발생 
		}
		catch(ArithmeticException e) { //0이 입력될떄
			System.out.println("0으로 나누면 안되요.");
		}
		catch(ArrayIndexOutOfBoundsException e) { // 아무것도 입력안할때
			System.out.println("인자를 입력하세요.");
		}
		catch(Exception e) { // 문자가 입력될때
			System.out.println("숫자를 입력하세요."); 
		}
		System.out.println("여기가 실행될까? "); 
		    
		
		
		
		
		
		
	}

}
