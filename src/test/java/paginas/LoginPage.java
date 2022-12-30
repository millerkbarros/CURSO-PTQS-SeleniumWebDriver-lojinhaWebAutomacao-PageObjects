package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver navegador;                      //atributo privado que seja do tipo WebDriver

    public LoginPage(WebDriver navegador){          //construtor [tenha um construtor da classe que pegue um navegador de fora e jogue aqui pra dentro desse navegador
        this.navegador = navegador;                //atributo navegador recebe o navegador
    }

    public LoginPage informarOUsuario(String usuario) {
        navegador.findElement(By.cssSelector("label[for='usuario']")).click();
        navegador.findElement(By.id("usuario")).sendKeys(usuario);

        return this;
    }

    public LoginPage informarASenha(String senha) {
        navegador.findElement(By.cssSelector("label[for='senha']")).click();
        navegador.findElement(By.id("senha")).sendKeys(senha);

        return this;
    }

    public ListaDeProdutosPage submiterFormularioDeLogin(){
        navegador.findElement(By.cssSelector("button[type='submit']")).click();

        return new ListaDeProdutosPage(navegador);
    }
}

