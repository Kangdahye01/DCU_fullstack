
public class multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++)  // �� ��
		{
			for(int j=2;j<=9;j++)
			{
				System.out.print(j+"*"+i+"="+i*j+"\t");
				// \t => tab ���� ���� ��
			}
			System.out.println();
		}
		
		//�����
		for(int i=1;i<=9;i++)  
		{
			for(int j=2;j<=9;j++)
			{
				int k = i * j;
				System.out.print(i + "*" + j +"="+ k + "\t");
			}
		
			System.out.println();
	}

}
}