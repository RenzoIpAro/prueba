package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class ordenPage extends util {
    @FindBy(id="testId-Dropdown-desktop-button") protected WebElement btnorden;
    @FindBy(id="testId-Dropdown-Precio de mayor a menor") protected WebElement btnordena;
    public ordenPage() {
        PageFactory.initElements(driver, this);
    }
    public void seleccionarOrden(){
        wait.until(ExpectedConditions.elementToBeClickable(btnorden));
        btnorden.click();
    }
    public void ordenar(){
        btnordena.click();
    }

}
