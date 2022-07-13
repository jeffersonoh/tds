package br.com.td.patterns.structural.decorator;

public interface DataSource {
    void writeData(String data);

    String readData();
}