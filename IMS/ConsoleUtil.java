//���Ͽ� �ִ� Ŭ������ �ƴ�
//��ƿ���� Ŭ���� (�������� Ŭ����)
//ȭ�鿡�� ����
//����ڰ� ���� ȭ�鿡 ����ϱ� ������, �ϳ��� �� ������
//UI���� �ʹ� �������� �������� �ڵ尡 �����
//�� Ŭ������ ������ ���� UI�� �������� ���̰� Ŭ������ ����

package util;

import java.util.Scanner;

import vo.IdolGroupVO;
import vo.SearchVO;

public class ConsoleUtil {

	public IdolGroupVO getNewIdolGroupVO(Scanner sc) {
		// TODO Auto-generated method stub
		IdolGroupVO newIdolGroupVO = new IdolGroupVO();
		System.out.println("====�� ���̵� �׷� ����====");
		System.out.print("�̸� : ");
		String name = sc.next();
		System.out.print("���� : ");
		String gender = sc.next();
		System.out.print("���̴� : ");
		int generation = sc.nextInt();
		System.out.print("���߳⵵ : ");
		int year = sc.nextInt();
		System.out.print("���� : ");
		String nation = sc.next();
		System.out.print("�ٹ� : ");
		String album = sc.next();
		System.out.print("�Ҽӻ� : ");
		String company = sc.next();

		newIdolGroupVO.setAlbum(album);
		newIdolGroupVO.setCompany(company);
		newIdolGroupVO.setGender(gender);
		newIdolGroupVO.setGeneration(generation);
		newIdolGroupVO.setName(name);
		newIdolGroupVO.setNation(nation);
		newIdolGroupVO.setYear(year);
		return newIdolGroupVO;
	}

	public void printRegisterSuccessMessage(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + " �׷� ��� ����");
	}
	public void printRegisterFailMessage(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + " �׷� ��� ����");
	}

	public void printIdolGroupList(IdolGroupVO[] idolGroupList) {
		//�迭 0�� index���� �ݺ��ϸ� data���
		if(idolGroupList.length == 0) {
			//�̸��� �ϳ��� ��� �ȵǾ� �ִٸ�,
			System.out.println("��ϵ� ���̵� �׷� ������ �����ϴ�.");
		}
		else { //�̸��� ��ϵǾ� �ִٸ�
			System.out.println("���̵� �׷� ���"); //�̸� ���
			for (int i = 0; i < idolGroupList.length; i++) { //�ݺ��ؼ� �̸��� ���
				System.out.println("�׷��: " + idolGroupList[i].getName() + 
						" �Ҽӻ� :" + idolGroupList[i].getCompany() + 
						"�ٹ� :" + idolGroupList[i].getAlbum() +
						"���̴� : " + idolGroupList[i].getGeneration());
			}
		}
	}

	public String getName(String label, Scanner sc) {
		//label�� �޾ƿ�
		System.out.println(label);//label�� ���
		return sc.next(); //��ȯ�� ���� �ٷ� ����
	}

	public void printDetailIdolGroupVO(IdolGroupVO idolGroupVO) { //�޼ҵ� ����
		if(idolGroupVO == null) {//���� �˻��ؼ� ������ ������(DB�� ������)
			System.out.println("�ش� ���̵� �׷��� �������� �ʽ��ϴ�.");
		}
		else {
			System.out.println("�ش� ���̵� �׷� ����."); //�ش� �׷��� ������ �˻�
			System.out.print("�׷��: " + idolGroupVO.getName() + 
					" �Ҽӻ� : " + idolGroupVO.getCompany() + 
					" �ٹ� : " + idolGroupVO.getAlbum() +
					" ���̴� : " + idolGroupVO.getGeneration());
		}
	}

	public IdolGroupVO getNewIdolGroupVO(IdolGroupVO oldIdolGroupVO, Scanner sc) {
		//�����ϰ���� ������ ����ڷκ��� �Է� ����
		IdolGroupVO newIdolGroupVO = new IdolGroupVO();
		System.out.println("====�� ���̵� �׷� ����====");
		//		System.out.print("�̸� : ");//�̸��� �ĺ����̱� ������ �����ϸ� �ȵ�
		//		String name = sc.next();

		//���������� �޾Ƽ� ����
		System.out.println("���� ���� :" + oldIdolGroupVO.getGender());
		System.out.print("���� : ");
		String gender = sc.next();

		System.out.println("���� ���̴� :" + oldIdolGroupVO.getGeneration());
		System.out.print("���̴� : ");
		int generation = sc.nextInt();

		System.out.println("���� ���߳⵵ :" + oldIdolGroupVO.getYear());
		System.out.print("���߳⵵ : ");
		int year = sc.nextInt();

		System.out.println("���� ���� :" + oldIdolGroupVO.getNation());
		System.out.print("���� : ");
		String nation = sc.next();

		System.out.println("���� �ٹ� :" + oldIdolGroupVO.getAlbum());
		System.out.print("�ٹ� : ");
		String album = sc.next();

		System.out.println("���� �Ҽӻ� :" + oldIdolGroupVO.getCompany());
		System.out.print("�Ҽӻ� : ");
		String company = sc.next();

		newIdolGroupVO.setAlbum(album);
		newIdolGroupVO.setCompany(company);
		newIdolGroupVO.setGender(gender);
		newIdolGroupVO.setGeneration(generation);
		newIdolGroupVO.setName(oldIdolGroupVO.getName());
		//����ڷκ��� �޴� �κ��� ���� ������
		//������ �̸��� �״�� �޾ƿͼ� ��� (�ĺ��ڶ� ����Ұ�)
		newIdolGroupVO.setNation(nation);
		newIdolGroupVO.setYear(year);
		return newIdolGroupVO; //������ ����
	}

	public void printModifySuccessMessage(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + " ���� ���� ����");

	}

	public void printModifyFailMessage(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + " ���� ���� ����");
	}

	public String getDelName(String label, Scanner sc) {
		//label�� �޾ƿ�
		System.out.println(label);//label�� ���
		return sc.next(); //��ȯ�� ���� �ٷ� ����
	}



	public void printDeleteSuccessMessage(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + " ���� ����");
	}

	public void printDeleteFailMessage(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + " ���� ����");
	}

	public void printRemoveSuccessMessage(String name) {
		// TODO Auto-generated method stub
		System.out.println(name +"�׷� ���� �Ϸ�");
	}
	public void printRemoveFailMessage(String name) {
		// TODO Auto-generated method stub
		System.out.println(name +"�׷� ���� ����");
	}

	//�˻��� �ʿ��� ������ ����ڷκ��� �Է¹޾� ��ȯ���ִ� method
	public SearchVO getSearchVO(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("�˻� ���� (�̸� | ���̴�) : ");//���
		String searchCondition = sc.next();//����ڰ� �Է��� ����

		if(searchCondition.equals("�̸�")) { //searchCondition�� �̸��� ���
			System.out.println("�˻��� �׷�� : ");
		}
		else if(searchCondition.equals("���̴�")) { //searchCondition�� ���̴��� ���
			System.out.println("�˻��� ���̴� : ");
		}
		String searchValue =  "";//����ڰ� �Է��� ��
		return new SearchVO(searchCondition, searchValue);
	}

	public void printSearchIdolGroupVO(IdolGroupVO searchIdolGroupVO) {
		// TODO Auto-generated method stub
		if(searchIdolGroupVO == null) {
			System.out.println("�˻��� ������ �����ϴ�.");
			//�˻��� �̸��� ������ ���
		}
		else {
			System.out.println("�̸����� �˻��� ���");
			System.out.print("�׷��: " + searchIdolGroupVO.getName() + 
					" �Ҽӻ� : " + searchIdolGroupVO.getCompany() + 
					" �ٹ� : " + searchIdolGroupVO.getAlbum() +
					" ���̴� : " + searchIdolGroupVO.getGeneration());
			//�޼ҵ忡 ���޵� �Ķ���� ������ �̸����� ������
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
					System.out.println("�׷�� : " + searchIdolGroupVOArray[i].getName() + 
							"�Ҽӻ� : " + searchIdolGroupVOArray[i].getCompany() + 
							"�ٹ� : " + searchIdolGroupVOArray[i].getAlbum() +
							"���̴� : " + searchIdolGroupVOArray[i].getGeneration());
				}
			}
		}
	}

