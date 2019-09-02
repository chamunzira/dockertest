package seleniumchrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class edureka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Chamu Nziradzemhuka\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://192.168.100.13:8080/");
		driver.manage().window().maximize();
		driver.findElement(By.id("About Us")).click();
		String at =driver.getCurrentUrl();
		String et = "http://192.168.100.13:8080/content/about-us.php";
		driver.close();
		if(at.equalsIgnoreCase(et)) {
			System.out.println("Test was Successful");
		}else {
			System.out.println("Test was unsuccessful");
		}

	}

}
