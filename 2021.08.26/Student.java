
public class Student extends Person {
	String schoolKind;
	int grade;
	
	@Override
	void showSleepingStyle() {
		System.out.println("�л����� ���齺Ÿ���� ��Ģ���̴�. ");
	}
	
	//�θ�Ŭ������ ���� �޼ҵ�
	public void study() {
		System.out.println("���θ� �Ѵ�.");
	}
}
