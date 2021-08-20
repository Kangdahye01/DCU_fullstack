//�ڹ��� ���� ����
//�ڹٿ����� ����({})���� ���� �������� ��𼭵��� ������ ������ �� �ִ�.
//������ ������ ����� ��ġ�� ���� ������.
public class VariableKindTest {
	int memberVar;
	//�������(�ν��Ͻ�����)
	//�ʱ�ȭ ����: new �����ڷ� ��ü�� ������ �� �� �����Ǵ� ��ü���� �ʱ�ȭ�� <2.>
	//��������� ������ �� ���� �ʱ�ȭ���� ������ ��ü�� ������ �� �⺻������ �ڵ� �ʱ�ȭ�� <1.>
	
	static int staticVar;
	//������ƽ ����(Ŭ���� ����)
	//�ʱ�ȭ���� : JVM�� �ش� Ŭ������ �ε��� �� �ٷ� Ŭ���������� �ʱ�ȭ��
	//��ü�� �������� �ʾƵ� Ŭ���� �̸����� �ٷ� ����(���) ������ <3.>
	//�ش� Ŭ������ ������ ��� ��ü���� ������ <4.>
	//��������� ������ �� ���� �ʱ�ȭ���� ������ ��ü�� ������ �� �⺻������ �ڵ� �ʱ�ȭ��. <5.>
	
	void printInfo(String paramVar) {
		//�Ķ���� ���� : �޼ҵ带 ȣ���� �� ���ڷ� �����ϴ� ���� �����ϴ� ����
		//Ư¡�� ���ú����� �����ϴ�. 
		
		System.out.println("paramVar = " + paramVar);
	}
	
	//�޼ҵ� ���� : ���(�ν��Ͻ�)�޼ҵ� , ������ƽ�޼ҵ� 
	static void staticMethod1() {
		//Ŭ���� ��ü�� �������� �ʾƵ� �޼ҵ带 Ŭ���� �̸����� ����� �� �ִ�.
		//Math.random()
		
		//static �޼ҵ� �ȿ��� ��������� ������ �� �������?
		//�ȵȴ�. 
		//������� static�� �ʱ�ȭ ������ ������ ����.
		
//		int c = memberVar; x
		VariableKindTest vt = new VariableKindTest();
		int c = vt.memberVar;
//		instanceMethod1();x
		c = staticVar;
		staticMethod2();
		
	}
	void instanceMethod1() {
		int x = staticVar;
		staticMethod2();
		//�ν��Ͻ��� ������ƽ���� �ʱ�ȭ ������ ������ �����̴�.
		
		x = memberVar;
		instanceMethod2();
	}
	void instanceMethod2() {
		
	}
	static void staticMethod2() {
		
	}
	
	//7. ����޼ҵ�� ��ü�� �����ؾ� ����� �� ������, ������ƽ�޼ҵ�� ��ü�� ���������ʾƵ� ����� �� �ִ�.
	//����, Ư�� �Ӽ��� �����ϴ� �뵵�� Ŭ������ �ƴϰ� Ư�������� �ϴ� ��ɸ� �����ϰ� �ش� ����� ����ϰ� ���Ǵ� Ŭ�������� �޼ҵ���� 
	//static���� �����ϴ� ���� �Ϲ����� ����̴�. 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.
		VariableKindTest vt1 = new VariableKindTest();
		System.out.println("vt1.memberVar = " + vt1.memberVar);
		
		//2.
		
		VariableKindTest vt2 = new VariableKindTest();
		System.out.println("vt2.staticVar = " +vt2.staticVar);
		vt1.memberVar = 100;
		System.out.println("vt1.memberVar = 100;");
		System.out.println("vt1.memberVar = " + vt1.memberVar);
		System.out.println("vt2.memberVar = " + vt2.memberVar);
		
		//3.
//		System.out.println(VariableKindTest.memberVar); X
		System.out.println(VariableKindTest.staticVar);
		
		//4.
		VariableKindTest.staticVar = 200;
		System.out.println("vt1.staticVar = " +vt1.staticVar);
		System.out.println("vt2.staticVar = " +vt2.staticVar);
		
		int localVar;
		//���ú���(��������)
		//������ ������ �� ���� �ʱ�ȭ���� ������ �ش� ������ ����� �� ���� �߻���
		//����, ������ ����ϱ� ���� �ݵ�� �ʱ�ȭ �ؾ� �Ѵ�.
		//�ʱ�ȭ ���� : �ش� �޼ҵ尡 ����� �� �޸𸮸� �Ҵ�޾Ҵٰ� �ش� �޼ҵ尡 �� ����Ǹ� �ڵ� �Ҹ��
//		System.out.println(localVar);
		
		int x = 5;
		int y = 6;
		if(x > y) {
			localVar = 100;
		}
		else {
			localVar = 200;
		}
		System.out.println(localVar);
		
		//paramVar
		vt2.printInfo("aaa");
		
		//7.
		VariableKindTest.staticMethod1();
//		VariableKindTest.instanceMethod();
		
		
		
		
		
	}

}
