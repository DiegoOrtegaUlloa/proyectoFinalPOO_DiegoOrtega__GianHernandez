
package ProyectoFinal;

/**
 *
 * @author gianm
 */
public class PacienteGinecologica extends Mujer{
    
    private String patologiaGine;
    private String tratamiento;
    

    public PacienteGinecologica(String patologiaGine, String tratamiento, int rau, int edad, int gestaciones, int controlesMedico, String fur, String cirugiasPrevias, String patologiasBase, String Alergias, String examenes) {
        super(rau, edad, gestaciones, controlesMedico, fur, cirugiasPrevias, patologiasBase, Alergias, examenes);
        this.patologiaGine = patologiaGine;
        this.tratamiento = tratamiento;
    }

    public String getPatologiaGine() {
        return patologiaGine;
    }

    public void setPatologiaGine(String patologiaGine) {
        this.patologiaGine = patologiaGine;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    @Override
    public String toString() {
        return "PacienteGinecologica{" + "patologiaGine=" + patologiaGine + ", tratamiento=" + tratamiento + '}';
    }
    
    
    
}
