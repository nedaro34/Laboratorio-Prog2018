
package principal;

import java.util.LinkedList;
import javax.swing.JOptionPane;


public class CentroClinicaMedica {
   
    private  LinkedList<Afiliados> afiliado = new LinkedList<Afiliados>();
    private  LinkedList<Choferes> chofer = new LinkedList<Choferes>();
    private  LinkedList<Enfermeros> enfermero = new LinkedList<Enfermeros>();
    private  LinkedList<GrupoFamiliar> familiar = new LinkedList<GrupoFamiliar>();
    private  LinkedList<Administrativos> administrativo = new LinkedList<Administrativos>();

 // Ingresa objeto afiliados a la lista 
    
 public void Ingresar_Afiliados(Afiliados afiliados,int dni)throws AfiliadoIgualExcepcion
    {
        if(afiliado.size()>0)
        {
            for(int i=0;i<afiliado.size();i++)
            {
                if(afiliado.get(i).getDocumento()==dni)
                {
                    throw new AfiliadoIgualExcepcion();
                }
            } 
        }



            afiliado.add(afiliados);

    }

// Buscar a afiliado
public Afiliados Buscar_Afiliado(int dni)
    {
        if(afiliado.size()>0)
        {
            for(int i=0;i<afiliado.size();i++)
            {
                if(afiliado.get(i).getDocumento()==dni)
                {
                    return afiliado.get(i);
                }
            }
            JOptionPane.showMessageDialog(null,"El afiliado no Exise");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Lista de afiliado no existe");
        }    
        return null;
    } 







public void Ingresar(Administrativos administrativos){
    
        administrativo.add(administrativos);
    

}
    
 

public void Ingresar(Enfermeros enfermero1){
    
        enfermero.add(enfermero1);
    

}

public void Ingresar(GrupoFamiliar familiar1){
    
        familiar.add(familiar1);
    

}

public void Ingresar( Choferes chofer1){
    
        chofer.add(chofer1);
    

}

}
