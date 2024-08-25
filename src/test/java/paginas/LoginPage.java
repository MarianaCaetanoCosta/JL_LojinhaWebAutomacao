package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.log.Log;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver navegador){
        super(navegador);
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
