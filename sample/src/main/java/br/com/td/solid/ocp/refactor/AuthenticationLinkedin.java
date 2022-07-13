package br.com.td.solid.ocp.refactor;

import br.com.td.solid.ocp.User;

public class AuthenticationLinkedin implements AuthenticateLogin{

    @Override
    public boolean login(User user) {

        //autêntica o login com o Oauth Linkedin

        return false;
    }
}
