package Scripts;

import org.testng.annotations.Test;

import Util.Drivertestcase;

public class TC_001_Login extends Drivertestcase {
	
	
	@Test
	
	public void login() throws Exception{
		
		//String username= propertyreader.readPropertyFile("TestUser");
		//String password= propertyreader.readPropertyFile("Password");
		 
		Loginpagehelper.clickonagree();
		Thread.sleep(3000);
	Loginpagehelper.Login();
	//Loginpagehelper.logout();
	
	Loginpagehelper.productsearch();
	Loginpagehelper.Askquestion();
	}

}
