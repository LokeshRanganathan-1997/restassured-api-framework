package ProgramPractise;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

//import org.etsi.uri.x01903.v13.ResponderIDType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrokenLinks {

	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.setAcceptInsecureCerts(true);
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("www.google.com");
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		int brokenCount = 0;
		for(WebElement links:elements) {
			String attribute = links.getAttribute("href");
			if(attribute==null||attribute.isEmpty()) continue;

			try {
				URL url=new URL(attribute);
				HttpURLConnection conn=(HttpURLConnection) url.openConnection();
				conn.setRequestMethod("GET");
				conn.connect();
				int responseCode = conn.getResponseCode();
				if(responseCode>=400) {
					System.out.println("Count of Link is"+url+responseCode);
					brokenCount++;

				}else {

					System.out.println("Count working of link is"+url+responseCode);
				}
			}catch(Exception e) {
				System.out.println("Broken link is "+e.getMessage());
				brokenCount++;
			}

		}		
		System.out.println("Total count of broken links is"+brokenCount);
		driver.quit();
	}
}
