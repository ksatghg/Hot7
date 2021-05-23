package real;

import java.io.*;

public class FileCreate extends UpdateClass {
	
	
	
	public void saveFile() throws Exception{
		FileOutputStream fos = new FileOutputStream("C:/Temp/test1.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		
		oos.flush();
		oos.close();
		
		

	   
	
	}
	
	
}
