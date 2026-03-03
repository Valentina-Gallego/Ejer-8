package edu.itm.codigo;

public class Producto {

    private String nombre;
    private double peso;
    private String categoria;

    public Producto(String nombre, double peso, String categoria) {
        this.nombre = nombre;
        this.peso = peso;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return nombre + " | Peso: " + peso + " | Cat: " + categoria;
    }
}
