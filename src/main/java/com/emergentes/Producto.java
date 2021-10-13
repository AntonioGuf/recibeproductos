package com.emergentes;

public class Producto {
   private String prodcuto;
   private String categoria;
   private String sxistencia;
   private String precio;

    public Producto() {
    }
   
    public String getProdcuto() {
        return prodcuto;
    }

    public void setProdcuto(String prodcuto) {
        this.prodcuto = prodcuto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSxistencia() {
        return sxistencia;
    }

    public void setSxistencia(String sxistencia) {
        this.sxistencia = sxistencia;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
   
}
