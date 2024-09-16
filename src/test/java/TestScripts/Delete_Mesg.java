package TestScripts;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Baseclass.BaseClass;
import com.crm.Baseclass.Random_Num;
import com.crm.pom.Pric;
@Listeners(com.crm.Listeners.Delete_Locked_mesg.class)
public class Delete_Mesg extends BaseClass{
	@Test
	public void delete_mesg() throws IOException, InterruptedException
	{
		preCondition();
		login();
     	Pric p=new Pric(driver);
	
		Thread.sleep(8000);
		p.locked.click();
		Thread.sleep(4000);
		p.create.click();
		int no = Random_Num.random(); 
		String s = String.valueOf(no);
		p.amount.sendKeys(s);
		p.visible_Mesg.sendKeys("Krutika");
 	    p.preminumContent.sendKeys("1234");
		p.submit.click();
		p.delete_icon.click();
		Thread.sleep(6000);
		driver.navigate().refresh();
		p.Home.click();
}
}
