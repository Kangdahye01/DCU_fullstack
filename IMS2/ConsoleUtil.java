package util;

import java.util.Scanner;

import vo.IdolGroupVO;
import vo.SearchVO;

public class ConsoleUtil {

	public IdolGroupVO getNewIdolGroupVO(Scanner scanner) {
		// TODO Auto-generated method stub
		IdolGroupVO newIdolGroupVO = new IdolGroupVO();
		System.out.println("====�� ���̵��׷�����====");
		System.out.print("�̸� : ");
		String name = scanner.next();
		System.out.print("���� : ");
		String gender = scanner.next();
		System.out.print("���̴� : ");
		int generation = scanner.nextInt();
		System.out.print("��߳⵵ : ");
		int year = scanner.nextInt();
		System.out.print("���� : ");
		String nation = scanner.next();
		System.out.print("�Ҽӻ� : ");
		String company = scanner.next();
		System.out.print("�ٹ� : ");
		String album = scanner.next();
		
		newIdolGroupVO.setAlbum(album);
		newIdolGroupVO.setCompany(company);
		newIdolGroupVO.setGender(gender);
		newIdolGroupVO.setGeneration(generation);
		newIdolGroupVO.setName(name);
		newIdolGroupVO.setNation(nation);
		newIdolGroupVO.setYear(year);
		return newIdolGroupVO;
	}

	public void printRegistSuccessMessage(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + " �׷� ��� ����");
	}
	public void printRegistFailMessage(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + " �׷� ��� ����");
	}

	public void printIdolGroupList(IdolGroupVO[] idolGroupList) {
		// TODO Auto-generated method stub
		if(idolGroupList.length == 0) { //���̵� �׷��� �ϳ��� ��ϾȵǾ��������
			System.out.println("��ϵ� ���̵��׷� ������ �����ϴ�.");
		}
		else {
			System.out.println("���̵� �׷���");
			for (int i = 0; i < idolGroupList.length; i++) {
				System.out.println(idolGroupList[i]);
			}
		}
	}

	public String getName(String label, Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.print(label);
		return scanner.next();
	}

	public void printDetailIdolGroupVO(IdolGroupVO idolGroupVO) {
		// TODO Auto-generated method stub
		if(idolGroupVO == null) {
			System.out.println("�ش� ���̵� �׷��� �������� �ʽ��ϴ�.");
		}
		else {
			System.out.println("�ش� ���̵� �׷� ����");
			System.out.println(idolGroupVO);
		}
	}

	public IdolGroupVO getNewIdolGroupVO(IdolGroupVO oldIdolGroupVO, Scanner scanner) {
		// TODO Auto-generated method stub
		IdolGroupVO newIdolGroupVO = new IdolGroupVO();
		System.out.println("====�� ���̵��׷�����====");
		
		System.out.println("���� ���� : " + oldIdolGroupVO.getGender());
		System.out.print("���� : ");
		String gender = scanner.next();
		
		System.out.println("���� ���̴� : " + oldIdolGroupVO.getGeneration());
		System.out.print("���̴� : ");
		int generation = scanner.nextInt();
		
		System.out.println("���� ����⵵ : " + oldIdolGroupVO.getYear());
		System.out.print("��߳⵵ : ");
		int year = scanner.nextInt();
		
		System.out.println("���� ���� : " + oldIdolGroupVO.getNation());
		System.out.print("���� : ");
		String nation = scanner.next();
		
		System.out.println("���� �Ҽӻ� : " + oldIdolGroupVO.getCompany());
		System.out.print("�Ҽӻ� : ");
		String company = scanner.next();
		
		System.out.println("���� �ٹ� : " + oldIdolGroupVO.getAlbum());
		System.out.print("�ٹ� : ");
		String album = scanner.next();
		
		newIdolGroupVO.setAlbum(album);
		newIdolGroupVO.setCompany(company);
		newIdolGroupVO.setGender(gender);
		newIdolGroupVO.setGeneration(generation);
		newIdolGroupVO.setName(oldIdolGroupVO.getName());
		newIdolGroupVO.setNation(nation);
		newIdolGroupVO.setYear(year);
		return newIdolGroupVO;
	}

	public void printModifySuccessMessage(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + " ���̵� �׷� ���� ���� ����");
	}
	public void printModifyFailMessage(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + " ���̵� �׷� ���� ���� ����");
	}

	public void printRemoveSuccessMessage(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + " ���̵� �׷� ���� ����");
	}
	public void printRemoveFailMessage(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + " ���̵� �׷� ���� ����");
	}

	//�˻��� �ʿ��� ������ ����ڷκ��� �Է¹޾Ƽ� ��ȯ
	public SearchVO getSearchVO(Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.print("�˻����� (�̸� | ���̴�) : ");
		String searchCondition = scanner.next();
	
		
		if(searchCondition.contentEquals("�̸�")) {
			System.out.print("�˻��� �̸� : ");
		}
		else if(searchCondition.contentEquals("���̴�")) {
			System.out.print("�˻��� ���̴� : ");
		}
		
		String searchValue = scanner.next();
		
		
		return new SearchVO(searchCondition, searchValue);
	}

	public void printSearchIdolGroupVO(IdolGroupVO searchIdolGroupVO) {
		// TODO Auto-generated method stub
		if(searchIdolGroupVO == null) {
			System.out.println("�˻��� ������ �����ϴ�.");
		}
		else {
			System.out.println("�̸����� �˻��� ���");
			System.out.println(searchIdolGroupVO);
		}
	}

	public void printSearchIdolGroupVOArray(IdolGroupVO[] searchIdolGroupVOArray) {
		// TODO Auto-generated method stub
		if(searchIdolGroupVOArray.length == 0) {
			System.out.println("�˻��� ���̵��׷� ������ �����ϴ�.");
		}
		else {
			System.out.println("�˻��� ���̵� �׷���");
			for (int i = 0; i < searchIdolGroupVOArray.length; i++) {
				System.out.println( searchIdolGroupVOArray[i]);
			}
		}
	}

}




