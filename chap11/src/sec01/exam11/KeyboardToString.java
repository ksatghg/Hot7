package sec01.exam11;



public class KeyboardToString {

	public static void main(String[] args) throws Exception {

		byte[] bytes = new byte[100];
		
		System.out.print("ют╥б: ");
		int readByteNo = System.in.read(bytes);
		
		String str = new String(bytes, 1, readByteNo-2);
		System.out.println(str);
	}

}
