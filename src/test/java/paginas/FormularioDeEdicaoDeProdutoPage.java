package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormularioDeEdicaoDeProdutoPage {
    private WebDriver navegador;                                        //atributo privado que seja do tipo WebDriver

    public FormularioDeEdicaoDeProdutoPage(WebDriver navegador) {       //construtor [tenha um construtor da classe que pegue um navegador de fora e jogue aqui pra dentro desse navegador
        this.navegador = navegador;
    }

    public String capturarMensagemApresentada() {
        return navegador.findElement(By.cssSelector(".toast.rounded")).getText();
    }
}
