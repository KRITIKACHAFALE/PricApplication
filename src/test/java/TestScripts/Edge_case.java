package TestScripts;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Baseclass.BaseClass;
import com.crm.Baseclass.Random_Num;
import com.crm.pom.Pric;
@Listeners(com.crm.Listeners.Edge_case_and_Error_Handling.class)

public class Edge_case extends BaseClass{

	@Test
	public void edit_mesg() throws IOException, InterruptedException
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
		p.visible_Mesg.sendKeys("krutika");
 	    p.preminumContent.sendKeys("124");
		p.submit.click();
		Thread.sleep(3000);
		assertTrue(p.price.getText().contains(s),"It is verify");
		p.Home.click();
      
}}

