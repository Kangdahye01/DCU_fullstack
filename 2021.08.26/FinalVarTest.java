//final이 변수 앞에 오면
//상수를 정의할 때 사용함.

public class FinalVarTest {
	final int x ; //static이 지정되지 않는 상수 
	//인스턴스 상수 :각 객체마다 지정되는 상수( 인스턴스 = 객체)   
	//상수에서는 값을 넣어줘야 의미가 있음. 값을 안넣었다면 의미가 없다.
	//예를 들어 카드게임을 만드는데 각 카드개게마다의 무늬와 숫자를 인스턴스 상수로 지정.
	//따라서, 주로 객체를 생성할 때 생성자에서 값을 초기화시키는 경우가 많다. 
	//상수값으 프로그램 안에서 변경할 수 없다. 
	
	
	static final int y ;
	//클래스 상수 (static 상수)
	//카드게임에서 카드의 높이와 넓이 등은 클래스 상수로 지정
	//주로, 선언할때나 static 초기화 블록에서 초기화 한다. 
	static {
		y = 10;
	}
	
	public FinalVarTest(int x) {
		// TODO Auto-generated constructor stub
		this.x = x; //여기서 초기화 시킴
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.
		FinalVarTest ft1 = new FinalVarTest(10);
		FinalVarTest ft2 = new FinalVarTest(20);
		System.out.println("ft1.x = " + ft1.x);
		System.out.println("ft2.x = " + ft2.x);
		
		//2.
//		ft1.x = 100;
		
		//3. 
		System.out.println(FinalVarTest.y);
		System.out.println(ft1.y);
		System.out.println(ft2.y);
	}

}
