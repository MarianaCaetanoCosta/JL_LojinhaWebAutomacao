package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormularioDeEdicaoDeProdutoPage extends BasePage{

    public FormularioDeEdicaoDeProdutoPage(WebDriver navegador){
        super(navegador);
    }

    public String capturarMensagemApresentada(){
        return capturarRounded();
    }
}
