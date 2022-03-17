import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MainTest {
    private WebDriver driver;
    Logger LOGGER = Logger.getLogger(MainTest.class.getName());
    FileHandler fh;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","/Users/air/Documents/Driver/chrome-driver");
        System.setProperty("java.util.logging.SimpleFormatter.format","[%1$tF %1$tT] [%4$-3s] %5$s %n");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://computer-database.gatling.io/computers");
    }

    @Test
    public void Test() {
        ComputerDatabasePage computerDatabasePage = PageFactory.initElements(driver, ComputerDatabasePage.class);
        ComputerCreatePage computerCreatePage = PageFactory.initElements(driver, ComputerCreatePage.class);
        try {
            fh = new FileHandler("/Users/air/Documents/Driver/MyLogFile.log");
            LOGGER.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
        } catch (Exception e) {
            LOGGER.log(Level.WARNING, "Went wrong", e);
        }
            LOGGER.info("1. Check page name");
            computerDatabasePage.pageNameCheck();
            Assert.assertEquals("Error check page name","Computer database", computerDatabasePage.pageNameCheck());

            LOGGER.info("2. Press on the button 'AddComputer' ");
            computerDatabasePage.computerAddButtonClick();
            LOGGER.info("3. Move to page 'CreateComputer'");

            LOGGER.info("4. input computer name");
            computerCreatePage.computerNameBoxClick().computerNameBoxSendKeys();

            LOGGER.info("5. input introduced date");
            computerCreatePage.introduceDateClick().introduceTypeDate();

            LOGGER.info("6. input discontinued date");
            computerCreatePage.discontinuedDateClick().discontinuedTypeData();

            LOGGER.info("7. Select company from list ");
            computerCreatePage.companySelect();

            LOGGER.info("8. Press on the button 'Add This Computer'");
            computerCreatePage.createThisComputerButton();

            LOGGER.info("9. Check alert message about computer created");
            computerDatabasePage.alertMessageAboutCreatedComputer();

            LOGGER.info("10. Input computer name in the search box element");
            computerDatabasePage.searchBoxClick().searchBoxSendKeys();

            LOGGER.info("11. Click to 'Filter by name' button");
            computerDatabasePage.filterByNameButtonClick();

            LOGGER.info("12. Show computers found by filter");
            Assert.assertEquals("Computer Found", "MacAir", computerDatabasePage.checkComputerFounded());
    }

    @After
    public void TearDown() {
        driver.quit();
    }
}
