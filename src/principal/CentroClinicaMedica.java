
package principal;


public class CentroClinicaMedica {
    
    private AsistenciaMedica asistenciamedica;
    private Doctores doctores;
    private Enfermeros enfermeros;
    private Administrativos administrativos;
    private Choferes choferes;
    private Afiliados afiliados;
    private GrupoFamiliar grupo;
    private Moviles moviles;
    
    AsistenciaMedica asistencia = new AsistenciaMedica(/*Doctor,Diagnostico,Chofer,Enfermero,Afiliado*/);
    

    /**
     * @return the asistenciamedica
     */
    public AsistenciaMedica getAsistenciamedica() {
        return asistenciamedica;
    }

    /**
     * @param asistenciamedica the asistenciamedica to set
     */
    public void setAsistenciamedica(AsistenciaMedica asistenciamedica) {
        this.asistenciamedica = asistenciamedica;
    }

    /**
     * @return the doctores
     */
    public Doctores getDoctores() {
        return doctores;
    }

    /**
     * @param doctores the doctores to set
     */
    public void setDoctores(Doctores doctores) {
        this.doctores = doctores;
    }

    /**
     * @return the enfermeros
     */
    public Enfermeros getEnfermeros() {
        return enfermeros;
    }

    /**
     * @param enfermeros the enfermeros to set
     */
    public void setEnfermeros(Enfermeros enfermeros) {
        this.enfermeros = enfermeros;
    }

    /**
     * @return the administrativos
     */
    public Administrativos getAdministrativos() {
        return administrativos;
    }

    /**
     * @param administrativos the administrativos to set
     */
    public void setAdministrativos(Administrativos administrativos) {
        this.administrativos = administrativos;
    }

    /**
     * @return the choferes
     */
    public Choferes getChoferes() {
        return choferes;
    }

    /**
     * @param choferes the choferes to set
     */
    public void setChoferes(Choferes choferes) {
        this.choferes = choferes;
    }

    /**
     * @return the afiliados
     */
    public Afiliados getAfiliados() {
        return afiliados;
    }

    /**
     * @param afiliados the afiliados to set
     */
    public void setAfiliados(Afiliados afiliados) {
        this.afiliados = afiliados;
    }

    /**
     * @return the grupo
     */
    public GrupoFamiliar getGrupo() {
        return grupo;
    }

    /**
     * @param grupo the grupo to set
     */
    public void setGrupo(GrupoFamiliar grupo) {
        this.grupo = grupo;
    }

    /**
     * @return the moviles
     */
    public Moviles getMoviles() {
        return moviles;
    }

    /**
     * @param moviles the moviles to set
     */
    public void setMoviles(Moviles moviles) {
        this.moviles = moviles;
    }
    
    
    
    

}
