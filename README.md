# Lojinha Web Automação

Teste Web : Automação de Testes com JUnit e WebDriver


## Dependências

* [Api Junit Jupter](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api/5.11.0-M2)
* [Selênio Java](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.23.0)


## Driver dos navegadores

* [Chrome Driver](https://developer.chrome.com/docs/chromedriver/downloads?hl=pt-br)
* [Firefox Driver](https://github.com/mozilla/geckodriver)
* [Edge Driver](https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/?form=MA13LH)

## Testes Automatizados

Testes para validar as partições de equivalência relacionadas ao valor do produto na Lojinha, que estão vinculados diretamente a regra de negócio que diz o valor do produto deve estar entre R$ 0,01 e R$ 7.000,00.

Sendo eles:
- Teste Valor R$ 0,00
- Teste Valor Maior que R$ 7.000,00
- Teste Valor entre R$ 0,01 e R$ 7000,00
- Teste Limite R$ 0,01
- Teste Limite R$ 7.000,00

## Notas Gerais

- Utilizado as notações:
    - **Before Each**: para capturar o usuário e senha que será utilizado posteriormente nos métodos de teste.
    - **DisplayName** para dar descrições em português para nossos testes.

* Desing Pattern:
    - **Page Object Model :** O Page Object Model é usado em testes de automação, onde cada página da web em um aplicativo da web é representada como uma classe. A classe contém os elementos e ações que podem ser realizados na página. Isso torna o código de teste mais sustentável, pois as alterações na página podem ser feitas em um só lugar, em vez de em vários testes.

    - **Fluent Page Object Model :** O Fluent Page Object Model é uma extensão do Page Object Model, onde métodos são encadeados para formar uma interface fluente. Isso torna o código de teste mais legível e conciso, pois várias ações podem ser executadas na página em uma única linha de código.