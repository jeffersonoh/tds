package br.com.td.patterns.structural.adapter.handson;

public class Demo {

    public static void main(String[] args) {
        Movable bugattiVeyron = new BugattiVeyron();
        MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
    }
}
