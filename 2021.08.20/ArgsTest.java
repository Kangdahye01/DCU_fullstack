//자바에서 인자가 전달되는 방식은 Call By Value이다. 
//인자의 값이 복사되어 전달됨
class Data{
	int x;
	int y;
	
	void addPriv(int x, int y) {
		x += 100;
		y += 100;
	}
	void addObj(Data data) {
		data.x = 100;
		data.y = 100;
	}
	void addRet(Data data) {
		data = null;
		data = null;
	}
}
public class ArgsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data data = new Data();
		data.x = 40;
		data.y = 40;
		System.out.println("data.x = " + data.x);
		System.out.println("data.y = " + data.y);
		
		data.addPriv(data.x, data.y);
		System.out.println("data.x = " + data.x);//40
		System.out.println("data.y = " + data.y);//40
		
		data.addObj(data);
		System.out.println("data.x = " + data.x);//100
		System.out.println("data.y = " + data.y);//100
		
		data.addRet(data);
		System.out.println("data.x = " + data.x);//100
		System.out.println("data.y = " + data.y);//100
		
	}

}
