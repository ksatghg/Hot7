package sec01.exam07;

public class SystemTimeExample {

	public static void main(String[] args) {
		//���۽ð�
		long time1= System.nanoTime();
		
		int sum = 0;
		for(int i = 1; i<=1000000; i++) {
			sum += i;
		}
				
		
		//���ð�
		long time2= System.nanoTime();
		
		System.out.println("1~1000000������ �� " + sum);
		System.out.println("����� "+ (time2 - time1) +"�����ʸ�ŭ �ɷȽ��ϴ�.");
		
		
	}

}
