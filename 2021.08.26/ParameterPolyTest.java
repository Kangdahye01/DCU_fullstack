//����� ������ �������ִ� Ŭ����
class PersonInfo{
	
	//��������� ���ڷ� �޾Ƽ� �ش� ���� ����� ���齺Ÿ���� �����ϴ� �޼ҵ�
	//�䱸�����߰�
	//��������� Student �϶��� Study()  �޼ҵ带 ȣ���϶�.
	void showPersonSleepingStyle(Person person) {
		//��� ����� ���齺Ÿ���� ã�� �� ����
		if(person instanceof Student) {
			Student student = (Student) person;
			student.study();
			//�Ѿ�� ��ü�� student�� �ٲ���.
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
