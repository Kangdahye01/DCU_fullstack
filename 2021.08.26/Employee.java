
public class Employee extends Person {
	String department; //Employee에는 부서라는 걸 저장할 수 있게 함.
	int x = 20;
	
	@Override//[메서드 재정의] 
	void showSleepingStyle() {
		// TODO Auto-generated method stub
		System.out.println("직장인들은 과중한 업무와 잦은 회식으로 수면시간이 불규칙하다.");
	}
}
