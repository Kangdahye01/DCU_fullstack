//main 메소드에 전달되는 인자들은 args 배열에 String 타입으로 전달된다.
//만약, 인자값이 3개면 args[0], args[1].args[2] 각각 영역에 전달된다.
public class ArgsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.parseInt(args[0]));
        for (int i = 0; i < args.length; i++) {
			System.out.println("args["+i+"] = "+args[i]);
		}
		
	}

}
