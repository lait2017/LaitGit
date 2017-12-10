import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class tlenRejestracja {
    private TlenRegisterPage tlenRegisterPage;
public tlenRejestracja(){
    tlenRegisterPage = new TlenRegisterPage();

}
    @BeforeClass
    public static void beforeClass() {
        //ChromeDriverManager.getInstance().setup();

    }

    @Before
    public void beforeTest() {
    TlenRegisterPage.openUrl("https://profil.tlen.pl/rejestracja/");
        //driver = new ChromeDriver();
       //WebDriverSetup.driver.get("https://profil.tlen.pl/rejestracja/");
    }

    @After
    public void afterTest() {
      //  driver.close();
    }

   @Test
    public void
    sprawdzeniePolaImie() {

      //  WebElement imieLabel = driver.findElement(By.xpath("//label[contains(@for, 'firstName')]"));
     //   WebElement imieInput = driver.findElement(By.id("firstName"));

     // List <WebElement> imieError = driver.findElements(By.xpath("//label[contains(@for," +
//                " 'firstName')]/../div/ul"));
//
//
   assertEquals("Labelka Imie ","Imię", tlenRegisterPage.getImieLabel().getText());
//    assertTrue("imie Input jest nie puste",imieInput.getAttribute("value").isEmpty());
//    assertTrue("Error label shoud be not visibe",imieError.isEmpty());
//    imieInput.sendKeys("Test");
//        assertTrue("imie Input jest nie puste",imieInput.getAttribute("value").contains("Test"));
//        imieInput.clear();
//        imieLabel.click();
//        imieError = driver.findElements(By.xpath("//label[contains(@for," +
//                " 'firstName')]/../div/ul"));
//        assertEquals("Labelka Error ",
//                "Proszę wpisać poprawne imię.",imieError.get(0).getText());
//    }
//@Test public void manOrWomancheckbox(){
//    WebElement womanRadioButton = driver.findElement(By.xpath("//input[contains(@id, 'female')]"));
//    WebElement womanLabel = driver.findElement(By.xpath("//input[contains(@id, 'female')]/.."));
//    WebElement manRadioButton = driver.findElement(By.xpath("//input[contains(@id, 'male')]"));
//    WebElement manLabel = driver.findElement(By.xpath("//input[contains(@id, 'male')]/.."));
//
//    assertFalse("radio button Woman shoud not be seleted",womanRadioButton.isSelected());
//womanLabel.click();
//    assertTrue("radio button Woman is not selected",womanRadioButton.isSelected());
//    assertEquals("label shoud contains Kobieta text ",
//            "Kobieta",womanLabel.getText());
//
//    assertFalse("radio button Man shoud not be seleted",manRadioButton.isSelected());
//    womanLabel.click();
//    assertTrue("radio button Mężczyzna is not selected",manRadioButton.isSelected());
//    assertEquals("label shoud contains Mężczyzna text ",
//            "Mężczyzna",manLabel.getText());
}
}
