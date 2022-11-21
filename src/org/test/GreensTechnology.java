package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechnology {
	public static void main(String[] args) {
		System.setProperty("wedriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Task1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
	}

}
