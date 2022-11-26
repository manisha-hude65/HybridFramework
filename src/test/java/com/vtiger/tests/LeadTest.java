package com.vtiger.tests;

import org.testng.annotations.Test;

import com.vtiger.pages.LeadPage;
import com.vtiger.pages.LoginPage;

public class LeadTest extends BaseTest {
	
	
	@Test
	public void CreateandVerifyLeadwithMandatoryFields_TC03()
	{
		String TCName = "CreateandVerifyLeadwithMandatoryFields_TC03";
		logger = extent.createTest(TCName);	
		LoginPage lp = new LoginPage(driver,logger);
		lp.login(Data.get(TCName).get("Userid"), Data.get(TCName).get("Password"));
		LeadPage ldp = new LeadPage(driver,logger);
		ldp.clickNewLead();
		ldp.CreateLeadwithMandatodaotyFields(Data.get(TCName).get("LastName"), Data.get(TCName).get("Company"));
		ldp.verifyDatawithLabel(Data.get(TCName).get("LabelLastName"), Data.get(TCName).get("LastName"));
		ldp.verifyDatawithLabel(Data.get(TCName).get("LabelCompany"), Data.get(TCName).get("Company"));
		ldp.clickLogout();
		extent.flush();
	}

}
