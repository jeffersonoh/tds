package br.com.td.patterns.creational.abstractfactory;

public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}
