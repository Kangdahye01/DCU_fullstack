package service;

import ui.IdolGroupUI;
import vo.IdolGroupVO;

public class IdolGroupService {

   public boolean registIdolGroupVO(IdolGroupVO newIdolGroupVO) {
      // TODO Auto-generated method stub
      boolean registSuccess = true;
      for (int i = 0; i < IdolGroupUI.idolGroupArray.length; i++) {
         if(IdolGroupUI.idolGroupArray[i].getName().contentEquals(newIdolGroupVO.getName())) {
            registSuccess = false;
            break;
         }
      }
      if(registSuccess) {
         IdolGroupVO[] tempArray = IdolGroupUI.idolGroupArray;
         IdolGroupUI.idolGroupArray = new IdolGroupVO[tempArray.length + 1];
         
         for (int i = 0; i < tempArray.length; i++) {
            IdolGroupUI.idolGroupArray[i] = tempArray[i];
         }
         
         IdolGroupUI.idolGroupArray[IdolGroupUI.idolGroupArray.length - 1] = newIdolGroupVO;
      }
      return registSuccess;
   }
	public IdolGroupVO[] getIdolGroupList() { //�޼ҵ带 ���� ����
		// TODO Auto-generated method stub
		return IdolGroupUI.idolGroupArray;
	}
	public IdolGroupVO getDetailIdolGroupVO(String name) {
		IdolGroupVO idolGroupVO = null; //��ã���� �ʱⰪ null ����
		for (int i = 0; i < IdolGroupUI.idolGroupArray.length; i++) { //�ݺ����� ����ؼ� �迭�� ���̸� �÷���
			if(IdolGroupUI.idolGroupArray[i].getName().contentEquals(name)) {
				//���࿡ �迭�ȿ� �ִ� �̸��� �˻��Ϸ��� �̸��� �Ȱ��ٸ�
				idolGroupVO = IdolGroupUI.idolGroupArray[i]; //ã�Ƴ����� ����
				break;//�ݺ��� Ż��
			}	
		}
		return idolGroupVO;//�����Ѱ��� ����
	}
	public IdolGroupVO getoldIdolGroupVO(String name) {
		IdolGroupVO idolGroupVO = null; //��ã���� �ʱⰪ null ����
		for (int i = 0; i < IdolGroupUI.idolGroupArray.length; i++) { //�ݺ����� ����ؼ� �迭�� ���̸� �÷���
			if(IdolGroupUI.idolGroupArray[i].getName().contentEquals(name)) {
				//���࿡ �迭�ȿ� �ִ� �̸��� �˻��Ϸ��� �̸��� �Ȱ��ٸ�
				idolGroupVO = IdolGroupUI.idolGroupArray[i]; //ã�Ƴ����� ����
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

		for (int i = 0; i < IdolGroupUI.idolGroupArray.length; i++) { //�̸��� ã�� ���� �ݺ�
			if(IdolGroupUI.idolGroupArray[i].getName().contentEquals(newIdolGroupVO.getName())){
				//���࿡ �迭�� �ִ� ���� �̸��� �����ϰ����ϴ� �̸��� ���ٸ�
				//2. �ش� index������ �����ϴ� ��ü�� ���ڷ� �Ѿ�� ���ο� ��ü�� ��ġ������ ����
				IdolGroupUI.idolGroupArray[i] = newIdolGroupVO; //��������
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
		for (int i = 0; i < IdolGroupUI.idolGroupArray.length; i++) { //�ݺ��ϸ� ������ ����� ã��
			if(IdolGroupUI.idolGroupArray[i].getName().contentEquals(name)) {
				//���� ������ ���� �����;��� �̸��� ���ٸ�
				index = i;
				break;
			}
		}
		if(index != -1) { //index�� -1�� �ƴϸ�
			IdolGroupVO[] tempArray = IdolGroupUI.idolGroupArray; //tempArray�� ������ ���� ���
			IdolGroupUI.idolGroupArray = new IdolGroupVO[tempArray.length-1];
			for (int i = 0; i<tempArray.length;i++) {
				if(i < index) {
					IdolGroupUI.idolGroupArray[i] = tempArray[i];
				}
				else if(i > index) {
					IdolGroupUI.idolGroupArray[i-1] = tempArray[i];
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
	public IdolGroupVO searchidolGroupVOByName(String name) {
		IdolGroupVO idolGroupVO = null; //��ã���� �ʱⰪ null ����
		for (int i = 0; i < IdolGroupUI.idolGroupArray.length; i++) { //�ݺ����� ����ؼ� �迭�� ���̸� �÷���
			if(IdolGroupUI.idolGroupArray[i].getName().contentEquals(name)) {
				//���࿡ �迭�ȿ� �ִ� �̸��� �˻��Ϸ��� �̸��� �Ȱ��ٸ�
				idolGroupVO = IdolGroupUI.idolGroupArray[i]; //ã�Ƴ����� ����
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
		IdolGroupVO[] tempArray = new IdolGroupVO[IdolGroupUI.idolGroupArray.length];
		
		//IdolGroupUI.idolGroupArray �迭���� ���ǿ� �´� IdolGroupVO ��ü���� ã�Ƽ�
		//tempArray�� �����ϴ� �۾�
		for (int i = 0; i < IdolGroupUI.idolGroupArray.length; i++) {
			if(IdolGroupUI.idolGroupArray[i].getGeneration() == Integer.parseInt(generation)) {
				tempArray[count++] = IdolGroupUI.idolGroupArray[i];
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


	