//사용자정의 예외
//요구사항
//1. 프로그램이 실행될 때 인자를 입력받는다.
//2. 인자가 두개면 두 인자의 합을 구해서 출력한다.
//3. 인자가 두개가 아니면 "인자를 두개 입력하세요" 라고 예외메시지를 출력하고
//"당신이 입력한 인자의 개수는 (    )개 입니다" 라고 출력한다.

//예외클래스 : 예외정보를 저장하는 것
class ArgsException extends Exception{
	
	//예외메시지를 초기화 하는 생성자
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
				ArgsException ae = new ArgsException("인자를 두개 입력하세요.");
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
			System.out.println("당신이 입력한 인자의 개수는 " + e.getArgsNumber()+"개입니다.");
		}
		
		
		
		
		
        
		
	}

}








