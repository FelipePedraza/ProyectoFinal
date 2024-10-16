package com.proyectofinal.modelo;

import java.time.LocalDateTime;
import java.io.Serializable;

public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    private String nombre;
    private String codigo;              // Identificador único del producto
    private String imagen;              // Ruta o URL de la imagen del producto
    private String categoria;           // Categoría del producto
    private double precio;              // Precio del producto
    private Estado estado;      // Estado del producto (VENDIDO, PUBLICADO, CANCELADO)
    private LocalDateTime fechaPublicacion; // Fecha de publicación del producto
    private int meGusta;                // Número de "Me gusta" recibidos

    // Constructor principal
    public Producto(String nombre, String codigo, String imagen, String categoria, double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.imagen = imagen;
        this.categoria = categoria;
        this.precio = precio;
        this.estado = Estado.PUBLICADO;   // Estado inicial: publicado
        this.fechaPublicacion = LocalDateTime.now();  // Fecha de creación es la actual
        this.meGusta = 0;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public LocalDateTime getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDateTime fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public int getMeGusta() {
        return meGusta;
    }

    public void darMeGusta() {
        this.meGusta++;
    }

    // Sobrescritura del método toString para mostrar información relevante del producto
    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", categoria='" + categoria + '\'' +
                ", precio=" + precio +
                ", estado=" + estado +
                ", fechaPublicacion=" + fechaPublicacion +
                ", meGusta=" + meGusta +
                '}';
    }
}


