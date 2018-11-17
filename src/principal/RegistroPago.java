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
    private LinkedList<String> mes=new LinkedList<String>();
    private int año;

    public RegistroPago(String nombre, String apellido, int dni, int año) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.año = año;
    }
    public void mes(String mes1){//Ingresa mes que se esta pagando
        if(mes.size()>0)
        {
        for(int i=0;i<mes.size();i++)
            {
            if(mes.get(i).equals(mes1)){
                  
                }
            } 
        }
        mes.add(mes1);
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the dni
     */
    public int getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
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

    /**
     * @param año the año to set
     */
    public void setAño(int año) {
        this.año = año;
    }
    
    
    
    
    
}
