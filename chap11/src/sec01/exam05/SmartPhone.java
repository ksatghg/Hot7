package sec01.exam05;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String comapny, String os) {
		this.company = comapny;
		this.os = os;
	}
	
	@Override
	public String toString() {
		return company + "," +os;
	}
	
}
