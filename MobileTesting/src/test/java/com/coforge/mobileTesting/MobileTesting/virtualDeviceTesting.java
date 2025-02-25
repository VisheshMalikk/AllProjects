package com.coforge.mobileTesting.MobileTesting;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class virtualDeviceTesting {

	@Test
	public void fnVerifyMobileClock() throws IOException, InterruptedException {
		AppiumDriver<MobileElement> driver;
		String appiumServer = "http://127.0.0.1:4723/wd/hub";
		DesiredCapabilities cap = new DesiredCapabilities();
		
		//cap.setCapability("automationName", "UiAutomator2");

		cap.setCapability("udid", "emulator-5554"); // adb
		// cap.setCapability("platformName", "Android");

		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "28");

		// adb shell dumpsys window | find "mCurrentFocus"

		cap.setCapability("appPackage", "com.android.calculator2");
		cap.setCapability("appActivity", "com.android.calculator2.Calculator");

		driver = new AppiumDriver<MobileElement>(new URL(appiumServer), cap);
		
		Thread.sleep(5000);
		
		
		
	}

}
