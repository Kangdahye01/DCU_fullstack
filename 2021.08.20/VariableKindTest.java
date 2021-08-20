//자바의 변수 종류
//자바에서는 영역({})으로 묶인 곳에서는 어디서든지 변수를 선언할 수 있다.
//변수의 종류는 선언된 위치에 따라서 결정됨.
public class VariableKindTest {
	int memberVar;
	//멤버변수(인스턴스변수)
	//초기화 시점: new 연산자로 객체를 생성할 때 각 생성되는 객체마다 초기화됨 <2.>
	//멤버변수를 선언할 때 값을 초기화하지 않으면 객체를 생성할 때 기본값으로 자동 초기화됨 <1.>
	
	static int staticVar;
	//스테이틱 변수(클래스 변수)
	//초기화시점 : JVM이 해당 클래스를 로딩할 때 바로 클래스영역에 초기화됨
	//객체를 생성하지 않아도 클래스 이름으로 바로 접근(사용) 가능함 <3.>
	//해당 클래스로 생성된 모든 객체에서 공유됨 <4.>
	//멤버변수를 선언할 때 값을 초기화하지 않으면 객체를 생성할 때 기본값으로 자동 초기화됨. <5.>
	
	void printInfo(String paramVar) {
		//파라미터 변수 : 메소드를 호출할 때 인자로 전달하는 값을 저장하는 변수
		//특징은 로컬변수와 동일하다. 
		
		System.out.println("paramVar = " + paramVar);
	}
	
	//메소드 종류 : 멤버(인스턴스)메소드 , 스테이틱메소드 
	static void staticMethod1() {
		//클래스 객체를 생성하지 않아도 메소드를 클래스 이름으로 사용할 수 있다.
		//Math.random()
		
		//static 메소드 안에서 멤버변수를 접근할 수 있을까요?
		//안된다. 
		//멤버보다 static이 초기화 시점이 빠르기 때문.
		
//		int c = memberVar; x
		VariableKindTest vt = new VariableKindTest();
		int c = vt.memberVar;
//		instanceMethod1();x
		c = staticVar;
		staticMethod2();
		
	}
	void instanceMethod1() {
		int x = staticVar;
		staticMethod2();
		//인스턴스가 스테이틱보다 초기화 시점이 느리기 때문이다.
		
		x = memberVar;
		instanceMethod2();
	}
	void instanceMethod2() {
		
	}
	static void staticMethod2() {
		
	}
	
	//7. 멤버메소드는 객체를 생성해야 사용할 수 있지만, 스테이틱메소드는 객체를 생성하지않아도 사용할 수 있다.
	//따라서, 특정 속성을 저장하는 용도의 클래스가 아니고 특정연산을 하는 기능만 제공하고 해당 기능이 빈번하게 사용되는 클래스들의 메소드들은 
	//static으로 정의하는 것이 일반적인 방법이다. 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.
		VariableKindTest vt1 = new VariableKindTest();
		System.out.println("vt1.memberVar = " + vt1.memberVar);
		
		//2.
		
		VariableKindTest vt2 = new VariableKindTest();
		System.out.println("vt2.staticVar = " +vt2.staticVar);
		vt1.memberVar = 100;
		System.out.println("vt1.memberVar = 100;");
		System.out.println("vt1.memberVar = " + vt1.memberVar);
		System.out.println("vt2.memberVar = " + vt2.memberVar);
		
		//3.
//		System.out.println(VariableKindTest.memberVar); X
		System.out.println(VariableKindTest.staticVar);
		
		//4.
		VariableKindTest.staticVar = 200;
		System.out.println("vt1.staticVar = " +vt1.staticVar);
		System.out.println("vt2.staticVar = " +vt2.staticVar);
		
		int localVar;
		//로컬변수(지역변수)
		//변수를 선언할 때 값을 초기화하지 않으면 해당 변수를 사용할 때 에러 발생함
		//따라서, 변수를 사용하기 전에 반드시 초기화 해야 한다.
		//초기화 시점 : 해당 메소드가 실행될 때 메모리를 할당받았다가 해당 메소드가 다 실행되면 자동 소멸됨
//		System.out.println(localVar);
		
		int x = 5;
		int y = 6;
		if(x > y) {
			localVar = 100;
		}
		else {
			localVar = 200;
		}
		System.out.println(localVar);
		
		//paramVar
		vt2.printInfo("aaa");
		
		//7.
		VariableKindTest.staticMethod1();
//		VariableKindTest.instanceMethod();
		
		
		
		
		
	}

}
