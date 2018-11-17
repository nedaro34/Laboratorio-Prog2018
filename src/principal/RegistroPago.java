/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.LinkedList;

/**
 *
 * @author alumno
 */
public class RegistroPago {
    private String nombre;
    private String apellido;
    private int dni;
    private int año;
    private int mes;
    private int precio_base;
    private int fam_precio;
    private Afiliados afiliado;

    public RegistroPago(String nombre, String apellido, int dni, int año, int mes, int precio_base, int fam_precio, Afiliados afiliado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.año = año;
        this.mes = mes;
        this.precio_base = precio_base;
        this.fam_precio = fam_precio;
        this.afiliado = afiliado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getPrecio_base() {
        return precio_base;
    }

    public void setPrecio_base(int precio_base) {
        this.precio_base = precio_base;
    }

    public int getFam_precio() {
        return fam_precio;
    }

    public void setFam_precio(int fam_precio) {
        this.fam_precio = fam_precio;
    }

    public Afiliados getAfiliado() {
        return afiliado;
    }

    public void setAfiliado(Afiliados afiliado) {
        this.afiliado = afiliado;
    }

    
    
    
    
}
