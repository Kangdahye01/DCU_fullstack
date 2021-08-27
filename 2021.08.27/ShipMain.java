
abstract class Ship {
	abstract int move();
	abstract int carry();
	abstract String getName(); {
		
	}
	
}

class Boat extends Ship {
	@Override
	int carry() {
		// TODO Auto-generated method stub
		return 6;
	}
	@Override
	String getName() {
		// TODO Auto-generated method stub
		return "�߽ߺ�Ʈ";
	}
	@Override
	int move() {
		// TODO Auto-generated method stub
		return 0;
	}
}

class Cruise extends Ship {
	@Override
	String getName() {
		// TODO Auto-generated method stub
		return "���Թ���ȭ";
	}
	@Override
	int carry() {
		// TODO Auto-generated method stub
		return 300;
	}
	@Override
	int move() {
		// TODO Auto-generated method stub
		return 0;
	}
}

class ShipUtil {
	public static void search (Ship s) {
		System.out.println("�̸� : " + s.getName());
		System.out.println("��� : " + s.move());
		System.out.println("���� : " + s.carry());
	}
	}

public class ShipMain {
	public static void main (String[] args) {
		
		Boat boat = new Boat ();
		Cruise cruise = new Cruise();
		
		ShipUtil.search(boat);
		ShipUtil.search(cruise);
	}
}