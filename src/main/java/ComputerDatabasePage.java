import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComputerDatabasePage {
    WebDriver driver;
    public ComputerDatabasePage (WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@class='fill'][text()='Computer database']")
    private WebElement pageNameCheck;

    @FindBy(xpath = "//*[@id='add']")
    private WebElement computerAddButton;

    @FindBy(xpath = "//*[@id='searchsubmit']")
    private WebElement filterByNameButton;

    @FindBy(xpath = "//*[@id='searchbox']")
    private WebElement searchBox;

    @FindBy(xpath = "//*[@class='well']")
    private WebElement displayAlertMessage;

    @FindBy(xpath = "//*[@class='computers zebra-striped']//td/a[text()='MacAir']")
    private WebElement checkComputerFounded;

    @FindBy(xpath = "//*[@class='alert-message warning']")
    private WebElement alertMessageAboutComputerCreated;

    public String pageNameCheck() {
       return pageNameCheck.getText();
    }

    public ComputerDatabasePage computerAddButtonClick() {
        computerAddButton.click();
        return this;
    }

    public ComputerDatabasePage searchBoxClick() {
        searchBox.click();
        return this;
    }

    public ComputerDatabasePage searchBoxSendKeys() {
        searchBox.sendKeys("MacAir");
        return this;
    }

    public ComputerDatabasePage filterByNameButtonClick() {
        filterByNameButton.click();
        return this;
    }

    public String displayAlertMessage() {
        return displayAlertMessage.getText();
    }

    public String checkComputerFounded() {
        return checkComputerFounded.getText();
    }

    public String alertMessageAboutCreatedComputer() {
       return alertMessageAboutComputerCreated.getText();
    }

}
