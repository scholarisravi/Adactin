package org.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public static WebDriver driver;

	public void launchbrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public void loadurl(String url) {
		driver.get(url);
	}

	public void fill(WebElement element, String text) {
		element.sendKeys(text);

	}

	public void click(WebElement element) {
		element.click();

	}

	public static void dropdown(WebElement f, String value) {
		Select s = new Select(f);
		s.selectByVisibleText(value);
	}

	public static void bookingNumber(WebElement order, String text) {
		order.getAttribute("value");

	}

	public void closebrowser() {
		driver.quit();
	}

	public void takesnap(String filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\Java Eclipse\\AdactinCucumber\\src\\test\\resources\\Screenshots"+filename+".png");
		FileUtils.copyFile(source, dest);

	}
}
