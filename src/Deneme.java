import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Deneme {
    public static void main(String[] args) {
        InwokeBrowser2 myBrowser = new InwokeBrowser2();
        WebDriver driver = myBrowser.invokeBrowser();
        driver.get("https://jqueryui.com/droppable/");


    }
}
