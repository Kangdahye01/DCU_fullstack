//자바에서 배열에는 동일한 타입의 값만 저장할 수 있다. 
//클래스타입도 Student면 Student만, President면 President만
//그런데 만약, 관련이 있는 객체들을 하나의 배열로 다루고 싶으면 해당 클래스들의 
//부모클래스를 정의하고 배열의 데이터타입으로 부모클래스 타입으로 지정하면 됨.
public class ArrayPolyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] personArray = new Person[3];
		personArray[0] = new President();
		personArray[1] = new Student();
		personArray[2] = new Employee();
		
		for (int i = 0; i < personArray.length; i++) {
			personArray[i].showSleepingStyle();
			
		}
	}

}
