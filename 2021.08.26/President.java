
public class President extends Person {
	String nation;
	int salary;
	
	@Override
	void showSleepingStyle() {
		System.out.println("대통령은 과중한 업무로 수면 시간이 부족하다.");
	}
}
