import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TlenRegisterPage extends WebDriverSetup {

    private static final String IMIE_LABEL_XPATH = "//label[contains(@for, 'firstName')]";
    private static final String IMIE_INPUT_ID = "firstName";
    private static final String IMIE_ERROR_LABEL_XPATH = "//label[contains(@for," +
            " 'firstName')]/../div/ul";
    private static final String WOMAN_RADIO_BUTTON_XPATH  =("//input[contains(@id, 'female')]");
    private static final String WOMAN_LABEL_XPAH =("//input[contains(@id, 'female')]/..");
    private static final String MAN_RADIO_BUTTON_XPATH =("//input[@id='male']");
    private static final String MAN_LABEL_XPATH =("//input[@id='male']/..");


    @FindBy(xpath = WOMAN_RADIO_BUTTON_XPATH)
    WebElement womanRadioButton;


    @FindBy(xpath = WOMAN_LABEL_XPAH)

    WebElement womanLabel;

    @FindBy(xpath = MAN_RADIO_BUTTON_XPATH)
    WebElement manRadioButton;

    @FindBy(xpath = MAN_LABEL_XPATH)
    WebElement manLabel;

    @FindBy(xpath=IMIE_LABEL_XPATH)
    private WebElement imieLabel;

    @FindBy(id=IMIE_INPUT_ID)
    private WebElement imieInput;

    @FindBy(xpath = IMIE_ERROR_LABEL_XPATH)
    private  List<WebElement> imieErrorsList;
    
    public WebElement getImieInput() {
        return imieInput;
    }

    public List<WebElement> getImieErrorsList() {
        return imieErrorsList;
    }

    public WebElement getImieLabel() {
        return imieLabel;
    }

    public WebElement getWomanRadioButton() {
        return womanRadioButton;
    }

    public WebElement getWomanLabel() {
        return womanLabel;
    }

    public WebElement getManRadioButton() {
        return manRadioButton;
    }

    public WebElement getManLabel() {
        return manLabel;
    }
//WebElement imieLabel = driver.findElement(By.xpath("//label[contains(@for, 'firstName')]"));
}
