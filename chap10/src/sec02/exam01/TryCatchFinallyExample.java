package sec02.exam01;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		
		/*String str = null;
		System.out.println(str.length());
		*/
		try {
			Class clazz = Class.forName("java.lang.String2");
			System.out.println("���� ������");
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
		
	}

}
