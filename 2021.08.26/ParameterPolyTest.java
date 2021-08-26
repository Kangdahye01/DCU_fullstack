//사람의 정보를 제공해주는 클래스
class PersonInfo{
	
	//사람종류를 인자로 받아서 해당 종류 사람의 수면스타일을 제공하는 메소드
	//요구사항추가
	//사람종류가 Student 일때는 Study()  메소드를 호출하라.
	void showPersonSleepingStyle(Person person) {
		//모든 사람의 수면스타일을 찾을 수 있음
		if(person instanceof Student) {
			Student student = (Student) person;
			student.study();
			//넘어온 객체를 student로 바꿔줌.
		}
		person.showSleepingStyle();
	}
}


public class ParameterPolyTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonInfo pi = new PersonInfo();
		pi.showPersonSleepingStyle(new President());
		pi.showPersonSleepingStyle(new Student());
		pi.showPersonSleepingStyle(new Employee());
	}

}
