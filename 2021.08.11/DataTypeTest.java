
public class DataTypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//정수타입(byte, short, int, long)
		byte b1 = 120;
		
		//해당 데이터 타입에서 허용하지 않는 값을 할당하면 컴파일 에러 발생
		//b1 = 200;
		
		
		short s1 = 200;
		
		//진법
		int num1 = 010; //8진수
		System.out.println("num1 = " + num1);
		int num2 = 0X11; //16진수
		System.out.println("num2 = " + num2);
		int num3 = 0B0011; //2진수
		System.out.println("num3 = " + num3);
		
		//_를 사용해서 자릿수별로 값을 할당
		//L, l 은 long 타입의 데이터를 지정하면 접미사 
		long l1 = 123_123_123_123L;
		System.out.println("11 = " + 11);
		
		//2진수를 자릿수별로 할당
		int binaryNumber = 0B1111_0000_1010_0000;
		System.out.println("binaryNumber = " + binaryNumber);

		//L 접미사를 붙여야 하는 경우
		long l2 = 12000000;
		//자바에서 정수타입을 연산하면 기본적으로 int 타입으로 연산이 수행됨
		//따라서 곱하기 연산을 한 수행결과도 int 타입으로 반환됨
		//이런 경우는 숫자뒤에 L 접미사를 붙여서 연산결과가 long타입이 되도록 처리해야 함
		long l3 = 12000000 * 1000000L;
		System.out.println("13 =" + 13);

		//문자타입(char) : 유니코드로 인식
		char han = '한' ;
		System.out.println("han = " + han);
		
		char en = 'A';
		System.out.println("en = " +en);

		//char 타입은 2바이트 정수도 할당 가능
		//각 문자의 코드값을 의미함
		char en1 = 0X0041;
		System.out.println("en1 = " +en1);
		
		char japanese = 0X3055;
		System.out.println("japanese = " + japanese);
		
		//빈문자는 할당할 수 없다. 
//		char char1 = '';
//		but, char char1 = ' '(spacebar누른 건 가능)
		//빈문자를 사용하려면 String 타입을 사용해야 함.
		String str1 = "";
		
		//char 타입은 두문자 이상을 할당할 수 없다. 
		//두문자 이상 할당하려면 String을 사용해야 함
//		char char2 = 'AB';
		String str2 = "AB";
		
		//논리값(boolean)
		boolean bool1 = false;
		boolean bool2 = true;
		System.out.println("bool1 = " + bool1);
		System.out.println("bool2 = " + bool2);
		
		//실수타입(float(4byte),double(8byte))
		//float 타입의 접미사 : F, f
		//double 타입의 접미사 : D, d
		//자바에서 실수 타입의 기본타입은 double 임
		
		float f1 = 4.1f;
		
		double d1 = 4.1;
		
		//d 접미사를 반드시 붙여야 하는 경우
		double avg = 100 / 30d;
		System.out.println("avg = " + avg);
		
		
		
		
		
		
	}

}