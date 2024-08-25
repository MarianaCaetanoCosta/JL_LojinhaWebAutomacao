package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver navegador;

    public BasePage(WebDriver navegador){
        this.navegador = navegador;
    }

    public String capturarRounded(){
        return navegador.findElement(By.cssSelector(".toast.rounded")).getText();
    }
}
