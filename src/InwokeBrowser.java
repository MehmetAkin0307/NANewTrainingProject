import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class InwokeBrowser {
    public WebDriver invokeBrowser(){
        DesiredCapabilities dc=new DesiredCapabilities();
        //dc.acceptInsecureCerts();
      //  dc.setCapability(Capabilities.);
        ChromeOptions co=new ChromeOptions();
        co.merge(dc);
        System.setProperty("webdriver.chrome.driver", "/Users/mehmetakin/Downloads/chromedriver");
        WebDriver mehmet = new ChromeDriver();
        return mehmet;
    }
}
