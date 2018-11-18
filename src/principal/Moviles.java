
package principal;

public class Moviles { //ESta va a ser una clase separada para que se utilice 
                       //
    private String Marca;
    private String Modelo;
    private int Año;
    private String Patente;
    private String estado;

    public Moviles(String Marca, String Modelo, int Año, String Patente, String estado) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Año = Año;
        this.Patente = Patente;
        this.estado = estado;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }

    public String getPatente() {
        return Patente;
    }

    public void setPatente(String Patente) {
        this.Patente = Patente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    

}



