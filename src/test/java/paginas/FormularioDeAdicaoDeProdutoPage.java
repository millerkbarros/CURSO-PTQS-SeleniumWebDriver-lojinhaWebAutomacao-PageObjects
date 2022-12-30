package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormularioDeAdicaoDeProdutoPage {
    private WebDriver navegador;                                        //atributo privado que seja do tipo WebDriver

    public FormularioDeAdicaoDeProdutoPage(WebDriver navegador) {       //construtor [tenha um construtor da classe que pegue um navegador de fora e jogue aqui pra dentro desse navegador
        this.navegador = navegador;                                    //atributo navegador recebe o navegador
    }

    public FormularioDeAdicaoDeProdutoPage informarNomeDoProduto(String produtoNome) {
        navegador.findElement(By.id("produtonome")).sendKeys(produtoNome);

        return this;
    }

    public FormularioDeAdicaoDeProdutoPage informarValorDoProduto(String produtoValor) {
        navegador.findElement(By.id("produtovalor")).sendKeys(produtoValor);

        return this;
    }

    public FormularioDeAdicaoDeProdutoPage informarCoresDoProduto(String produtoCor) {
        navegador.findElement(By.id("produtocores")).sendKeys(produtoCor);

        return this;

    }

    public ListaDeProdutosPage submeterFormularioDeAdicaoComErro() {
        navegador.findElement(By.cssSelector("button[type='submit']")).click();

        return new ListaDeProdutosPage(navegador);
    }

    public FormularioDeEdicaoDeProdutoPage submeterFormularioDeAdicaoComSucesso() {
        navegador.findElement(By.cssSelector("button[type='submit']")).click();

        return new FormularioDeEdicaoDeProdutoPage(navegador);
    }
}