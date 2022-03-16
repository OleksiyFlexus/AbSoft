import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ComputerCreatePage {
    WebDriver driver;
    LocalDate localDate = LocalDate.now();
    LocalDate olderDate = localDate.minusYears(10);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public ComputerCreatePage (WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id='name']")
    private WebElement computerNameBox;

    @FindBy(xpath = "//*[@id='introduced']")
    private WebElement introducedDate;

    @FindBy(xpath = "//*[@id='discontinued']")
    private WebElement discontinuedDate;

    @FindBy(xpath = "//*[@id='company']")
    private WebElement companyNameSelect;

    @FindBy(xpath = "//*[@value='Create this computer']")
    private WebElement createThisComputerButton;

    public ComputerCreatePage computerNameBoxClick() {
        computerNameBox.click();
        return this;
    }

    public ComputerCreatePage computerNameBoxSendKeys() {
        computerNameBox.sendKeys("MacAir");
        return this;
    }

    public ComputerCreatePage introduceDateClick() {
        introducedDate.click();
        return this;
    }

    public ComputerCreatePage introduceTypeDate() {
        introducedDate.sendKeys(olderDate.format(formatter));
        return this;
    }

    public ComputerCreatePage discontinuedDateClick() {
        discontinuedDate.click();
        return this;
    }

    public ComputerCreatePage discontinuedTypeData() {
        discontinuedDate.sendKeys(localDate.format(formatter));
        return this;
    }

    public ComputerCreatePage companySelect() {
        WebElement selectElement = companyNameSelect;
        Select select = new Select(selectElement);
        select.selectByIndex(1);
        return this;
    }

    public ComputerCreatePage createThisComputerButton() {
        createThisComputerButton.click();
        return this;
    }
}
