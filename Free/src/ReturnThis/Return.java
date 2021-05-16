package ReturnThis;

public class Return {
	public String name;
	public String color;
	public double weight;
	public int count;
	
	public Return(String name, String color, double weight, int count) {
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.count = count;
	}
	
	public Return getF() {
		return this;
	}

	

}
