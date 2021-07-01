package definitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import pageobjects.busquedaPage;
import pageobjects.carritoPage;
import pageobjects.comprarPage;
import pageobjects.ordenPage;

public class carritoDefinition {
    busquedaPage busqueda;
    ordenPage filtrar;
    comprarPage compra;
    carritoPage carrito;
    public carritoDefinition() {
        busqueda = new busquedaPage();
        filtrar = new ordenPage();
        compra = new comprarPage();
        carrito = new carritoPage();
    }

    @Dado("que la web esta operativa")
    public void queLaWebEstaOperativa() {
        hooks.driver.get("https://www.falabella.com.pe/falabella-pe/");
    }

    @Cuando("se busca un producto {string}")
    public void seBuscaUnProducto(String texto) {
        busqueda.escribirProducto(texto);
    }

    @Y("se realiza la busqueda")
    public void seRealizaLaBusqueda() {
        busqueda.clickBuscarProducto();
    }

    @Y("se filtra los productos por el orden de precio de mayor a menor")
    public void seFiltraLosProductosPorElOrdenDePrecioDeMayorAMenor() {
        filtrar.seleccionarOrden();
        filtrar.ordenar();
    }

    @Y("se selecciona el producto a comprar")
    public void seSeleccionaElProductoAComprar() {
        compra.elegirProducto();
    }

    @Y("se selecciona la talla")
    public void seSeleccionaLaTalla() {
        compra.elegirTalla();
    }

    @Y("se agrega al carrito de compras")
    public void seAgregaAlCarritoDeCompras() {
        compra.agregarAlCarrito();
    }

    @Y("revisamos nuestra bolsa de compras")
    public void revisamosNuestraBolsaDeCompras() {
        carrito.bolsaDeCompras();
    }
}
