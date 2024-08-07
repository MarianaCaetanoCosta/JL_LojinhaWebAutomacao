package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.log.Log;

public class LoginPage {
    //1º Tenha um atributo da classe que seja WebDriver
    private WebDriver navegador;

    //2º Tenha um Contrutor da classe que pegue o navegador de fora e o receba
    public LoginPage(WebDriver navegador){
        this.navegador = navegador;
    }

    //3º Métodos de interação com cada elemento da tela
    public LoginPage informarOUsuario(String usuario){
        //Fazer login
        this.navegador.findElement(By.id("usuario")).sendKeys(usuario);
        return this; //retorna a classe LoginPage,ou seja, a mesma pagina
    }

    public LoginPage informarASenha(String senha){
        this.navegador.findElement(By.id("senha")).sendKeys(senha);
        return this; //retorna a classe LoginPage
    }

    public ListaDeProdutosPage submeterFormularioDeLogin(){
        this.navegador.findElement(By.id("btn-entrar")).click();
        return new ListaDeProdutosPage(navegador); //retorna uma nova pagina ListaDeProdutosPage
    }
}
