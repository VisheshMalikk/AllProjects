package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SomeReusableMethods {

	public boolean waitForElementToBeClickableBool(WebDriver driver, By attributeValue, int waitTime) {
		boolean flag = false;
		try {
			new WebDriverWait(driver, waitTime).ignoring(StaleElementReferenceException.class)
					.until(ExpectedConditions.elementToBeClickable(attributeValue));
			flag = true;
			return flag;

		} catch (Exception Ex) {
			return flag;
		}
	}

	public boolean waitForAlertPresent(WebDriver driver, int waitTime) {
		boolean flag = false;
		new WebDriverWait(driver, waitTime).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.alertIsPresent());
		try {
			driver.switchTo().alert();
			return flag = true;
		} catch (Exception Ex) {
			return flag;
		}
	}

	public boolean waitForElementToBeVisible(WebDriver driver, By attributeValue, int waitTime) {
		boolean flag = false;
		try {
			new WebDriverWait(driver, waitTime).ignoring(StaleElementReferenceException.class)
					.until(ExpectedConditions.visibilityOfElementLocated(attributeValue));
			flag = true;
			return flag;
		} catch (Exception Ex) {
			return flag;

		}
	}

	public void switchToFrame(WebDriver driver, By attributeValue) {
		try {
			if (waitForElementToBePresentBool(driver, attributeValue, maxTimeout)) {
				// String iframe = driver.findElement(attributeValue);
				// driver.switchTo().frame(iframe);
				System.out.println("Switched to frame");
			} else {
				System.out.println("Frame not found");
			}
		} catch (Exception Ex) {
			System.out.println("Exception occured");
		}
	}

	public void MouseClickActionMoveToElement(WebDriver driver, By attributeValue) {
		try {
			if
			//The below method is defined above
			(waitForElementToBeClickableBool(driver, attributeValue, maxTimeout)) {
				WebElement element = driver.findElement(attributeValue);
				// element.click();
				Actions builder = new Actions(driver);
				builder.moveToElement(element).click().build().perform();
				System.out.println("Able to locate and click to element !");

			} else {
				System.out.println("Not able to locate the element !");
			}
		} catch (Exception Ex) {
			System.out.println("Exception occured");
		}
	}
}