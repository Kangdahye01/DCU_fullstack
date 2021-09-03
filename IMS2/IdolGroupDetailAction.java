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
		String name = consoleUtil.getName("상세정보를 볼 아이돌 그룹이름", scanner);
		
		IdolGroupService idolGroupService = new IdolGroupService();
		IdolGroupVO detailIdolGroupVO = idolGroupService.getDetailIdolGroupVO(name);
		
		consoleUtil.printDetailIdolGroupVO(detailIdolGroupVO);
	}

}
