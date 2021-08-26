//캐스팅(클래스 끼리 형변환 규칙) 관련 규칙에 관한 예제

public class CastingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//다형성을 사용하지 않은 참조 방식
		President president1 = new President(); //이때까지 한 방식
		
		//다형성을 사용해서 객체를 참조할 경우
		//1. 자식 클래스 객체를 부모 클래스타입의 레퍼런스 변수가 참조하는 경우
		//자식 클래스 타입의 레퍼런스 값이 자동으로 부모클래스 타입으로 변경된(Upcasting)후 할당되어서 문제발생x.
		
		Person person1 = president1;
		
		
		//2. 부모 클래스 객체를 자식 클래스타입의 레퍼런스 변수가 참조하는 경우 -> 에러뜸
		//President president2 = person;
		//컴파일 오류 발생
		//이런 경우는 명시적으로 캐스팅(DownCasting) 해주어야 함.
		if(person1 instanceof President) {
			President president2 = (President) person1;
		}
		else {
			System.out.println("캐스팅 불가");
		}
		
		
		//3. 클래스끼리 캐스팅이 가능한 경우는 클래스들이 부모 자식 관계인 경우만 해당된다.
		//형제끼리는 상호캐스팅이 불가능.
		Student student1 = new Student();
		//President president3 = (President) student1;
		
		
		//4. 부모클래스의 레퍼런스 변수가 자식 클래스 객체를 가리키는 것은 허용하지만
		//자식클래스 타입의 레퍼런스 변수가 부모클래스 객체를 가리키는 것은 허용하지 않는다. 
		Person person2 = new Person();
		//President president4 = person2;
		if(person2 instanceof President) {
			President president4 = (President) person2;
		}
		else {
			System.out.println("캐스팅 불가");
		}
		
		
		//instanceof
		//좌측의 레퍼런스 변수를 우측의 클래스나 인터페이스 타입으로 캐스팅이 가능하지를 판단해주는 연산자
		
		//다운캐스팅을 해야하는 경우
		//부모클래스의 레퍼러스 변수로 자식클래스 객체를 참조하는 경우
		//부모클래스에는 정의되어 있지 않지만 자식클래스 객체에만 정의된 기능을 사용할 경우
		Person person3 = new Student();
//		person3.study();
		
		Student student2 = (Student)person3;
		student2.study();
		
		
		//다형성
		//부모클래스 타입의 레퍼런스 변수로 자식클래스 객체를 참조할 때 
		//자식클래스에서 재정의한 메소드를 호출하면 최종적으로 각 자식클래스에서 재정의한 메소드가 호출됨.
		//즉, 자바에서 호출되는 메소드는 컴파일타임이 아닌 러타임시 결정된다. 
		//즉, 메소드의 다형성이 제공된다. 
		Person person4 = new Student();
		person4.showSleepingStyle();
		person4 = new President();
		person4.showSleepingStyle();
		person4 = new Employee();
		person4.showSleepingStyle();
		
		//부모클래스 타입의 레퍼런스 변수로 자식클래스 객체를 참조할 때 
		//자식클래스에서 재정의한 변수를 호출하면 호출되는 변수는 레퍼런스 변수의 타입에 의해서 결정된다. 
		//호출되는 변수는 컴파일타임에 결정됨
		//즉, 자바에서 변수의 다형성은 제공되지 않는다.
		Person person5 = new Employee();
		System.out.println("person5.x = " + person5.x);
		
		Employee employee = (Employee)person5;
		System.out.println("employee1.x = " + employee.x);
		
		
	}

}
