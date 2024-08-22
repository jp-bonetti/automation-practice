package automationpractice.factory.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Interactions extends Elements {

    public static void preencherCampo(By by, String text) {
        aguardarElemento(by);
        elemento(by).sendKeys(text);
    }

    public static void clicar(By by) {
        aguardarElemento(by);
        elemento(by).click();
    }

    public static String lerTexto(By by) {
        aguardarElemento(by);
        return elemento(by).getText();
    }

    public static Select select(By by){
        aguardarElemento(by);
        WebElement selectElement = elemento(by);
        return new Select(selectElement);
    }

    public static void limparCampo(By by){
        aguardarElemento(by);
        elemento(by).clear();
    }
}
