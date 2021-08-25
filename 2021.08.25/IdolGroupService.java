package service;

import vo.IdolGroupVO;

public class IdolGroupService {
	private IdolGroupVO[] idolGroupList;
	
	public IdolGroupService() {
		// TODO Auto-generated constructor stub
		idolGroupList = new IdolGroupVO[0];
	}

	public boolean registNewIdolGroupVO(IdolGroupVO newIdolGroupVO) {
		// TODO Auto-generated method stub
		boolean registSuccess = true;
		for (int i = 0; i < idolGroupList.length; i++) {
			if(idolGroupList[i].getName().contentEquals(newIdolGroupVO.getName())) {
				registSuccess = false;
				break;
			}
		}
		if(registSuccess) {
			IdolGroupVO[] tempArray = idolGroupList;
			idolGroupList = new IdolGroupVO[tempArray.length + 1];
			
			for (int i = 0; i < tempArray.length; i++) {
				idolGroupList[i] = tempArray[i];
			}
			
			idolGroupList[idolGroupList.length - 1] = newIdolGroupVO;
		}
		return registSuccess;
	}

	public IdolGroupVO[] getIdolGroupList() {
		// TODO Auto-generated method stub
		
		return idolGroupList;
	}

	public IdolGroupVO getDetailIdolGroupVO(String name) {
		// TODO Auto-generated method stub
		IdolGroupVO idolGroupVO = null;
		for (int i = 0; i < idolGroupList.length; i++) {
			if(idolGroupList[i].getName().contentEquals(name)) {
				idolGroupVO = idolGroupList[i];
				break;
			}
		}
		return idolGroupVO;
	}

	public IdolGroupVO getOldIdolGroupVO(String name) {
		// TODO Auto-generated method stub
		IdolGroupVO idolGroupVO = null;
		for (int i = 0; i < idolGroupList.length; i++) {
			if(idolGroupList[i].getName().contentEquals(name)) {
				idolGroupVO = idolGroupList[i];
				break;
			}
		}
		return idolGroupVO;
	}

	public boolean modifyIdolGroupVO(IdolGroupVO newIdolGroupVO) {
		// TODO Auto-generated method stub
		boolean modifySuccess = false;
		//1. ���� �迭���� ���ڷ� �Ѿ�� idolGropVO��ü(������ ������ ������ �ִ� ��ü)
		//�� name �Ӽ����� ������ name �Ӽ����� ������ �ִ� idolGroupVO ��ü�� ã�´�.
		
		for (int i = 0; i < idolGroupList.length; i++) {
			if(idolGroupList[i].getName().contentEquals
					(newIdolGroupVO.getName())) {
				//2. �ش� �ε��� ������ �����ϴ� ��ü�� ���ڷ� �Ѿ�� ���ο� ��ü��
				//��ġ������ �����Ѵ�.
				idolGroupList[i] = newIdolGroupVO;
				modifySuccess = true;
				break;
				
			}
		}
		return modifySuccess;
	}

	public boolean removeIdolGroupVO(String name) {
		// TODO Auto-generated method stub
		boolean removeSuccess = false;
		//������ IdolGroupVO ��ü�� �����ϰ� �ִ� �迭�� �ε��� �˻�
		
		//�迭�� �ε��� ���� ���ϴ� ���������� �ε������� �����ϴ� ������ �ʱⰪ��
		//-1�� �����ϴ� ���� �����̴�.
		int index = -1;
		for (int i = 0; i < idolGroupList.length; i++) {
			if(idolGroupList[i].getName().contentEquals(name)) {
				index = i;
				break;
			}
		}
		
		if(index != -1) {
			IdolGroupVO[] tempArray = idolGroupList;
			idolGroupList = new IdolGroupVO[tempArray.length - 1];
			
			for (int i = 0; i < tempArray.length; i++) {
				if(i < index) {
					idolGroupList[i] = tempArray[i];
				}
				else if(i > index) {
					idolGroupList[i-1] = tempArray[i];
				}
			}
			removeSuccess = true;
		}
		
		
		return removeSuccess;
	}

	public IdolGroupVO searchIdolGroupVOByName(String name) {
		// TODO Auto-generated method stub
		IdolGroupVO idolGroupVO = null;
		for (int i = 0; i < idolGroupList.length; i++) {
			if(idolGroupList[i].getName().contentEquals(name)) {
				idolGroupVO = idolGroupList[i];
				break;
			}
		}
		return idolGroupVO;
	}

	public IdolGroupVO[] searchIdolGroupVOArrayByGeneration(String generation) {
		// TODO Auto-generated method stub
		//��ȯ�Ǵ� �迭�� ũ�Ⱑ �پ��ϴ�.
		//----> �˻��� IdolGroupVO�� ������ ���� ��ȯ�� �迭�� ũ�⸦ �����ؾ� �Ѵ�.
		IdolGroupVO[] searchArray = null;
		int count = 0;
		
		//�˻����ǿ� �¾Ƽ� ã���� IdolGroupVO��ü���� ������ �迭 ����
		IdolGroupVO[] tempArray = 
				new IdolGroupVO[idolGroupList.length];
		
		//idolGroupList �迭���� ���ǿ� �´� IdolGroupVO ��ü���� ã�Ƽ�
		//tempArray�� ����
		for (int i = 0; i < idolGroupList.length; i++) {
			if(idolGroupList[i].getGeneration() == Integer.parseInt(generation)) {
				tempArray[count++] = idolGroupList[i];
			}
		}

		searchArray = new IdolGroupVO[count];
		
		for (int i = 0; i < count; i++) {
			searchArray[i] = tempArray[i];
		}
		
		return searchArray;
	}
}




