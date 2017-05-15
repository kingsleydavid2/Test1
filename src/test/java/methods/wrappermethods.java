package methods;

import core.BaseTest;

public class wrappermethods extends BaseTest {
	
	public boolean verifyTitle(String title) {
		// TODO Auto-generated method stub
		
		
		if(driver.getTitle().contains(title))
		{
			System.out.println(" Title contains "+title );
			return true;
		}
		else
		{
			System.out.println("title doesn't contains"+title);
			return false;
		}
	}
	
}
