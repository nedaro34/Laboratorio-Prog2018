
package principal;

import java.util.LinkedList;


public class CentroClinicaMedica {
   
    private  LinkedList<Afiliados> afiliado = new LinkedList<Afiliados>();
    private  LinkedList<Choferes> chofer = new LinkedList<Choferes>();
    private  LinkedList<Enfermeros> enfermero = new LinkedList<Enfermeros>();
    private  LinkedList<GrupoFamiliar> familiar = new LinkedList<GrupoFamiliar>();
    private  LinkedList<Administrativos> administrativo = new LinkedList<Administrativos>();

 
public void Ingresar(Afiliados afiliados){
    
        getAfiliado().add(afiliados);
    

}

public void Ingresar(Administrativos administrativos){
    
        administrativo.add(administrativos);
    

}
    
 
public void Ingresar(Choferes chofer1){
    
        getChofer().add(chofer1);
    

}
public void Ingresar(Enfermeros enfermero1){
    
        enfermero.add(enfermero1);
    

}

public void Ingresar(GrupoFamiliar familiar1){
    
        familiar.add(familiar1);
    

}
    /**
     * @return the afiliado
     */
    public LinkedList<Afiliados> getAfiliado() {
        return afiliado;
    }

    /**
     * @param afiliado the afiliado to set
     */
    public void setAfiliado(LinkedList<Afiliados> afiliado) {
        this.afiliado = afiliado;
    }

    /**
     * @return the chofer
     */
    public LinkedList<Choferes> getChofer() {
        return chofer;
    }

    /**
     * @param chofer the chofer to set
     */
    public void setChofer(LinkedList<Choferes> chofer) {
        this.chofer = chofer;
    }

    
    

}
