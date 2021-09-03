package vo;

public class IdolGroupVO {
	private String name;  //식별자
	private String gender;
	private int generation;
	private int year;
	private String nation;
	private String album;
	private String company;
	
	//Accessor
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getGeneration() {
		return generation;
	}
	public void setGeneration(int generation) {
		this.generation = generation;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	//자바에서 특정객체가 "+"연산되거나 print 메소드의 인자로 지정되면 
	//해당 객체의 toString() 메소드가 자동으로 호출된다. 
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름 : " + name + ", 국가 : " + nation + ", 소속사 : " + company + ", 성별: " + gender + ", 나이대 : " + generation;
	}
}
