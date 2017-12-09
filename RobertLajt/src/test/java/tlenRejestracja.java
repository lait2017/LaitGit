import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class tlenRejestracja {



    static WebDriver driver;

    @BeforeClass
    public static void beforeClass() {
        ChromeDriverManager.getInstance().setup();

    }

    @Before
    public void beforeTest() {
        driver = new ChromeDriver();
        driver.get("https://profil.tlen.pl/rejestracja/");
    }

    @After
    public void afterTest() {
        driver.close();
    }

    @Test
    public void
    sprawdzeniePolaImie() {

        WebElement imieLabel = driver.findElement(By.xpath("//label[contains(@for, 'firstName')]"));
        WebElement imieInput = driver.findElement(By.id("firstName"));

      List <WebElement> imieError = driver.findElements(By.xpath("//label[contains(@for," +
                " 'firstName')]/../div/ul"));


    assertEquals("Labelka Imie ","Imię",imieLabel.getText());
    assertTrue("imie Input jest nie puste",imieInput.getAttribute("value").isEmpty());
    assertTrue("Error label shoud be not visibe",imieError.isEmpty());

    imieInput.sendKeys("Test");
        assertTrue("imie Input jest nie puste",imieInput.getAttribute("value").contains("Test"));

    }

}
