package MyData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class proper {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub


		FileReader fr = new FileReader("C:\\Users\\DELL\\eclipse-workspace\\Isckon\\src\\test\\java\\MyData\\Data");		
		Properties p = new Properties();
		p.load(fr);
		
	}

}


