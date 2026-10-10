package cars;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Motor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.linkedin.com/in/madhu-yaragudi-28a75929");
		Thread.sleep(3000);
		String name = driver.getTitle();

		System.out.println("titel of the page : " + name);

		System.out.println(driver.getCurrentUrl());

		System.out.println(driver.getWindowHandle());

		driver.switchTo().newWindow(WindowType.TAB);

		Set<String> handles = driver.getWindowHandles();

		Iterator<String> it = handles.iterator();

		String parentWindow = it.next();
		String childWindow = it.next();

		driver.switchTo().window(childWindow);

		driver.get("https://www.instagram.com/");

		Thread.sleep(5000);

		driver.close();

		Thread.sleep(2000);

		driver.quit();

	}

}
