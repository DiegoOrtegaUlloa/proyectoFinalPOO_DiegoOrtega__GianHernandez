
package ProyectoFinal;

/**
 *
 * @author gianm
 */
public class PacienteObstetrica extends Mujer{
    private String aco;
    private int edadGestacional;
    private String controlMatrona;

    public PacienteObstetrica(String aco, int edadGestacional, String controlMatrona, int rau, int edad, int gestaciones, int controlesMedico, String fur, String cirugiasPrevias, String patologiasBase, String Alergias, String examenes) {
        super(rau, edad, gestaciones, controlesMedico, fur, cirugiasPrevias, patologiasBase, Alergias, examenes);
        this.aco = aco;
        this.edadGestacional = edadGestacional;
        this.controlMatrona = controlMatrona;
    }

    public String getAco() {
        return aco;
    }

    public void setAco(String aco) {
        this.aco = aco;
    }

    public int getEdadGestacional() {
        return edadGestacional;
    }

    public void setEdadGestacional(int edadGestacional) {
        this.edadGestacional = edadGestacional;
    }

    public String getControlMatrona() {
        return controlMatrona;
    }

    public void setControlMatrona(String controlMatrona) {
        this.controlMatrona = controlMatrona;
    }

    @Override
    public String toString() {
        return "PacienteObstetrica{" + "aco=" + aco + ", edadGestacional=" + edadGestacional + ", controlMatrona=" + controlMatrona + '}';
    }
    
    
    
     
   
    

    
    
}
