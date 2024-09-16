package TestScripts;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Baseclass.BaseClass;
import com.crm.Baseclass.Random_Num;
import com.crm.pom.Pric;
@Listeners(com.crm.Listeners.Edit_Existing_locked_Mesg.class)
public class Edit_locked_mesg extends BaseClass {
	@Test
	public void edit_mesg() throws IOException, InterruptedException
	{
		preCondition();
		login();
     	Pric p=new Pric(driver);
		//JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(8000);
		p.locked.click();
		Thread.sleep(4000);
		p.create.click();
		int no = Random_Num.random(); 
		String s = String.valueOf(no);
		p.amount.sendKeys(s);
		p.visible_Mesg.sendKeys("Manji");
 	    p.preminumContent.sendKeys("124");
		p.submit.click();
       p.edit.click();
       p.visible_Mesg.clear();
       p.visible_Mesg.sendKeys("hioejns");
       p.submit.click();
       p.Home.click();
}
}