package automationpractice.util;

import com.github.javafaker.Faker;

public class DataFakerGenerator {

    private static final Faker faker = new Faker();

    public String email(){ return faker.internet().emailAddress(); }
    public String emailInvalido(){ return faker.internet().emailAddress().split("@")[0]; }
    public String senha(){ return faker.internet().password(); }
}
