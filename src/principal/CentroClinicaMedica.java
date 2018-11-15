
package principal;

import java.util.LinkedList;
import javax.swing.JOptionPane;


public class CentroClinicaMedica {
    //Esta clase va a contener todas las listas enlazadas para que tome la vriables
    //creacion de listas
    
    private static LinkedList<Afiliados> afiliado = new LinkedList<Afiliados>();
    private static LinkedList<Choferes> chofer = new LinkedList<Choferes>();
    private static LinkedList<Doctores> doctor = new LinkedList<Doctores>();
    private static LinkedList<Enfermeros> enfermero = new LinkedList<Enfermeros>();
    private static LinkedList<Administrativos> administrativo = new LinkedList<Administrativos>();
    private static LinkedList<GrupoFamiliar> familiar = new LinkedList<GrupoFamiliar>();

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

      public void Ingresar_Doctores(Doctores doctores,int dni)throws AfiliadosDIgualExcepcion
    {
        if(chofer.size()>0)
        {
            for(int i=0;i<chofer.size();i++)
            {
                if(chofer.get(i).getDocumento()==dni)
                {
                    throw new AfiliadosDIgualExcepcion();
                }
            } 
        }

            doctor.add(doctores);
           
    }
      
         public void Ingresar_Choferes(Choferes chofer1,int dni)throws AfiliadosDIgualExcepcion
    {
        if(chofer.size()>0)
        {
            for(int i=0;i<chofer.size();i++)
            {
                if(chofer.get(i).getDocumento()==dni)
                {
                    throw new AfiliadosDIgualExcepcion();
                }
            } 
        }

            chofer.add(chofer1);
           
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

    public Choferes Buscar_Chofer(int dni) {
        if(chofer.size()>0)
        {
            for(int i=0;i<chofer.size();i++)
            {
                if(chofer.get(i).getDocumento()==dni)
                {
                    return chofer.get(i);
                }
            }
            JOptionPane.showMessageDialog(null,"El chofer no existe");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Lista de afiliado vasia");
        }    
        return null;   
    }

    public Doctores Buscar_Doctor(int dni) {
 if(doctor.size()>0)
        {
            for(int i=0;i<doctor.size();i++)
            {
                if(doctor.get(i).getDocumento()==dni)
                {
                    return doctor.get(i);
                }
            }
            JOptionPane.showMessageDialog(null,"El chofer no existe");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Lista de afiliado vasia");
        }    
        return null;    }

    public Enfermeros Buscar_Enfermero(int dni) {
if(enfermero.size()>0)
        {
            for(int i=0;i<enfermero.size();i++)
            {
                if(enfermero.get(i).getDocumento()==dni)
                {
                    return enfermero.get(i);
                }
            }
            JOptionPane.showMessageDialog(null,"El chofer no existe");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Lista de afiliado vasia");
        }    
        return null;    }

    public void Ingresar_Choferes(Enfermeros enfermero1, int dni)throws AfiliadosDIgualExcepcion
            {
 if(chofer.size()>0)
        {
            for(int i=0;i<chofer.size();i++)
            {
                if(chofer.get(i).getDocumento()==dni)
                {
                    throw new AfiliadosDIgualExcepcion();
                }
            } 
        }

            enfermero.add(enfermero1);  
            }

    

    public void Ingresar_Administrativos(Administrativos administrativo1, int dni)throws AfiliadosDIgualExcepcion
            {
                if(administrativo.size()>0)
        {
            for(int i=0;i<administrativo.size();i++)
            {
                if(administrativo.get(i).getDocumento()==dni)
                {
                    throw new AfiliadosDIgualExcepcion();
                }
            } 
        }

            administrativo.add(administrativo1);      }

    public Administrativos Buscar_Administrativos(int dni) {
if(administrativo.size()>0)
        {
            for(int i=0;i<administrativo.size();i++)
            {
                if(administrativo.get(i).getDocumento()==dni)
                {
                    return administrativo.get(i);
                }
            }
            JOptionPane.showMessageDialog(null,"El chofer no existe");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Lista de afiliado vasia");
        }    
        return null;    }

    public void Ingresar_Familiar(GrupoFamiliar familiar1, int dni) throws AfiliadosDIgualExcepcion
            {
                if(familiar.size()>0)
        {
            for(int i=0;i<familiar.size();i++)
            {
                if(familiar.get(i).getDocumento()==dni)
                {
                    throw new AfiliadosDIgualExcepcion();
                }
            }
        }
                 familiar.add(familiar1);
  }

    public GrupoFamiliar Buscar_Familiar(int dni) {
        if(familiar.size()>0)
        {
            for(int i=0;i<familiar.size();i++)
            {
                if(familiar.get(i).getDocumento()==dni)
                {
                    return familiar.get(i);
                }
            }
            JOptionPane.showMessageDialog(null,"El chofer no existe");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Lista de afiliado vasia");
        }    
        return null; 
    }
    
    public void Eliminar_Afiliado(int dni)throws DocumentoIncorrectoExcepcion,ListaVaciaExcepcion
    {
        boolean bandera = false;
        if(afiliado.size()==0)
        {
            throw new ListaVaciaExcepcion();
        }

        if(afiliado.size()>0)
        {
            for(int i=0;i<afiliado.size();i++)
            {
                if(afiliado.get(i).getDocumento()==dni)
                {
                    afiliado.remove(afiliado.get(i));
                    bandera = true;
                }
            }
        }
        if(bandera==false)
        {
            throw new DocumentoIncorrectoExcepcion(); 
        }
    }
    
    public void Modificar_Afiliados(Afiliados afiliados,int dni)
    {
        if(afiliado.size()>0)
        {
            for(int i=0;i<afiliado.size();i++)
            {
                if(afiliado.get(i).getDocumento()==dni)
                {
                    afiliado.set(i, afiliados);
                }
            } 
        }
    }
    
    
      public void Eliminar_Chofer(int dni)throws DocumentoIncorrectoExcepcion,ListaVaciaExcepcion
    {
        boolean bandera = false;
        if(chofer.size()==0)
        {
            throw new ListaVaciaExcepcion();
        }

        if(chofer.size()>0)
        {
            for(int i=0;i<chofer.size();i++)
            {
                if(chofer.get(i).getDocumento()==dni)
                {
                    chofer.remove(chofer.get(i));
                    bandera = true;
                }
            }
        }
        if(bandera==false)
        {
            throw new DocumentoIncorrectoExcepcion(); 
        }
    }
    
    public void Modificar_Chofer(Choferes choferes,int dni)
    {
        if(chofer.size()>0)
        {
            for(int i=0;i<chofer.size();i++)
            {
                if(chofer.get(i).getDocumento()==dni)
                {
                    chofer.set(i, choferes);
                }
            } 
        }
    }
    
     
      public void Eliminar_Doctor(int dni)throws DocumentoIncorrectoExcepcion,ListaVaciaExcepcion
    {
        boolean bandera = false;
        if(doctor.size()==0)
        {
            throw new ListaVaciaExcepcion();
        }

        if(doctor.size()>0)
        {
            for(int i=0;i<doctor.size();i++)
            {
                if(doctor.get(i).getDocumento()==dni)
                {
                    doctor.remove(doctor.get(i));
                    bandera = true;
                }
            }
        }
        if(bandera==false)
        {
            throw new DocumentoIncorrectoExcepcion(); 
        }
    }
    
    public void Modificar_Doctor(Doctores doctores,int dni)
    {
        if(doctor.size()>0)
        {
            for(int i=0;i<doctor.size();i++)
            {
                if(doctor.get(i).getDocumento()==dni)
                {
                    doctor.set(i, doctores);
                }
            } 
        }
    }

    
    
    
    
}


