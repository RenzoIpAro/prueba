package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class comprarPage extends util {
    @FindBy(id="testId-Pod-action-17787481") protected WebElement btnelegir;
    @FindBy(id="testId-sizeButton-42") protected WebElement btnelegirtalla;
    @FindBy(id="add-to-cart") protected WebElement btnagregaralcarrito;

    public comprarPage() {
        PageFactory.initElements(driver, this);
    }

    public void elegirProducto(){
        wait.until(ExpectedConditions.elementToBeClickable(btnelegir));
        btnelegir.click();
    }
    public void elegirTalla(){
        wait.until(ExpectedConditions.elementToBeClickable(btnelegirtalla));
        btnelegirtalla.click();
    }
    public void agregarAlCarrito(){
        btnagregaralcarrito.click();
    }
}
