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

   assertEquals("Labelka Imie ","Imię", tlenRegisterPage.getImieLabel().getText());
    assertTrue("imie Input jest nie puste",tlenRegisterPage.getImieInput().getAttribute("value").isEmpty());
    assertTrue("Error label shoud be not visibe",tlenRegisterPage.getImieErrorsList().isEmpty());
       tlenRegisterPage.getImieInput().sendKeys("Test");
        assertTrue("imie Input jest nie puste",tlenRegisterPage.getImieInput().getAttribute("value").contains("Test"));
       tlenRegisterPage.getImieInput().clear();
       tlenRegisterPage.getImieLabel().click();
        assertEquals("Labelka Error ",
                "Proszę wpisać poprawne imię.",tlenRegisterPage.getImieErrorsList().get(0).getText());
    }
@Test public void manOrWomancheckbox(){


    assertFalse("radio button Woman shoud not be seleted",tlenRegisterPage.getWomanRadioButton().isSelected());
    tlenRegisterPage.getWomanLabel().click();
    assertTrue("radio button Woman is not selected",tlenRegisterPage.getWomanRadioButton().isSelected());
    assertEquals("label shoud contains Kobieta text ",
            "Kobieta",tlenRegisterPage.getWomanLabel().getText());

    assertFalse("radio button Man shoud not be seleted",tlenRegisterPage.getManRadioButton().isSelected());
    tlenRegisterPage.getWomanLabel().click();
    assertFalse("radio button Mężczyzna is not selected",tlenRegisterPage.getManRadioButton().isSelected());
    assertEquals("label shoud contains Mężczyzna text ",
            "Mężczyzna",tlenRegisterPage.getManLabel().getText());
}
}
