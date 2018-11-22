
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
    private static LinkedList<Moviles> moviles = new LinkedList<Moviles>();
    private static LinkedList<RegistroPago> registro = new LinkedList<RegistroPago>();
    private static LinkedList<Solicitud> solicitud = new LinkedList<Solicitud>();
    private static LinkedList<Registro> result = new LinkedList<Registro>();

    
    
    
    
    public void verificar_documentos(long documento,int longitud)throws verificar_documentosExcepcion
    {
        if(documento<1 || documento>99999999 || longitud!=8)
        {
            throw new verificar_documentosExcepcion();
        }
    }
    
    
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
    public Afiliados Buscar_Afiliado(int dni)throws AfiliadoNoExistenteExcepcion, ListaVaciaExcepcion
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
            throw new AfiliadoNoExistenteExcepcion();
        //    JOptionPane.showMessageDialog(null,"El afiliado no existe");
        }
        else
        {
            throw new ListaVaciaExcepcion();
        //    JOptionPane.showMessageDialog(null,"Lista de afiliado vacia");
        }    
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
    
    
     public void Modificar_Afiliados(Afiliados afiliados,int dni) throws ListaVaciaExcepcion, AfiliadoNoExistenteExcepcion
    {
        if(afiliado.size()==0){
       throw new ListaVaciaExcepcion();
        }
        if(afiliado.size()>0)
        {
            for(int i=0;i<afiliado.size();i++)
            {
                if(afiliado.get(i).getDocumento()==dni)
                {
                    afiliado.set(i, afiliados);
                }
                
            } 
        }else{
            throw new AfiliadoNoExistenteExcepcion();
        }
    }
    
     
     public LinkedList Mostrar_Afiliados() throws ListaVaciaExcepcion{
         if(afiliado.size()==0){
             throw new ListaVaciaExcepcion();
         }
         return afiliado;
     }
     
    //doctores
    //ingresar doctores
      public void Ingresar_Doctores(Doctores doctores,int dni)throws DoctoresIgualExcepcion
    {
        if(chofer.size()>0)
        {
            for(int i=0;i<chofer.size();i++)
            {
                if(chofer.get(i).getDocumento()==dni)
                {
                    throw new DoctoresIgualExcepcion();
                }
            } 
        }

            doctor.add(doctores);
           
    }
      
      
      public Doctores Buscar_Doctor(int dni)throws DoctorNoExistenteExcepcion, ListaVaciaExcepcion {
 if(doctor.size()>0)
        {
            for(int i=0;i<doctor.size();i++)
            {
                if(doctor.get(i).getDocumento()==dni)
                {
                    return doctor.get(i);
                }
            }
            throw new DoctorNoExistenteExcepcion();
            //JOptionPane.showMessageDialog(null,"El chofer no existe");
        }
        else
        {
            throw new ListaVaciaExcepcion();
          //  JOptionPane.showMessageDialog(null,"Lista de afiliado vasia");
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
    
    public void Modificar_Doctor(Doctores doctores,int dni) throws ListaVaciaExcepcion, DoctorNoExistenteExcepcion
    {
        if(afiliado.size()==0){
        throw new ListaVaciaExcepcion();
     }
        if(doctor.size()>0)
        {
            for(int i=0;i<doctor.size();i++)
            {
                if(doctor.get(i).getDocumento()==dni)
                {
                    doctor.set(i, doctores);
                }
            } 
        }else {
            throw new DoctorNoExistenteExcepcion();
        }
    }
    
    
    public LinkedList Mostrar_Doctor() throws ListaVaciaExcepcion{
        if(doctor.size()==0){
            throw new ListaVaciaExcepcion();
        }
         return doctor;
     }
    
    
      
         public void Ingresar_Choferes(Choferes chofer1,int dni)throws ChoferesIgualExcepcion
    {
        if(chofer.size()>0)
        {
            for(int i=0;i<chofer.size();i++)
            {
                if(chofer.get(i).getDocumento()==dni)
                {
                    throw new ChoferesIgualExcepcion();
                }
            } 
        }

            chofer.add(chofer1);
           
    }
    
         
    //buscar choferes
         
         public void Modificar_Chofer(Choferes choferes,int dni) throws ListaVaciaExcepcion, ChoferesNoExisteExcepcion
    {
        if(afiliado.size()==0){
            throw new ListaVaciaExcepcion();
        }
        if(chofer.size()>0)
        {
            for(int i=0;i<chofer.size();i++)
            {
                if(chofer.get(i).getDocumento()==dni)
                {
                    chofer.set(i, choferes);
                }
            } 
        }else{
            throw new ChoferesNoExisteExcepcion();
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

    public Choferes Buscar_Chofer(int dni) throws ListaVaciaExcepcion,ChoferesNoExisteExcepcion {
        if(chofer.size()>0)
        {
            for(int i=0;i<chofer.size();i++)
            {
                if(chofer.get(i).getDocumento()==dni)
                {
                    return chofer.get(i);
                }
            }
            throw new ChoferesNoExisteExcepcion();
          //  JOptionPane.showMessageDialog(null,"El chofer no existe");
        }
        else
        {
            throw new ListaVaciaExcepcion();
         //   JOptionPane.showMessageDialog(null,"Lista de afiliado vasia");
        }    
         
    }

     public void Ingresar_Enfermero(Enfermeros enfermero1, int dni)throws EnfermeroIgualExcepcion
            {
 if(chofer.size()>0)
        {
            for(int i=0;i<chofer.size();i++)
            {
                if(chofer.get(i).getDocumento()==dni)
                {
                    throw new EnfermeroIgualExcepcion();
                }
            } 
        }

            enfermero.add(enfermero1);  
            }
     
     
     public LinkedList Mostrar_Chofer() throws ListaVaciaExcepcion{
         if(chofer.size()>0){
             throw new ListaVaciaExcepcion();
         }
         return chofer;
     }
     

    public Enfermeros Buscar_Enfermero(int dni)throws EnfermeroNoExistenteExcepcion, ListaVaciaExcepcion {
if(enfermero.size()>0)
        {
            for(int i=0;i<enfermero.size();i++)
            {
                if(enfermero.get(i).getDocumento()==dni)
                {
                    return enfermero.get(i);
                }
            }
            throw new EnfermeroNoExistenteExcepcion();
           // JOptionPane.showMessageDialog(null,"El chofer no existe");
        }
        else
        {
            throw new ListaVaciaExcepcion();
        //    JOptionPane.showMessageDialog(null,"Lista de afiliado vasia");
        }    
    }

     public void Eliminar_Enfermero(int dni)throws DocumentoIncorrectoExcepcion,ListaVaciaExcepcion
    {
        boolean bandera = false;
        if(enfermero.size()==0)
        {
            throw new ListaVaciaExcepcion();
        }

        if(enfermero.size()>0)
        {
            for(int i=0;i<enfermero.size();i++)
            {
                if(enfermero.get(i).getDocumento()==dni)
                {
                    enfermero.remove(enfermero.get(i));
                    bandera = true;
                }
            }
        }
        if(bandera==false)
        {
            throw new DocumentoIncorrectoExcepcion(); 
        }
    }
    
    public void Modificar_Enfermero(Enfermeros enfermeros,int dni) throws ListaVaciaExcepcion, EnfermeroNoExistenteExcepcion
    {
        if(enfermero.size()==0){
            throw new ListaVaciaExcepcion();
        }
        if(enfermero.size()>0)
        {
            for(int i=0;i<enfermero.size();i++)
            {
                if(enfermero.get(i).getDocumento()==dni)
                {
                    enfermero.set(i, enfermeros);
                }
            } 
        }else{
            throw new EnfermeroNoExistenteExcepcion();
        }
    }
    
     public void Modificar_Enfermero(Moviles movil,String Patente) throws ListaVaciaExcepcion, EnfermeroNoExistenteExcepcion
    {
        if(enfermero.size()==0){
            throw new ListaVaciaExcepcion();
        }
        if(moviles.size()>0)
        {
            for(int i=0;i<moviles.size();i++)
            {
                if(moviles.get(i).getPatente().equals(movil))
                {
                    moviles.set(i, movil);
                }
            } 
        }else{
            throw new EnfermeroNoExistenteExcepcion();
        }
    }
     
     public LinkedList Mostrar_Enfermero() throws ListaVaciaExcepcion{
         if(enfermero.size()==0){
             throw new ListaVaciaExcepcion();
         }
         return enfermero;
     }

    
//  administractivo
    //ingresar administrativo
    public void Ingresar_Administrativos(Administrativos administrativo1, int dni)throws AdministrativosIgualExcepcion
            {
                if(administrativo.size()>0)
        {
            for(int i=0;i<administrativo.size();i++)
            {
                if(administrativo.get(i).getDocumento()==dni)
                {
                    throw new AdministrativosIgualExcepcion();
                }
            } 
        }

            administrativo.add(administrativo1);      }

    
    //buscar administractivos
 public Administrativos Buscar_Administrativos(int dni)throws AdministrativoNoExistenteExcepcion, ListaVaciaExcepcion{
        if(administrativo.size()>0)
        {
            for(int i=0;i<administrativo.size();i++)
            {
                if(administrativo.get(i).getDocumento()==dni)
                {
                    return administrativo.get(i);
                }
            }
            throw new AdministrativoNoExistenteExcepcion();
          //  JOptionPane.showMessageDialog(null,"El chofer no existe");
        }
        else
        {
         throw new ListaVaciaExcepcion();
       //     JOptionPane.showMessageDialog(null,"Lista de afiliado vasia");
        }    
 }
    
    
    public LinkedList Mostrar_Administrativo() throws ListaVaciaExcepcion{
        if(administrativo.size()==0){
            throw new ListaVaciaExcepcion();
        }
         return administrativo;
     }
    

    public void Ingresar_Familiar(GrupoFamiliar familiar1, int dni) throws GrupoFamiliarIgualExcepcion
            {
                if(familiar.size()>0)
        {
            for(int i=0;i<familiar.size();i++)
            {
                if(familiar.get(i).getDocumento()==dni)
                {
                    throw new GrupoFamiliarIgualExcepcion();
                }
            }
        }
                 familiar.add(familiar1);
  }

    
    //buscar grupo familiar
    
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
         //   JOptionPane.showMessageDialog(null,"El chofer no existe");
        }
        else
        {
        //    JOptionPane.showMessageDialog(null,"Lista de afiliado vasia");
        }    
        return null;
    }
    

    
      public void Eliminar_Familiar(int dni)throws DocumentoIncorrectoExcepcion,ListaVaciaExcepcion
    {
        boolean bandera = false;
        if(familiar.size()==0)
        {
            throw new ListaVaciaExcepcion();
        }

        if(familiar.size()>0)
        {
            for(int i=0;i<familiar.size();i++)
            {
                if(familiar.get(i).getDocumento()==dni)
                {
                    familiar.remove(familiar.get(i));
                    bandera = true;
                }
            }
        }
        if(bandera==false)
        {
            throw new DocumentoIncorrectoExcepcion(); 
        }
    }
    
    public void Modificar_Familiar(GrupoFamiliar familiar1,int dni)
    {
        if(familiar.size()>0)
        {
            for(int i=0;i<familiar.size();i++)
            {
                if(familiar.get(i).getDocumento()==dni)
                {
                    familiar.set(i, familiar1);
                }
            } 
        }
    }
    
    //movil
    public void Ingresar_Movil(Moviles movil,String pant)throws MovilesIgualExcepcion
    {  
        
        if(moviles.size()>0)
        {
            for(int i=0;i<moviles.size();i++)
            {
                if(moviles.get(i).getPatente().equals(pant))
                {
                    throw new MovilesIgualExcepcion();
                }
            } 
        }
        moviles.add(movil);
    }

     
     
     
    public Moviles Buscar_Movil(String patente) throws MovilNoExistenteExcepcion, ListaVaciaExcepcion
    {
        if(moviles.size()>0)
        {
            for(int i=0;i<moviles.size();i++)
            {
                if(moviles.get(i).getPatente().equals(patente))
                {
                    return moviles.get(i);
                }
            }throw new MovilNoExistenteExcepcion();
        //    JOptionPane.showMessageDialog(null,"El movil no existe");
        }
        else
        {
            throw new ListaVaciaExcepcion();
         //   JOptionPane.showMessageDialog(null,"Lista de movil vacia");
        }    
    } 
    
    
    
    public void Eliminar_Movil(String Patente)throws PatenteIncorrectoExcepcion,ListaVaciaExcepcion
    {
        boolean bandera = false;
        if(moviles.size()==0)
        {
            throw new ListaVaciaExcepcion();
        }

        if(moviles.size()>0)
        {
            for(int i=0;i<moviles.size();i++)
            {
                if(moviles.get(i).getPatente().equals(Patente))
                {
                    moviles.remove(moviles.get(i));
                    bandera = true;
                }
            }
        }
        if(bandera==false)
        {
            throw new PatenteIncorrectoExcepcion(); 
        }
    }
    
    public void Modificar_Movil(Moviles movil,String patente) throws ListaVaciaExcepcion, MovilNoExistenteExcepcion
    {
        if(moviles.size()==0){
            throw new ListaVaciaExcepcion();
        }
        if(moviles.size()>0)
        {
            for(int i=0;i<moviles.size();i++)
            {
                if(moviles.get(i).getPatente().equals(patente))
                {
                    moviles.set(i, movil);
                }
            } 
        }else{
            throw new MovilNoExistenteExcepcion();
        }
    }
    
    public LinkedList Mostrar_Movil() throws ListaVaciaExcepcion{
        if(moviles.size()==0){
            throw new ListaVaciaExcepcion();
        }
         return moviles;
     }
    
    
    //metodo pago
    
    public void Registar_pago(RegistroPago primer,int dni)throws Afiliado_Pago_Igual_Excepcion
    {
        if(registro.size()>0)
        {
            for(int i=0;i<registro.size();i++)
            {
                if(registro.get(i).getDni()==dni)
                {
                    throw new Afiliado_Pago_Igual_Excepcion();
                }
            } 
        }

            registro.add(primer);
           
    }
    
    public RegistroPago Buscar_Pago(int dni)
    {
        if(registro.size()>0)
        {
            for(int i=0;i<registro.size();i++)
            {
                if(registro.get(i).getDni()==dni)
                {
                    return registro.get(i);
                }
            }
          //  JOptionPane.showMessageDialog(null,"El afiliado no existe");
        }
        else
        {
       //     JOptionPane.showMessageDialog(null,"Lista de afiliado vasia");
        }    
        return null;
    }
    
    public void Ingresar_Pago(RegistroPago pago,String mes,int dni) throws ListaVaciaExcepcion, DocumentoIncorrectoExcepcion
    { 
        if(registro.size()==0){
            throw new ListaVaciaExcepcion();
        }
        if(registro.size()>0)
        {
            for(int i=0;i<registro.size();i++)
            {
                if(registro.get(i).getDni()==dni)
                {
                    registro.set(i, pago);
                }
            } 
        }else{
        throw new DocumentoIncorrectoExcepcion();
        }
    }
    
    public LinkedList Mostrar_Pago() throws ListaVaciaExcepcion{
        if(registro.size()==0){
            throw new ListaVaciaExcepcion();
        }
        return registro;
     }
    
    
    public void Ingresar_Solicitud(Solicitud solic)
    {
            solicitud.add(solic);
           
    }
    
    public Solicitud Buscar_Solicitud(int dni)throws SolicitudNoExistente, ListaVaciaExcepcion
    {
        if(solicitud.size()>0)
        {
            for(int i=0;i<solicitud.size();i++)
            {
                if(solicitud.get(i).getDni()==dni)
                {
                    return solicitud.get(i);
                }
            }
            throw new SolicitudNoExistente();
        //    JOptionPane.showMessageDialog(null,"El afiliado no existe");
        }
        else
        {
            throw new ListaVaciaExcepcion(); 
       //     JOptionPane.showMessageDialog(null,"Lista de afiliado vacia");
        }    
    } 
    
    public LinkedList Mostrar_Solicitud() throws ListaVaciaExcepcion{
        if(solicitud.size()>0){
            throw new ListaVaciaExcepcion();
        }
        return solicitud;
     }
    
    public void Ingresar_Resultado(Registro registro,int dni)throws Registro_IgualExcepcion, ListaVaciaExcepcion, RegistroNoExistenteExcepcion
    {
        if(result.size()>0){
            throw new ListaVaciaExcepcion();
        }
        if(result.size()>0)
        {
            for(int i=0;i<result.size();i++)
            {
                if(result.get(i).getDni()==dni);
                {
                    throw new Registro_IgualExcepcion();
                }
            } 
        }else{
            throw new RegistroNoExistenteExcepcion();
        }
            result.add(registro);
           
    }

    public void Eliminar_Administrativos(int dni) throws ListaVaciaExcepcion, PatenteIncorrectoExcepcion {
         boolean bandera = false;
        if(administrativo.size()==0)
        {
            throw new ListaVaciaExcepcion();
        }
        if(administrativo.size()>0)
        {
            for(int i=0;i<administrativo.size();i++)
            {
                if(administrativo.get(i).getDocumento()==dni)
                {
                    administrativo.remove(administrativo.get(i));
                    bandera = true;
                }
            }
        }
        if(bandera==false)
        {
            throw new PatenteIncorrectoExcepcion(); 
        }
    }
}
    
   


