package vo;

public class SearchVO {
	private String searchCondition; //�˻�����
	private String searchValue; //�˻���
	
	public SearchVO(String searchCondition, String searchValue) { 
		//�ս��� ��ü�� �ʱ�ȭ�ϰ� ����
		this.searchCondition = searchCondition;
		this.searchValue = searchValue;
	}
	public String getSearchCondition() {
		return searchCondition;
	}
	public void setSearchCondition(String searchCondition) {
		this.searchCondition = searchCondition;
	}
	public String getSearchValue() {
		return searchValue;
	}
	public void setSearchValue(String searchValue) {
		this.searchValue = searchValue;
	}
}
