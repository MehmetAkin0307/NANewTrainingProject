import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InwokeBrowser2 {

    public WebDriver invokeBrowser() {

        System.setProperty("webdriver.chrome.driver", "/Users/mehmetakin/Downloads/chromedriver");
        WebDriver mehmet = new ChromeDriver();
        return mehmet;
    }
}