
package principal;

public class Moviles { //ESta va a ser una clase separada para que se utilice 
                       //
    private String Marca;
    private String Modelo;
    private int Año;
    private String Patente;
    private String situacion;

    public Moviles(String Marca, String Modelo, int Año, String Patente) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Año = Año;
        this.Patente = Patente;
    }
    
    
    
    

    /**
     * @return the Marca
     */
    public String getMarca() {
        return Marca;
    }

    /**
     * @param Marca the Marca to set
     */
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    /**
     * @return the Modelo
     */
    public String getModelo() {
        return Modelo;
    }

    /**
     * @param Modelo the Modelo to set
     */
    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    /**
     * @return the Año
     */
    public int getAño() {
        return Año;
    }

    /**
     * @param Año the Año to set
     */
    public void setAño(int Año) {
        this.Año = Año;
    }

    /**
     * @return the Patente
     */
    public String getPatente() {
        return Patente;
    }

    /**
     * @param Patente the Patente to set
     */
    public void setPatente(String Patente) {
        this.Patente = Patente;
    }
    

}



