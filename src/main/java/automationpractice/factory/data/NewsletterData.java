package automationpractice.factory.data;

import com.github.javafaker.Faker;

public class NewsletterData {

    private static final Faker faker = new Faker();

    public String email(){
        return faker.internet().emailAddress();
    }

    public String emailInvalido(){
        return faker.internet().emailAddress().split("@")[0];
    }
}
