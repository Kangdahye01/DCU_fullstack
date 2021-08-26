//final이 클래스 앞에 지정되면 상속할 수 없다는 의미
//플랫폼(안드로이드 등)에서 자동으로 만들어주는 클래스들은 일반적으로 final로 변경을 막는다.
//안드로이드에서 리소스를 관리해주는 R클래스 등에 사용

class FinalClassSuper{
	
}
class FinalClassSub extends FinalClassSuper {
	
}
public class FinalClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
