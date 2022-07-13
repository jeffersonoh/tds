package br.com.td.patterns.creational.abstractfactory;

public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }

}