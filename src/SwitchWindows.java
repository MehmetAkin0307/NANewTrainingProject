import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SwitchWindows {
    public static void main(String[] args) {
        InwokeBrowser2 myBrowser=new InwokeBrowser2();
        WebDriver driver=myBrowser.invokeBrowser();
        driver.get("http://accounts.google.com/signup");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[text()='Terms']")).click();

        Set<String> id=driver.getWindowHandles();
        Iterator<String> myWin=id.iterator();
        String parent=myWin.next();
        String child=myWin.next();

        driver.switchTo().window(parent);
        System.out.println("parent"+driver.getTitle());
        driver.switchTo().window(child);
        System.out.println("child"+driver.getTitle());

    }
}
