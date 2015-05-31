package br.edu.ifpe.tads.pdm.pratica07;

/**
 * Created by Richardson on 30/05/2015.
 */
public class City {
    private String name;
    private String info;
    public City(String name, String info) {
        this.name = name;
        this.info = info;
    }
    public String getName() {
        return this.name;
    }
    public String getInfo() {
        return this.info;
    }
}