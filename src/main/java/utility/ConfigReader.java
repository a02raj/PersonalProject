package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	private Properties prop;

	/*
	 * This method is used to load the propertise from config.properties file it
	 * returns properties pro object
	 */
	public Properties init_Prop() {
		prop = new Properties();
		try {
			FileInputStream input = new FileInputStream("./src/test/resources/Config/config.properties");
			prop.load(input);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
}
