package modulos.produtos;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@DisplayName("Teste Web do Modulo de Produtos")
public class ProdutosTest {
    @Test
    @DisplayName("Não é permitido registrar produto com valor igual a zero")
    public void testNaoEPermitidoRegistrarProdutoComValorIgualAZero(){
        //Abrir o navegador
        System.setProperty("webdriver.chrome.driver", "C:\\Workspace_Intellij\\LojinhaWebAutomacao\\Drivers\\chromedriver-win64\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();

        //Vou maximizar a tela
        navegador.manage().window().maximize();

        //Navegar para a pagina da lojinha web
        navegador.get("http://165.227.93.41/lojinha-web/v2/");

        //Fazer login
        //Vou para a tela de registro de produto
        //Vou preencher dados do produto e o valor será igual a zero
        //Vou submeter o formulário
        //Vou validar que a mensagem de erro foi apresentada
    }
}
