package sec01.exam25;

public class ValueCompareExample {

	public static void main(String[] args) {
		Integer obj1 = 300;
		Integer obj2 = 300;
		
		System.out.println("결과: "+(obj1 == obj2));
		System.out.println("결과: "+(obj1.equals(obj2)));
		
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("결과: "+(obj3 == obj4));
		System.out.println("결과: "+(obj3.equals(obj4)));
		
	}

}
