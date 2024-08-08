# Lojinha Web Automação

Teste Web : Automação de Testes com JUnit e WebDriver

O projeto tem por objetivo:
- interagir com os elementos da tela
- utilizando padres de designe partter

1. Criação do projeto

>> Intellij > New Project > Java > Maven > Sdk > Name: LojinhaWebAutomação > Local: Workspace_Intellij
----------------------------------------------------------

2. Dependências

* [Repositorio Maven](https://mvnrepository.com/)
* [Api Junit Jupter](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api/5.11.0-M2)
* [Selênio Java](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.23.0)
----------------------------------------------------------

3. Driver dos navegadores

* [Chrome Driver](https://developer.chrome.com/docs/chromedriver/downloads?hl=pt-br)
* [Firefox Driver](https://github.com/mozilla/geckodriver)
* [Edge Driver](https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/?form=MA13LH)
----------------------------------------------------------
Pom.xml
- Crie a tag <dependencies> Cole o Junit Jupter </dependencies>
- Atualize o projeto maven para baixar a dependência

----------------------------------------------------------

3. Criando o primeiro teste

* Pasta Test > New > Package > Name: Modulos
* Modulos > New > Package > Name: Produtos
* Produtos > New > Java Class > Name: ProdutosTest

