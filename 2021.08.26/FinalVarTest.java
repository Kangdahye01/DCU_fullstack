//final�� ���� �տ� ����
//����� ������ �� �����.

public class FinalVarTest {
	final int x ; //static�� �������� �ʴ� ��� 
	//�ν��Ͻ� ��� :�� ��ü���� �����Ǵ� ���( �ν��Ͻ� = ��ü)   
	//��������� ���� �־���� �ǹ̰� ����. ���� �ȳ־��ٸ� �ǹ̰� ����.
	//���� ��� ī������� ����µ� �� ī�尳�Ը����� ���̿� ���ڸ� �ν��Ͻ� ����� ����.
	//����, �ַ� ��ü�� ������ �� �����ڿ��� ���� �ʱ�ȭ��Ű�� ��찡 ����. 
	//������� ���α׷� �ȿ��� ������ �� ����. 
	
	
	static final int y ;
	//Ŭ���� ��� (static ���)
	//ī����ӿ��� ī���� ���̿� ���� ���� Ŭ���� ����� ����
	//�ַ�, �����Ҷ��� static �ʱ�ȭ ��Ͽ��� �ʱ�ȭ �Ѵ�. 
	static {
		y = 10;
	}
	
	public FinalVarTest(int x) {
		// TODO Auto-generated constructor stub
		this.x = x; //���⼭ �ʱ�ȭ ��Ŵ
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.
		FinalVarTest ft1 = new FinalVarTest(10);
		FinalVarTest ft2 = new FinalVarTest(20);
		System.out.println("ft1.x = " + ft1.x);
		System.out.println("ft2.x = " + ft2.x);
		
		//2.
//		ft1.x = 100;
		
		//3. 
		System.out.println(FinalVarTest.y);
		System.out.println(ft1.y);
		System.out.println(ft2.y);
	}

}
