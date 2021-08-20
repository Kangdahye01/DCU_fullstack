
public class VariableArgsTest {
	void printInfo(String ...info) {
		//info는 배열취급함
		System.out.println(info.length);
		
		for (int i = 0; i < info.length; i++) {
			System.out.println(info[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableArgsTest vt = new VariableArgsTest();
		vt.printInfo();
		vt.printInfo("aaa");
		vt.printInfo("aaa", "bbb");
	}

}
