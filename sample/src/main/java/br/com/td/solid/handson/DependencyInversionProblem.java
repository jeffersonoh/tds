package br.com.td.solid.handson;

public class DependencyInversionProblem {

    private static class AuthenticateLogin {

        private final Authentication authentication;

        private AuthenticateLogin(Authentication authentication) {
            this.authentication = authentication;
        }

        public boolean login(User user){
            return authentication.login(user);

        }
    }

    private static class AuthenticationLinkedin  {
        public boolean login(User user) {
            //autêntica o login com o Oauth Linkedin.

         return true;
        }
    }
    public static void main(String[] args) {
        User user = new User("email@mail.com", "123");

        AuthenticateLogin authenticateLogin = new AuthenticateLogin((Authentication) new AuthenticationLinkedin());
        authenticateLogin.login(user);
    }


}


