import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class WebDriverSetup {
public  static WebDriver driver;

    public WebDriverSetup(){
        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();
        PageFactory.initElements(driver, this);

}
public static void openUrl(String urlToOpen){
    driver.get(urlToOpen);
    }
}