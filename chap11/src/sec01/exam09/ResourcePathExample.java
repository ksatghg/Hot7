package sec01.exam09;

public class ResourcePathExample {

	public static void main(String[] args) {
		
		Class clazz = ResourcePathExample.class;
		
		String photo1path = clazz.getResource("Photo1.jpg").getPath();
		
		
		
		String photo2path = clazz.getResource("images/Photo2.jpg").getPath();
		
		System.out.println(photo1path);
		System.out.println(photo2path);

	}

}
