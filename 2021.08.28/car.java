import java.util.Scanner;

interface Speed {
	int speed = 10;
	void upSpeed(int inc); //인터페이스의 메소드는 껍데기만 구현. 세미클론 붙이면됨 중괄호말고.
	void downSpeed(int dec);
	void stop();
}
interface Display {
	void disp();
}

class Car implements Speed, Display {
	int inputVelocity;
	int velocity = speed;
	
	void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("속도입력 : " );
		int inputVelocity = scanner.nextInt();
		if (inputVelocity > 0) {
			upSpeed(inputVelocity);
		}
		else {
			downSpeed(inputVelocity);
		}
		disp();
	}

	@Override
	public void upSpeed(int inc) {
		// TODO Auto-generated method stub
		inputVelocity = inc ;
		velocity = velocity + inputVelocity;
		
	}
	
	@Override
	public void downSpeed(int dec) {
		// TODO Auto-generated method stub
		inputVelocity = dec;
		velocity = velocity + inputVelocity;
	}
	
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		velocity = 0;
		System.out.println("정지했습니다.");
	}
	
	@Override
	public void disp() {
		// TODO Auto-generated method stub
	
	
		if (velocity <= 0) {
			stop();
		}
		else {
			System.out.println("현재 속도는 " + velocity + "km/h 입니다.");
		}
	}
	
}
public class WorkShop5 {
	public static void main (String[] args) {
		Car car = new Car();
		boolean stop = false;
		do {
			car.input();
			if(car.velocity <= 0) {
				stop = true;
			}
		} while (!stop);
	}
}
