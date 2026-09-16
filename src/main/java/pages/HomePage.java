package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver){
        setDriver(driver);
        driver.get("https://demoqa.com/");
        PageFactory.initElements
                (new AjaxElementLocatorFactory(driver, 10), this);


    }

    @FindBy(xpath = "//div[@class='category-cards']/a[2]")
    WebElement btnForms;

//    public void clickBtnForms(){
//    btnForms.click();


    public void clickBtnForms() {

        new Actions(driver) .scrollByAmount(0, 300) .perform(); btnForms.click(); }
    // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnForms);
    //    btnForms.click(); // прокруткa страницы до элемента

//    Actions actions = new Actions(driver); actions.moveToElement(btnForms) .perform(); btnForms.click(); }//

    //JavascriptExecutor js = (JavascriptExecutor) driver;
    //    js.executeScript("arguments[0].click();", btnForms);
    //принудительно клик через JavaScript. Он игнорирует визуальные перекрытия
}
