
public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Car 클래스 객체 사용
		Car myCar = new Car();
		//Car() : 생성자. 객체를 생성할 때 단 한번 호출되는 단위
		//객체가 생성되면서 각 속성들은 기본값으로 초기화됨
		
		System.out.println("myCar.company = " + myCar.company);
		System.out.println("myCar.velocity = " + myCar.velocity);
		
		myCar.company = "제네시스";
		System.out.println("myCar.company = " + myCar.company);
		
		myCar.speedup();
		System.out.println("myCar.speedup");
		System.out.println("myCar.velocity = " + myCar.velocity);

		myCar.speedup(10);
		System.out.println("myCar.speedup(10)");
		System.out.println("myCar.velocity = " + myCar.velocity);

		//하나의 설계도로 집을 여러채 만들 수 있는 거처럼, 
		//하나의 붕어빵 틀로 붕어빵을 여러개 만들 수 있는 거처럼,
		//만들어진 집과 붕어빵은 같은 설계도로 만들었지만 각각 다른거다.
		
		
		
		Car yourCar = new Car ();
		System.out.println("yourCar.company = " + yourCar.company);
		System.out.println("yourCar.velocity = " + yourCar.velocity);
	
		yourCar = myCar;
		System.out.println("yourCar.company = " + yourCar.company);
		System.out.println("yourCar.velocity = " + yourCar.velocity);
	
		
	
	}
	
			
			

}
