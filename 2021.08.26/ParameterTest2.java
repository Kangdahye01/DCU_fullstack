//������ǰ�� �����ϴ� ����� ����
//������ ������ǰ�� ���ڷ� �����ϸ� �ش簡����ǰ�� ����ó���ϰ� �ҰŴ�. 
class Gajun {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Gajun";
	}
}
class MicroWave extends Gajun {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "MicroWave";
	}
}
class TV extends Gajun {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "TV";
	}
}
class Telephone extends Gajun {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Telephone";
	}
}
class Buyer {
	Gajun[] gajunArray = new Gajun[3];
	int index = 0;
	
	void order(Gajun gajun) {
		gajunArray[index++] = gajun;
		System.out.println(gajun + "�� �ֹ��߽��ϴ�.");
		
	}
	
	void showOrderList() {
		String orderItem = "";
		for (int i = 0; i < gajunArray.length; i++) {
			orderItem += (i == 0) ? gajunArray[i] : "," + gajunArray[i];
		}
		
		System.out.println("�ֹ����: " + orderItem);
	}
}
public class ParameterTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer buyer = new Buyer();
		buyer.order(new Telephone());
		buyer.order(new TV());
		buyer.order(new MicroWave());
	
		//�ֹ������� �����ִ� ����� �߰��϶� 
		buyer.showOrderList();
		
	
	
	
	}

}
