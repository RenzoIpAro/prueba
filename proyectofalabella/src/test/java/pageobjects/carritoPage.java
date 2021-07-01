package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class carritoPage extends util {
    @FindBy(xpath = "//a[@id='linkButton']") protected WebElement lnkbolsadecompras;

    public carritoPage() {
        PageFactory.initElements(driver, this);
    }

    public void bolsaDeCompras(){
        wait.until(ExpectedConditions.elementToBeClickable(lnkbolsadecompras));
        lnkbolsadecompras.click();
    }
}
