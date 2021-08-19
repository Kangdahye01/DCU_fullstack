
class ConversionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 변수에 값을 할당할 때
		//1-1. 변수의 데이터타입보다 작은 데이터 타입의 값을 할당
		//상수값의 데이터타입의 변수의 데이터타입으로 자동형변환 된 후 할당 됨
		byte b1 = 127; 
		int i1 = b1;
		
		//1-2. 변수의 데이터타입보다 큰 데이터 타입의 값을 할당
		//컴파일에러 발생
		//명시적인 형변환이 되어야 합니다.
		//값손실은 발생할 수 있다. 
		int i2 = 200;
		byte b2 = (byte)i2;
		System.out.println("b2 = " +b2);
		
		//1-3. 정수타입의 값을 실수 타입의 변수에 할당할 수는 있어도 
		//실수타입의 값을 정수타입의 변수에 할당할 수는 없다.
		//실수타입이 정수타입보다 표현할 수 있는 값의 범위가 넓기 때문이다. 
		long l1 = 20;
		float f1 = l1;
//		long l2 = f1;
		
//		long l3 = 1000000000000001;
		double d3 = 100000000000000000d;
		
		//2. 연산시
		//2-1. 피연산자 중 보다 큰 피연산자의 타입으로 자동 형변환된 후 연산됨.
		int i3 = 10;
		long l3 = 100;
//		int result = i3 + l3; 잘못된표현
//		-> long result = i3 + l3; i>l이므로 앞에 int말고 long 써주기
		
		//2-2.  자바에서 int 보다 작은 타입의 정수가 연산되면 기본적으로
		//int  타입으로 변환된 후 연산됨
		byte b3 = 12;
		byte b4 = 90;
//		byte result1 = b3 + b4; 잘못된 연산
//		int result1 = b3 + b4; 옳은 연산
		
		char c1 = 'A';
		int i4 = c1 + 1;
		System.out.println("i4 = " + i4);
		
		//2-3. 실수타입과 정수타입이 연산되면 무조건 실수 타입으로 형변환된 후 연산됨
		float f2 = 9;
		long l4 = 100;
//		long result2 = f2 + l4; 잘못된 연산
//		float result2 = f2 + l4; 옳은 연산

		
	
	}

}
