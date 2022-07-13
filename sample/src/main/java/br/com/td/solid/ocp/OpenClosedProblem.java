package br.com.td.solid.ocp;

import java.sql.Connection;

public class OpenClosedProblem {

    private static class AuthenticateLogin{

        public void login(User user, String provider){

            ConnectionDAO connectionDAO = new ConnectionDAO("root", "");
            Connection connection = connectionDAO.createConnection();

            if(provider.equalsIgnoreCase("Linkedin")){
                //autêntica o login com o Oauth Linkedin
            }
            else{
                //autêntica o login com informações do banco de dados
            }
        }
    }

}
