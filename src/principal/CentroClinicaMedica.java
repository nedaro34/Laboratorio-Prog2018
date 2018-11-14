
package principal;

import java.util.LinkedList;
import javax.swing.JOptionPane;


public class CentroClinicaMedica {
    
    //creacion de listas
    
    private static LinkedList<Afiliados> afiliado = new LinkedList<Afiliados>();
    
    //metodos afiliados
    //igreso de afiliado a las listas
    
    public void Ingresar_Afiliados(Afiliados afiliados,int dni)throws AfiliadosDIgualExcepcion
    {
        if(afiliado.size()>0)
        {
            for(int i=0;i<afiliado.size();i++)
            {
                if(afiliado.get(i).getDocumento()==dni)
                {
                    throw new AfiliadosDIgualExcepcion();
                }
            } 
        }

            afiliado.add(afiliados);
           
    }
    
    //buscar afiliados
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
            JOptionPane.showMessageDialog(null,"El afiliado no existe");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Lista de afiliado vasia");
        }    
        return null;
    } 
    
}
