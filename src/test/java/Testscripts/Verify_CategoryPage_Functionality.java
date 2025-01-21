package Testscripts;

import org.testng.annotations.Test;

import Pages.CategoryPage;
import utility.Base;

public class Verify_CategoryPage_Functionality extends Base
{
	@Test
  public void verify_Functiobality()throws Exception
  {
	 Base.setUp();
	 CategoryPage.Verify_pagination();
	 CategoryPage.Readmore_Readless();
	 CategoryPage.Verify_sortedBy();
	 CategoryPage.filtered();
	 Base.tearDown();
  }
}
