package sec01.exam04;

public class Outter {
	public void method1(int arg) {
		int localVariable = 1;
		
		//arg = 100;
		//localVariable = 100;
		
		class inner {
			void method() {
				int result = arg + localVariable;
				
				
		}
	}
}
}