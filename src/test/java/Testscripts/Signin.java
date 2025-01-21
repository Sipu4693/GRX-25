package Testscripts;

import org.testng.annotations.Test;

import Pages.Login;
import utility.Base;

public class Signin extends Base
{

	@Test
	public void SignIn()
	{
	 Base.setUp();
	 Login.signIn("sipu.nayak@moretasks.com","Admin@1234");
	 Login.signout();
	 Base.tearDown();
	}
}

