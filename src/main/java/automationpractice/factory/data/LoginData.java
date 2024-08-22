package automationpractice.factory.data;

import automationpractice.dto.LoginDTO;
import automationpractice.util.DataFakerGenerator;

public class LoginData {

    DataFakerGenerator dataFakerGenerator = new DataFakerGenerator();

    public LoginDTO login(){
        return new LoginDTO("processoseletivoact@gmail.com", "teste2024");
    }

    public LoginDTO loginEmailInvalido(){
        return new LoginDTO(dataFakerGenerator.emailInvalido(), dataFakerGenerator.senha());
    }

    public LoginDTO loginSenhaInvalida(){
        return new LoginDTO("processoseletivoact@gmail.com", dataFakerGenerator.senha());
    }
}
