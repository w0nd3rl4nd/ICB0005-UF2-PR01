package com.icb0005.uf2;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int velocidadActual;
    private int velocidadMaxima;
    private String combustible;
    private int kilometrosRecorridos;

    // Constructor
    public Vehiculo(String marca, String modelo, int velocidadMaxima, String combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = 0;
        this.combustible = combustible;
        this.kilometrosRecorridos = 0;
    }

    // Métodos
    public void acelerar(int incremento) {
        if (incremento < 0) {
            throw new IllegalArgumentException("El incremento debe ser positivo.");
        }
        velocidadActual += incremento;
        if (velocidadActual > velocidadMaxima) {
            velocidadActual = velocidadMaxima;
        }
        kilometrosRecorridos += incremento;
    }

    public void frenar(int decremento) {
        if (decremento < 0) {
            throw new IllegalArgumentException("El decremento debe ser positivo.");
        }
        velocidadActual -= decremento;
        if (velocidadActual < 0) {
            velocidadActual = 0;
        }
    }

    public void parar() {
        velocidadActual = 0;
    }

    public boolean esDeportivo() {
        return velocidadMaxima > 200;
    }

    // Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }
}