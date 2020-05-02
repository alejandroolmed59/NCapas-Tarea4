package com.example.olmedo.tarea3.Model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Producto {
    @Size(min = 12, max=12, message = "El codigo deben ser 12 digitos")
    @NotEmpty(message = "El campo no puede estar vacio")
    private String codigo;
    @Size(min = 1, max=100, message = "El Nombre del producto debe ser menor a 100 caracteres")
    @NotEmpty(message = "El campo no puede estar vacio")
    private String nombre;
    @Size(min = 1, max=100, message = "La marca debe ser menor a 100 caracteres")
    @NotEmpty(message = "El campo no puede estar vacio")
    private String marca;
    @Size(min = 1, max=500, message = "La descripcion debe ser menor a 500 caracteres")
    @NotEmpty(message = "El campo no puede estar vacio")
    private String descripcion;
    @Pattern(regexp = "^[\\d]*$", message = "El stock no puede contener decimales")
    private String stock;
    @Pattern(regexp = "^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$", message = "Fecha debe ser formato dd/mm/yyyy")
    private String fecha;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
