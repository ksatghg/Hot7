package sec01.exam07;

public class SystemTimeExample {

	public static void main(String[] args) {
		//시작시간
		long time1= System.nanoTime();
		
		int sum = 0;
		for(int i = 1; i<=1000000; i++) {
			sum += i;
		}
				
		
		//끝시간
		long time2= System.nanoTime();
		
		System.out.println("1~1000000까지의 합 " + sum);
		System.out.println("계산이 "+ (time2 - time1) +"나노초만큼 걸렸습니다.");
		
		
	}

}
