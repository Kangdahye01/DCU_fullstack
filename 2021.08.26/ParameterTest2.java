//가전제품을 구매하는 기능을 정의
//구매할 가전제품을 인자로 전달하면 해당가전제품을 구매처리하게 할거다. 
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
		System.out.println(gajun + "을 주문했습니다.");
		
	}
	
	void showOrderList() {
		String orderItem = "";
		for (int i = 0; i < gajunArray.length; i++) {
			orderItem += (i == 0) ? gajunArray[i] : "," + gajunArray[i];
		}
		
		System.out.println("주문목록: " + orderItem);
	}
}
public class ParameterTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer buyer = new Buyer();
		buyer.order(new Telephone());
		buyer.order(new TV());
		buyer.order(new MicroWave());
	
		//주문내역을 보여주는 기능을 추가하라 
		buyer.showOrderList();
		
	
	
	
	}

}
