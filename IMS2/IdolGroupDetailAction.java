package action;

import java.util.Scanner;

import service.IdolGroupService;
import util.ConsoleUtil;
import vo.IdolGroupVO;

public class IdolGroupDetailAction implements Action {

	@Override
	public void execute(Scanner scanner) throws Exception {
		// TODO Auto-generated method stub
		ConsoleUtil consoleUtil = new ConsoleUtil();
		String name = consoleUtil.getName("�������� �� ���̵� �׷��̸�", scanner);
		
		IdolGroupService idolGroupService = new IdolGroupService();
		IdolGroupVO detailIdolGroupVO = idolGroupService.getDetailIdolGroupVO(name);
		
		consoleUtil.printDetailIdolGroupVO(detailIdolGroupVO);
	}

}
