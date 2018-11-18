
package principal;


public class Afiliados extends Persona{
    
    private int familia;

    public Afiliados(int familia, String Nombre, String Apellido, String Direccion, String Fechadenacimiento, int Documento, String Telefono, String DireccionCorreo) {
        super(Nombre, Apellido, Direccion, Fechadenacimiento, Documento, Telefono, DireccionCorreo);
        this.familia = familia;
    }

    public int getFamilia() {
        return familia;
    }

    public void setFamilia(int familia) {
        this.familia = familia;
    }

    
    
    public void suma_familia(){
        int result;
        result = familia+1;
        familia=result;
    }
    
    public void restar_familia(){
        int result;
        if (familia == 0){
            result = familia-1;
            familia=result;
        }
    }
    
    
}
