
package principal;

import java.util.LinkedList;

public class Pago { //registro
    
    private String Nombre;
    private int dni;
    private LinkedList<String> nuevo=new LinkedList<String>();    
    private int año ;
    private int cont;

    public Pago(String Nombre, int dni, int año, int cont) {
        this.Nombre = Nombre;
        this.dni = dni;
        this.año = año;
        this.cont = cont;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
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
     * @return the nuevo
     */
    public LinkedList<String> getNuevo() {
        return nuevo;
    }

    /**
     * @param nuevo the nuevo to set
     */
    public void setNuevo(LinkedList<String> nuevo) {
        this.nuevo = nuevo;
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

    /**
     * @return the cont
     */
    public int getCont() {
        return cont;
    }

    /**
     * @param cont the cont to set
     */
    public void setCont(int cont) {
        this.cont = cont;
    }
    
    
    
    
}

