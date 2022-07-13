package br.com.td.solid.ocp.refactor;

import br.com.td.solid.ocp.User;

public class AuthenticationFacebook implements AuthenticateLogin {
    @Override
    public boolean login(User user) {
        return false;
    }
}
