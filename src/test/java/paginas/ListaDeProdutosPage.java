package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class ListaDeProdutosPage {
    private WebDriver navegador;                                //atributo privado que seja do tipo WebDriver

    public ListaDeProdutosPage(WebDriver navegador){          //construtor [tenha um construtor da classe que pegue um navegador de fora e jogue aqui pra dentro desse navegador
        this.navegador = navegador;                         //atributo navegador recebe o navegador
    }

    public FormularioDeAdicaoDeProdutoPage acessarFormularioAdicaoNovoProduto() {
        navegador.findElement(By.linkText("ADICIONAR PRODUTO")).click();

        return new FormularioDeAdicaoDeProdutoPage(navegador);
    }

    public String capturarMensagemApresentada() {
        return navegador.findElement(By.cssSelector(".toast.rounded")).getText();
    }
}
