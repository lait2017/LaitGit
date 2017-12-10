import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TlenRegisterPage extends WebDriverSetup {

    @FindBy(xpath="//label[contains(@for, 'firstName')]")
    private WebElement imieLabel;

    public WebElement getImieLabel() {
        return imieLabel;
    }
//WebElement imieLabel = driver.findElement(By.xpath("//label[contains(@for, 'firstName')]"));
}
