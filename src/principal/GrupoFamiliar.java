
package principal;


public class GrupoFamiliar extends Persona{

    private Afiliados afiliado;

    public GrupoFamiliar(Afiliados afiliado, String Nombre, String Apellido, String Direccion, Fecha Fechadenacimiento, int Documento, String Telefono, String DireccionCorreo) {
        super(Nombre, Apellido, Direccion, Fechadenacimiento, Documento, Telefono, DireccionCorreo);
        this.afiliado = afiliado;
    }

    public Afiliados getAfiliado() {
        return afiliado;
    }

    public void setAfiliado(Afiliados afiliado) {
        this.afiliado = afiliado;
    }
    

    
    
    
}
