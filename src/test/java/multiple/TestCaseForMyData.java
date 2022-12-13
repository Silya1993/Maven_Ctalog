package multiple;

import org.testng.annotations.Test;

public class TestCaseForMyData {

	@Test(dataProviderClass = DataProviderHolder.class, dataProvider = "getData")
	public void launchBrowser(String username, String password, int rolNumber, String Browser) {

	}

	@Test(dataProviderClass = DataProviderHolder.class, dataProvider = "getData")
	public void login(String username, String password, int rolNumber, String Browser) {

	}

	@Test(dataProviderClass = DataProviderHolder.class, dataProvider = "getData")
	public void logout(String username, String password, int rolNumber, String Browser) {

	}

}
