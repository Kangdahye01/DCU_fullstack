package ui;

import java.util.Scanner;

import service.IdolGroupService;
import util.ConsoleUtil;
import vo.IdolGroupVO;
import vo.SearchVO;

public class IdolGroupUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(System.getProperty("line.separator"));
		//System.getProperty : �ý��� �Ӽ����� ��ȯ
		
		boolean stop = false;
		IdolGroupService idolGroupService
		= new IdolGroupService();
		ConsoleUtil consoleUtil = new ConsoleUtil();
		
		do {
			System.out.println("=====���̵��׷����======");
			System.out.println("1. ���̵��׷���"); //C(Create)
			System.out.println("2. ���̵��׷��Ϻ���");//R(Read)
			System.out.println("3. ���̵��׷����� �󼼺���");//R(Read)
			System.out.println("4. ���̵��׷����� ����");
			System.out.println("5. ���̵��׷����� ����");
			System.out.println("6. ���̵��׷����� �˻�");
			System.out.println("7. ���α׷�����");
			
			System.out.print("�޴���ȣ : ");
			int menuNumber = scanner.nextInt();
			
			switch (menuNumber) {
			case 1: {
				IdolGroupVO newIdolGroupVO =
					consoleUtil.getNewIdolGroupVO(scanner);	
				boolean registSuccess = 
						idolGroupService.registNewIdolGroupVO(newIdolGroupVO);
				if(registSuccess) {
					consoleUtil.printRegistSuccessMessage(newIdolGroupVO.getName());
				}
				else {
					consoleUtil.printRegistFailMessage(newIdolGroupVO.getName());
				}
				break;
			}
			
			case 2:
				IdolGroupVO[] idolGroupList = 
				idolGroupService.getIdolGroupList();
				consoleUtil.printIdolGroupList(idolGroupList);
				break;
			case 3:
				String name = 
				consoleUtil.getName("�󼼳����� �� ���̵��׷��̸� :", scanner);
				IdolGroupVO idolGroupVO = 
						idolGroupService.getDetailIdolGroupVO(name);
				consoleUtil.printDetailIdolGroupVO(idolGroupVO);
				break;
			case 4:
				name = 
				consoleUtil.getName("������ ���̵��׷��̸� :", scanner);
				
				IdolGroupVO oldIdolGroupVO = 
						idolGroupService.getOldIdolGroupVO(name);
				IdolGroupVO newIdolGroupVO = 
						consoleUtil.getNewIdolGroupVO(oldIdolGroupVO, scanner);
				boolean modifySuccess = 
						idolGroupService.modifyIdolGroupVO(newIdolGroupVO);
				if(modifySuccess) {
					consoleUtil.printModifySuccessMessage(newIdolGroupVO.getName());
				}
				else {
					consoleUtil.printModifySuccessMessage(newIdolGroupVO.getName());
				}
				break;
			case 5:
				name = consoleUtil.getName("������ ���̵� �׷� �̸� : ",
						scanner);
				boolean removeSuccess = 
						idolGroupService.removeIdolGroupVO(name);
				if(removeSuccess) {
					consoleUtil.printRemoveSuccessMessage(name);
				}
				else {
					consoleUtil.printRemoveFailMessage(name);
				}
				break;
			case 6:
				//1.�˻��� �ʿ��� ����(�˻�����, �˻���)�� ����ڷκ��� �Է� �޴´�.
				SearchVO searchVO = consoleUtil.getSearchVO(scanner);
				
				//2. �˻����ǿ� ���� ���̵� �׷� �˻�
				//�̸����� �˻��Ҷ��� ����Ÿ���� IdolGroupVO �̰�
				//���̴�� �˻��ϸ� ����Ÿ���� IdolGroupVO[] �̹Ƿ�
				if(searchVO.getSearchCondition().contentEquals("�̸�")) {
					IdolGroupVO searchIdolGroupVO = 
							idolGroupService.searchIdolGroupVOByName(searchVO.getSearchValue());
					consoleUtil.printSearchIdolGroupVO(searchIdolGroupVO);
				}
				else {
					//������ �޼ҵ��̸��� �ٶ� �����ϰ� �ٿ��� �ǹ̰� ��ȣ������ �ͺ��ٴ�
					//�̸��� ��� ����
					IdolGroupVO[] searchIdolGroupVOArray =
	idolGroupService.searchIdolGroupVOArrayByGeneration
	(searchVO.getSearchValue());
	consoleUtil.printSearchIdolGroupVOArray(searchIdolGroupVOArray);
				}
				break;
			default:
			}
		} while (!stop);
	}

}






