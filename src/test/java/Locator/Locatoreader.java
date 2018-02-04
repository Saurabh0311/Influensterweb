package Locator;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;


public class Locatoreader {

	private Document doc;
	
	public Locatoreader(String xmlName) {
		SAXReader reader = new SAXReader();
		try {
			String localPath = System.getProperty("user.dir");
			localPath = localPath+"//src//test//java//Locator//";			
			doc = reader.read(localPath+xmlName);
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
	
	public String getLocator(String locator){
		return doc.selectSingleNode("//" + locator.replace('.', '/')).getText();
		
	}
}