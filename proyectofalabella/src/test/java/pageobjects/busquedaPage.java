package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class busquedaPage extends util {
    @FindBy(id="testId-SearchBar-Input") protected WebElement txtbusqueda;
    @FindBy(className = "SearchBar-module_searchBtnIcon__VR3f5") protected WebElement btnbuscar;

    public busquedaPage() {
        PageFactory.initElements(driver, this);
    }

    public void escribirProducto(String texto){
        wait.until(ExpectedConditions.visibilityOf(txtbusqueda));
        txtbusqueda.sendKeys(texto);
    }

    public void clickBuscarProducto(){
        btnbuscar.click();
    }
}
