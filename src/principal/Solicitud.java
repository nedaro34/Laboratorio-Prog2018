/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author alumno
 */
public class Solicitud extends AsistenciaMedica{
    
    private String nombre;
    private int dni;
    private String fecha;
    private String hora;
    private Afiliados afiliado;
    private Doctores doctor;
    private Enfermeros enfermero;
    private Choferes chofer;
    private Administrativos administrativo;
    private Moviles movil;

    public Solicitud(String nombre, int dni, String fecha, String hora, Afiliados afiliado, Doctores doctor, Enfermeros enfermero, Choferes chofer, Administrativos administrativo, Moviles movil) {
        this.nombre = nombre;
        this.dni = dni;
        this.fecha = fecha;
        this.hora = hora;
        this.afiliado = afiliado;
        this.doctor = doctor;
        this.enfermero = enfermero;
        this.chofer = chofer;
        this.administrativo = administrativo;
        this.movil = movil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Afiliados getAfiliado() {
        return afiliado;
    }

    public void setAfiliado(Afiliados afiliado) {
        this.afiliado = afiliado;
    }

    public Doctores getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctores doctor) {
        this.doctor = doctor;
    }

    public Enfermeros getEnfermero() {
        return enfermero;
    }

    public void setEnfermero(Enfermeros enfermero) {
        this.enfermero = enfermero;
    }

    public Choferes getChofer() {
        return chofer;
    }

    public void setChofer(Choferes chofer) {
        this.chofer = chofer;
    }

    public Administrativos getAdministrativo() {
        return administrativo;
    }

    public void setAdministrativo(Administrativos administrativo) {
        this.administrativo = administrativo;
    }

    public Moviles getMovil() {
        return movil;
    }

    public void setMovil(Moviles movil) {
        this.movil = movil;
    }
    
    
}
