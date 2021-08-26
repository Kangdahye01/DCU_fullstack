package service; //service ��Ű��
//SpringFrameWork���� ���
//����Ͻ� ���� ����
//�޸𸮿� �迭��ü�� �����, �迭��ü�� CRUD�۾��� ����
//CRUD��? Create,Read,Update,Delete�۾�
//IdolGroupVO�� IdolGroupService�� ��ȣ���� ���
//IdolGroupVO�� �迭�� ���


import vo.IdolGroupVO; //IdolGroupVO��(�ٸ� ��Ű��)import

public class IdolGroupService { //Ŭ������ ����
	private IdolGroupVO[] idolGroupList;	//���������� ���� Ŭ���������� ����
	//IdolGroup�̶�� �̸����� ���ο� �迭 ����

	public IdolGroupService() { //�޼ҵ带 ����
		// TODO Auto-generated constructor stub
		idolGroupList = new IdolGroupVO[0]; //���ο� �迭�� ����

	}

	public boolean registNewIdolGroupVO(IdolGroupVO newIdolGroupVO) {
		//IdolGroup����Ͽ� �迭�� �ű� ���
		// TODO Auto-generated method stub
		boolean registerSuccess = true; //���������� ����Ѵٸ�
		for (int i = 0; i < idolGroupList.length; i++) { //�ݺ����� ����ؼ� �迭�� ���̸� �÷���
			if(idolGroupList[i].getName().contentEquals(newIdolGroupVO.getName())) {
				//���࿡ �迭�ȿ� �ִ� �̸��� �����߰��Ϸ��� �̸��� �Ȱ��ٸ�
				registerSuccess = false; //����
				break;//�ݺ��� Ż��
			}	
		}

		if(registerSuccess) { //���� ��Ͽ� �����Ѵٸ�
			IdolGroupVO[] tempArray = idolGroupList; //�ӽù迭�� ���
			idolGroupList = new IdolGroupVO[tempArray.length + 1]; 
			//�߰��Ǹ� ������ �ִ� �迭�� ���̸� 1 �߰�
			//��� �߰��Ǹ� ũ�Ⱑ Ŀ��

			for (int i = 0; i < tempArray.length; i++) { //�ݺ�
				idolGroupList[i] = tempArray[i]; //������ ����Ʈ�� �ӽ÷� ���� �迭 �߰�
			}

			idolGroupList[idolGroupList.length - 1] = newIdolGroupVO; //���̸� 1 ���ҽ�Ű�� ���ο� VO�� ���
		}
		return registerSuccess; //�������� ��ȯ����
	}

	public IdolGroupVO[] getIdolGroupList() { //�޼ҵ带 ���� ����
		// TODO Auto-generated method stub
		return idolGroupList;
	}
	public IdolGroupVO getDetailIdolGroupVO(String name) {
		IdolGroupVO idolGroupVO = null; //��ã���� �ʱⰪ null ����
		for (int i = 0; i < idolGroupList.length; i++) { //�ݺ����� ����ؼ� �迭�� ���̸� �÷���
			if(idolGroupList[i].getName().contentEquals(name)) {
				//���࿡ �迭�ȿ� �ִ� �̸��� �˻��Ϸ��� �̸��� �Ȱ��ٸ�
				idolGroupVO = idolGroupList[i]; //ã�Ƴ����� ����
				break;//�ݺ��� Ż��
			}	
		}
		return idolGroupVO;//�����Ѱ��� ����
	}

	public IdolGroupVO getoldIdolGroupVO(String name) {
		IdolGroupVO idolGroupVO = null; //��ã���� �ʱⰪ null ����
		for (int i = 0; i < idolGroupList.length; i++) { //�ݺ����� ����ؼ� �迭�� ���̸� �÷���
			if(idolGroupList[i].getName().contentEquals(name)) {
				//���࿡ �迭�ȿ� �ִ� �̸��� �˻��Ϸ��� �̸��� �Ȱ��ٸ�
				idolGroupVO = idolGroupList[i]; //ã�Ƴ����� ����
				break;//�ݺ��� Ż��
			}	
		}
		return idolGroupVO;	
	}

	public boolean modifyIdolGroupVO(IdolGroupVO newIdolGroupVO) {
		// TODO Auto-generated method stub
		//�����۾��ϴ� �޼ҵ�
		boolean modifySuccess = false;
		//1. ���� �迭���� ���ڷ� �Ѿ�� idolGroupVO ��ü(������ ������ ������ �ִ� ��ü)
		//�� name �Ӽ����� ������ name �Ӽ����� ������ �ִ� idolGroupVO��ü�� ã��

		for (int i = 0; i < idolGroupList.length; i++) { //�̸��� ã�� ���� �ݺ�
			if(idolGroupList[i].getName().contentEquals(newIdolGroupVO.getName())){
				//���࿡ �迭�� �ִ� ���� �̸��� �����ϰ����ϴ� �̸��� ���ٸ�
				//2. �ش� index������ �����ϴ� ��ü�� ���ڷ� �Ѿ�� ���ο� ��ü�� ��ġ������ ����
				idolGroupList[i] = newIdolGroupVO; //��������
				modifySuccess = true; //�����ߴٸ�
				break;//�ݺ��� Ż��
			}
		}
		return modifySuccess; //������ ������ ����
	}

	public boolean removeIdolGroupVO(String name) {
		boolean removeSuccess = false;
		//������ IdolGroupVO ��ü�� �����ϰ� �ִ� �迭�� index �˻�

		//�迭�� index���� ���ϴ� ���������� index���� �����ϴ� ������ �ʱⰪ��
		//-1�� �����ϴ°��� ����
		int index = -1;
		for (int i = 0; i < idolGroupList.length; i++) { //�ݺ��ϸ� ������ ����� ã��
			if(idolGroupList[i].getName().contentEquals(name)) {
				//���� ������ ���� �����;��� �̸��� ���ٸ�
				index = i;
				break;
			}
		}
		if(index != -1) { //index�� -1�� �ƴϸ�
			IdolGroupVO[] tempArray = idolGroupList; //tempArray�� ������ ���� ���
			idolGroupList = new IdolGroupVO[tempArray.length-1];
			for (int i = 0; i<tempArray.length;i++) {
				if(i < index) {
					idolGroupList[i] = tempArray[i];
				}
				else if(i > index) {
					idolGroupList[i-1] = tempArray[i];
				}
			}
			//���ο� �迭 ��ü ���� (���� ũ���� �迭���� 1���� ��ü)
			removeSuccess = true; //���� ����
		}
		//�޼ҵ� �ȿ��� ������ ������ ���ú���(��������)
		//Ŭ���� �ȿ��� ������ ������ �������
		//���⼭�� tempArray�� ���ú���
		//���ú����� heap ������ ���� �ʰ� �޸𸮿� �ݳ�
		return removeSuccess;
	}

	public IdolGroupVO searchIdolGroupVOByName(String name) {
		IdolGroupVO idolGroupVO = null; //��ã���� �ʱⰪ null ����
		for (int i = 0; i < idolGroupList.length; i++) { //�ݺ����� ����ؼ� �迭�� ���̸� �÷���
			if(idolGroupList[i].getName().contentEquals(name)) {
				//���࿡ �迭�ȿ� �ִ� �̸��� �˻��Ϸ��� �̸��� �Ȱ��ٸ�
				idolGroupVO = idolGroupList[i]; //ã�Ƴ����� ����
				break;//�ݺ��� Ż��
			}
		}
		return idolGroupVO;
	}

	public IdolGroupVO[] searchIdolGroupVOArrayByGeneration(String generation) {
		// TODO Auto-generated method stub
		//��ȯ�Ǵ� �迭�� ũ�Ⱑ �پ�
		//----> �˻��� IdolGroupVO�� ������ ���� ��ȯ�� �迭�� ũ�⸦ �����ؾ� ��
		IdolGroupVO[] searchArray = null; //���ο� �迭 ����
		int count = 0;// �迭������0���� �ʱ�ȭ
		//�˻� ���ǿ� �¾Ƽ� ã���� IdolGroupVO ��ü ���� ������ �迭 ����
		IdolGroupVO[] tempArray = new IdolGroupVO[idolGroupList.length];
		
		//idolGroupList �迭���� ���ǿ� �´� IdolGroupVO ��ü���� ã�Ƽ�
		//tempArray�� �����ϴ� �۾�
		for (int i = 0; i < idolGroupList.length; i++) {
			if(idolGroupList[i].getGeneration() == Integer.parseInt(generation)) {
				tempArray[count++] = idolGroupList[i];
				//�迭�� ������� �˻�
			}
		}
		searchArray = new IdolGroupVO[count];
		
		for (int i = 0; i < count; i++) {
			searchArray[i] = tempArray[i];
		}
		
		return searchArray;
	}
}

