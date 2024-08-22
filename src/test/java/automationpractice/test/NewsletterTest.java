package automationpractice.test;

import automationpractice.factory.data.NewsletterData;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

import static automationpractice.factory.selenium.Interactions.*;
import static automationpractice.page.NewsletterPage.*;
import static org.junit.Assert.assertEquals;
import static storys.NewsletterStory.*;

@Epic(EPIC_NEWSLETTER)
@Story(USER_STORY_NEWSLETTER)
public class NewsletterTest extends BaseTest{

    NewsletterData newsletterData = new NewsletterData();

    @Test
    @Description(CT_NEWSLETTER_01)
    public void testInscricaoNaNewsletter(){

        preencherCampo(inputEmailNewsletter, newsletterData.email());
        clicar(btnInscreverNewsletter);

        assertEquals("Newsletter : You have successfully subscribed to this newsletter.", lerTexto(msgSucesso));
    }

    @Test
    @Description(CT_NEWSLETTER_02)
    public void testInscricaoNaNewsletterComEmailDuplicado(){

        preencherCampo(inputEmailNewsletter, "joaopaulobonetti2004@gmail.com");
        clicar(btnInscreverNewsletter);

        assertEquals("Newsletter : This email address is already registered.", lerTexto(msgSucesso));
    }

    @Test
    @Description(CT_NEWSLETTER_03)
    public void testInscricaoNaNewsletterSemEnviarEmail(){

        clicar(btnInscreverNewsletter);

        assertEquals("Newsletter : Invalid email address.", lerTexto(msgSucesso));
    }

    @Test
    @Description(CT_NEWSLETTER_04)
    public void testInscricaoNaNewsletterComEmailInvalido(){

        preencherCampo(inputEmailNewsletter, newsletterData.emailInvalido());
        clicar(btnInscreverNewsletter);

        assertEquals("Newsletter : Invalid email address.", lerTexto(msgSucesso));
    }
}
