package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormularioDeAdicaoDeProdutoPage extends BasePage{

    public FormularioDeAdicaoDeProdutoPage(WebDriver navegador){
        super(navegador);
    }

    //Vou preencher dados do produto e o valor será igual a zero
    public FormularioDeAdicaoDeProdutoPage informarNomeDoProduto(String nomeProduto){
        this.navegador.findElement(By.id("produtonome")).sendKeys(nomeProduto);
        return this;
    }

    public FormularioDeAdicaoDeProdutoPage informarValorDoProduto(String valorProduto){
        this.navegador.findElement(By.id("produtovalor")).sendKeys(valorProduto); //o selenium pega como texto e digita como número, quem coloca a mascara é a interface
        return this;
    }

    public FormularioDeAdicaoDeProdutoPage informarCorDoProduto(String corProduto){
        this.navegador.findElement(By.id("produtocores")).sendKeys(corProduto);
        return this;
    }

    //Vou submeter o formulário: se estiver com erro volta para lista de produto
    public ListaDeProdutosPage submeterFormularioDeAdicaoProdutoComErro(){
        this.navegador.findElement(By.id("btn-salvar")).click();
        return new ListaDeProdutosPage(navegador); //retorna uma nova pagina ListaDeProdutosPage
    }

    //Desafio 2: produto válido
    public FormularioDeEdicaoDeProdutoPage submeterFormularioDeAdicaoComSucesso(){
        this.navegador.findElement(By.id("btn-salvar")).click();
        return new FormularioDeEdicaoDeProdutoPage(navegador);
    }
}
