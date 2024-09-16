package TestScripts;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Baseclass.BaseClass;
import com.crm.Baseclass.Random_Num;
import com.crm.pom.Pric;
@Listeners(com.crm.Listeners.CreateNewLockedmsg.class)

public class CreateNewLockedmsg extends BaseClass{
	
	@Test
	public void create_mesg() throws IOException, InterruptedException
	{
//		preCondition();
//		login();
     	Pric p=new Pric(driver);
		Thread.sleep(8000);
		p.locked.click();
		Thread.sleep(4000);
		p.create.click();
		int no = Random_Num.random(); 
		String s = String.valueOf(no);
		p.amount.sendKeys(s);
		p.visible_Mesg.sendKeys("Manjiri");
 	    p.preminumContent.sendKeys("1234");
		p.submit.click();
		p.Home.click();
		
		

		
	}

}
