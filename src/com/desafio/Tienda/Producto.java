package com.desafio.Tienda;

public class Producto implements Comparable<Producto>{
 public String descrocion;
 public double valorCompra;
 public double limite;

    public Producto(String descrocion, double valorCompra) {
        this.descrocion = descrocion;
        this.valorCompra = valorCompra;

    }

    public String getDescrocion() {
        return descrocion;
    }

    public void setDescrocion(String descrocion) {
        this.descrocion = descrocion;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }


    @Override
    public int compareTo(Producto o) {
        return Double.compare(this.valorCompra,o.valorCompra);
    }
}
