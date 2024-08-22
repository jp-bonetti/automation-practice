package automationpractice.factory.data;

import automationpractice.dto.LoginDTO;
import com.github.javafaker.Faker;

public class LoginData {

    private static final Faker faker = new Faker();

    public LoginDTO login(){
        return new LoginDTO(
                "processoseletivoact@gmail.com",
                "teste2024"
        );
    }

    public LoginDTO loginEmailInvalido(){
        return new LoginDTO(
                faker.internet().emailAddress().split("@")[0],
                faker.internet().password()
        );
    }

    public LoginDTO loginSenhaInvalida(){
        return new LoginDTO(
                "processoseletivoact@gmail.com",
                faker.internet().password()
        );
    }
}
