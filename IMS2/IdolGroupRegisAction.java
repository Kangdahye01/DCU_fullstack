package action;

import java.util.Scanner;
//���� �ǹ��� Controller
//�����Ͻ� ������ Service Ŭ������ ����
//Action Ŭ������ Service Ŭ�������� �����Ͻ� ������ ó���ϱ� ���� ����ó�� �۾��� ��.
//������� : ����� �Ϸ��� ����� ������ �޴� �۾� ��
//�����Ͻ� ������ ó���� �� �� ����ڿ��� �����ִ� ȭ���� ����� �۾� -> action

import service.IdolGroupService;
//import service.IdolGroupService;
import util.ConsoleUtil;

public class IdolGroupRegisAction implements Action {

	@Override
	public void execute(Scanner scanner) throws Exception {
		// TODO Auto-generated method stub
		ConsoleUtil consoleUtil = new ConsoleUtil();
		vo.IdolGroupVO newIdolGroupVO = consoleUtil.getNewIdolGroupVO(scanner);
		
		IdolGroupService idolGroupService = new IdolGroupService() ;
		
		boolean registSuccess = idolGroupService.registIdolGroupVO(newIdolGroupVO);
		
		if(registSuccess) {
			consoleUtil.printRegistSuccessMessage(newIdolGroupVO.getName());
		}
		else {
			consoleUtil.printRegistFailMessage(newIdolGroupVO.getName());
		}
	}

}
