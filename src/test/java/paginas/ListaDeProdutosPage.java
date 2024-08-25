package paginas;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListaDeProdutosPage extends BasePage{

    public ListaDeProdutosPage(WebDriver navegador){
        super(navegador);
    }

    public FormularioDeAdicaoDeProdutoPage acessarFormularioDeAdicaoNovoProduto(){
        //Vou para a tela de registro de produto
        this.navegador.findElement((By.linkText("ADICIONAR PRODUTO"))).click(); //Adicione o texto conforme aparece para o usuário
        return new FormularioDeAdicaoDeProdutoPage(navegador);
    }

    public String capturarMensagemApresentada(){
        return capturarRounded();
    }
}
