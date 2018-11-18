
package principal;

public class Persona {
private String Nombre;
private String Apellido;
private String Direccion;
private String Fechadenacimiento;
private int Documento;
private String Telefono;
private String DireccionCorreo;

    public Persona(String Nombre, String Apellido, String Direccion, String Fechadenacimiento, int Documento, String Telefono, String DireccionCorreo) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Direccion = Direccion;
        this.Fechadenacimiento = Fechadenacimiento;
        this.Documento = Documento;
        this.Telefono = Telefono;
        this.DireccionCorreo = DireccionCorreo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getFechadenacimiento() {
        return Fechadenacimiento;
    }

    public void setFechadenacimiento(String Fechadenacimiento) {
        this.Fechadenacimiento = Fechadenacimiento;
    }

    public int getDocumento() {
        return Documento;
    }

    public void setDocumento(int Documento) {
        this.Documento = Documento;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccionCorreo() {
        return DireccionCorreo;
    }

    public void setDireccionCorreo(String DireccionCorreo) {
        this.DireccionCorreo = DireccionCorreo;
    }


    

    


}
