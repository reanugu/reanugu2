package fns.gov.service;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import fns.gov.util.FNSAutomationConstants;

public class IEBrowserUtil extends BaseBrowserUtil {
	
	public static void setSystemProperty() {
		System.setProperty(FNSAutomationConstants.IE_DRIVER_KEY, FNSAutomationConstants.IE_11_PATH);		
	}
	
	public static WebDriver getIEDriver() {		
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();		
        caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
            true);
        return new InternetExplorerDriver(caps);
	}
}
