
public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Car Ŭ���� ��ü ���
		Car myCar = new Car();
		//Car() : ������. ��ü�� ������ �� �� �ѹ� ȣ��Ǵ� ����
		//��ü�� �����Ǹ鼭 �� �Ӽ����� �⺻������ �ʱ�ȭ��
		
		System.out.println("myCar.company = " + myCar.company);
		System.out.println("myCar.velocity = " + myCar.velocity);
		
		myCar.company = "���׽ý�";
		System.out.println("myCar.company = " + myCar.company);
		
		myCar.speedup();
		System.out.println("myCar.speedup");
		System.out.println("myCar.velocity = " + myCar.velocity);

		myCar.speedup(10);
		System.out.println("myCar.speedup(10)");
		System.out.println("myCar.velocity = " + myCar.velocity);

		//�ϳ��� ���赵�� ���� ����ä ���� �� �ִ� ��ó��, 
		//�ϳ��� �ؾ Ʋ�� �ؾ�� ������ ���� �� �ִ� ��ó��,
		//������� ���� �ؾ�� ���� ���赵�� ��������� ���� �ٸ��Ŵ�.
		
		
		
		Car yourCar = new Car ();
		System.out.println("yourCar.company = " + yourCar.company);
		System.out.println("yourCar.velocity = " + yourCar.velocity);
	
		yourCar = myCar;
		System.out.println("yourCar.company = " + yourCar.company);
		System.out.println("yourCar.velocity = " + yourCar.velocity);
	
		
	
	}
	
			
			

}
