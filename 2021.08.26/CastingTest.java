//ĳ����(Ŭ���� ���� ����ȯ ��Ģ) ���� ��Ģ�� ���� ����

public class CastingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������� ������� ���� ���� ���
		President president1 = new President(); //�̶����� �� ���
		
		//�������� ����ؼ� ��ü�� ������ ���
		//1. �ڽ� Ŭ���� ��ü�� �θ� Ŭ����Ÿ���� ���۷��� ������ �����ϴ� ���
		//�ڽ� Ŭ���� Ÿ���� ���۷��� ���� �ڵ����� �θ�Ŭ���� Ÿ������ �����(Upcasting)�� �Ҵ�Ǿ �����߻�x.
		
		Person person1 = president1;
		
		
		//2. �θ� Ŭ���� ��ü�� �ڽ� Ŭ����Ÿ���� ���۷��� ������ �����ϴ� ��� -> ������
		//President president2 = person;
		//������ ���� �߻�
		//�̷� ���� ��������� ĳ����(DownCasting) ���־�� ��.
		if(person1 instanceof President) {
			President president2 = (President) person1;
		}
		else {
			System.out.println("ĳ���� �Ұ�");
		}
		
		
		//3. Ŭ�������� ĳ������ ������ ���� Ŭ�������� �θ� �ڽ� ������ ��츸 �ش�ȴ�.
		//���������� ��ȣĳ������ �Ұ���.
		Student student1 = new Student();
		//President president3 = (President) student1;
		
		
		//4. �θ�Ŭ������ ���۷��� ������ �ڽ� Ŭ���� ��ü�� ����Ű�� ���� ���������
		//�ڽ�Ŭ���� Ÿ���� ���۷��� ������ �θ�Ŭ���� ��ü�� ����Ű�� ���� ������� �ʴ´�. 
		Person person2 = new Person();
		//President president4 = person2;
		if(person2 instanceof President) {
			President president4 = (President) person2;
		}
		else {
			System.out.println("ĳ���� �Ұ�");
		}
		
		
		//instanceof
		//������ ���۷��� ������ ������ Ŭ������ �������̽� Ÿ������ ĳ������ ���������� �Ǵ����ִ� ������
		
		//�ٿ�ĳ������ �ؾ��ϴ� ���
		//�θ�Ŭ������ ���۷��� ������ �ڽ�Ŭ���� ��ü�� �����ϴ� ���
		//�θ�Ŭ�������� ���ǵǾ� ���� ������ �ڽ�Ŭ���� ��ü���� ���ǵ� ����� ����� ���
		Person person3 = new Student();
//		person3.study();
		
		Student student2 = (Student)person3;
		student2.study();
		
		
		//������
		//�θ�Ŭ���� Ÿ���� ���۷��� ������ �ڽ�Ŭ���� ��ü�� ������ �� 
		//�ڽ�Ŭ�������� �������� �޼ҵ带 ȣ���ϸ� ���������� �� �ڽ�Ŭ�������� �������� �޼ҵ尡 ȣ���.
		//��, �ڹٿ��� ȣ��Ǵ� �޼ҵ�� ������Ÿ���� �ƴ� ��Ÿ�ӽ� �����ȴ�. 
		//��, �޼ҵ��� �������� �����ȴ�. 
		Person person4 = new Student();
		person4.showSleepingStyle();
		person4 = new President();
		person4.showSleepingStyle();
		person4 = new Employee();
		person4.showSleepingStyle();
		
		//�θ�Ŭ���� Ÿ���� ���۷��� ������ �ڽ�Ŭ���� ��ü�� ������ �� 
		//�ڽ�Ŭ�������� �������� ������ ȣ���ϸ� ȣ��Ǵ� ������ ���۷��� ������ Ÿ�Կ� ���ؼ� �����ȴ�. 
		//ȣ��Ǵ� ������ ������Ÿ�ӿ� ������
		//��, �ڹٿ��� ������ �������� �������� �ʴ´�.
		Person person5 = new Employee();
		System.out.println("person5.x = " + person5.x);
		
		Employee employee = (Employee)person5;
		System.out.println("employee1.x = " + employee.x);
		
		
	}

}
