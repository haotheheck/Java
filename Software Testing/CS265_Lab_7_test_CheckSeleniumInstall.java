package cs265;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class CheckSeleniumInstall {


	/**
	 * This test will see if we got the Chrome Web Driver installed without any
	 * problems. It will also allow us to check if we got our
	 * jar files and build path correct for Selenium.
	 *
	 * Please read the code below.
	 *  */
	public static void main(String[] args) {

		String URL_TO_TEST = "https://duckduckgo.com/";

		// IMPORTANT
		// You need to have the PATH to your chromedriver.exe here

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\haon9\\Documents\\chromedriver_win32\\chromedriver.exe");

		// we will use the Chrome Driver.
		WebDriver driver1  = new ChromeDriver();

		driver1.get(URL_TO_TEST); // get the driver to load the URL.

		System.out.println("Application title is ============="+driver1.getTitle());

		WebElement search_form_input_homepage = driver1.findElement(By.id("search_form_input_homepage"));

		search_form_input_homepage.clear();

		// Type in your search here... anything to test with.

		search_form_input_homepage.sendKeys("How big is Greenland?");

		// click on the Search button

		WebElement SearchButton = driver1.findElement(By.id("search_button_homepage"));

		SearchButton.click(); // click the search button

		// let's just wait for a few seconds to see the output
		// ignore the Eclipse warning symbol.
		WebDriverWait wait = new WebDriverWait(driver1, 10);

		// close the web browser , close the duckduckgo page.

		driver1.close();

		System.out.println("Test script executed successfully.");

		driver1.quit();

	}

}
