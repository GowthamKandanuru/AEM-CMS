package Config;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFile {

private  Properties props;
	
	public PropertyFile()
	{
		props = new Properties();
		FileInputStream input;
		try {
			input = new FileInputStream("C:\\Users\\hp\\Desktop\\Clones\\AEM-CMS\\aem\\Resources\\Config.properties");
			props.load(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getDriver()
	{
		return props.getProperty("driver");
	}
	public String getDriverPath()
	{
		return props.getProperty("driverPath");
	}
	public String getUrl()
	{
		return props.getProperty("Url");
	}
}
