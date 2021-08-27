
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
		return "½ß½ßº¸Æ®";
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
		return "ÀüÇÔ¹«±ÃÈ­";
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
		System.out.println("ÀÌ¸§ : " + s.getName());
		System.out.println("»ç¶÷ : " + s.move());
		System.out.println("¹«±â : " + s.carry());
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