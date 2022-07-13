package br.com.td.solid.ocp.handson;

public class CalculadoraDeIMC {

    private double calculaIMCMasculinoAdulto(double altura, double peso) {
        return peso/altura;
    }
    private double calculaIMCFemininoAdulto(double altura, double peso) {
        return peso/altura * altura;
    }

    public double calculaIMC(String tipo, double altura, double peso) {

        if(tipo == "adultoMasculino") {
            return calculaIMCMasculinoAdulto(altura, peso);
        } else if (tipo == "adultoFeminino") {
            return calculaIMCFemininoAdulto(altura, peso);
        }

        return 0;
    }
}
