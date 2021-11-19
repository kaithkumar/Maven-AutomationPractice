package testData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileReaderClass {
public static Properties p;
   public FileReaderClass() throws IOException
	{
		File f= new File("C:\\Users\\91888\\eclipse-workspace\\AutomationPractice\\src\\main\\java\\testData\\TestData.properties");
		FileInputStream fis = new FileInputStream(f);
		p= new Properties();
		p.load(fis);
	}
   

public String getUrl() {
	// TODO Auto-generated method stub
   String url = p.getProperty("url");
   return url;
}


public String getUserName() {
	// TODO Auto-generated method stub
	String email = p.getProperty("email");
	return email;
}

public String getpassword() {
	// TODO Auto-generated method stub
String password = p.getProperty("password");
return password;
}

}
