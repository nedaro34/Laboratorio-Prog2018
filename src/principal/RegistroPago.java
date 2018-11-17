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
    private int precio_base;
    private int fam_precio;
    private Afiliados afiliado;
    private static LinkedList<String> mes = new LinkedList<String>();

    public RegistroPago(String nombre, String apellido, int dni, int año, int precio_base, int fam_precio, Afiliados afiliado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.año = año;
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

    /**
     * @return the mes
     */
    public LinkedList<String> getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(LinkedList<String> mes) {
        this.mes = mes;
        
    }

    /**
     * @return the año
     */
    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
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

    
    public void Ingresar_Mes(String pago_mes)throws Pago_mes_Igual_Excepcion{
        if(mes.size()>0)
        {
            for(int i=0;i<mes.size();i++)
            {
                if(mes.get(i).equals(pago_mes))
                {
                    throw new Pago_mes_Igual_Excepcion();
                }
            } 
        }

            mes.add(pago_mes);
    }
    
}
