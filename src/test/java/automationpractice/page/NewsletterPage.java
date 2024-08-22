package automationpractice.page;

import org.openqa.selenium.By;

public class NewsletterPage {

    public static final By inputEmailNewsletter = By.cssSelector("#newsletter-input");
    public static final By btnInscreverNewsletter = By.cssSelector("#newsletter_block_left > div > form > div > button");
    public static final By msgSucesso = By.cssSelector("#columns > p");
}
