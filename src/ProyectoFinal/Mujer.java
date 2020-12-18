
package ProyectoFinal;

/**
 *
 * @author gianm
 */
public  class Mujer {

    private int rau;
    private int edad;
    private int gestaciones;
    private int controlesMedico;
    private String fur;
    private String cirugiasPrevias;
    private String patologiasBase;
    private String Alergias;
    private String examenes;

    public Mujer(int rau, int edad, int gestaciones, int controlesMedico, String fur, String cirugiasPrevias, String patologiasBase, String Alergias, String examenes) {
        this.rau = rau;
        this.edad = edad;
        this.gestaciones = gestaciones;
        this.controlesMedico = controlesMedico;
        this.fur = fur;
        this.cirugiasPrevias = cirugiasPrevias;
        this.patologiasBase = patologiasBase;
        this.Alergias = Alergias;
        this.examenes = examenes;
    }

    public int getRau() {
        return rau;
    }

    public void setRau(int rau) {
        this.rau = rau;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getGestaciones() {
        return gestaciones;
    }

    public void setGestaciones(int gestaciones) {
        this.gestaciones = gestaciones;
    }

    public int getControlesMedico() {
        return controlesMedico;
    }

    public void setControlesMedico(int controlesMedico) {
        this.controlesMedico = controlesMedico;
    }

    public String getFur() {
        return fur;
    }

    public void setFur(String fur) {
        this.fur = fur;
    }

    public String getCirugiasPrevias() {
        return cirugiasPrevias;
    }

    public void setCirugiasPrevias(String cirugiasPrevias) {
        this.cirugiasPrevias = cirugiasPrevias;
    }

    public String getPatologiasBase() {
        return patologiasBase;
    }

    public void setPatologiasBase(String patologiasBase) {
        this.patologiasBase = patologiasBase;
    }

    public String getAlergias() {
        return Alergias;
    }

    public void setAlergias(String Alergias) {
        this.Alergias = Alergias;
    }

    public String getExamenes() {
        return examenes;
    }

    public void setExamenes(String examenes) {
        this.examenes = examenes;
    }

    @Override
    public String toString() {
        return "Mujer{" + "rau=" + rau + ", edad=" + edad + ", gestaciones=" + gestaciones + ", controlesMedico=" + controlesMedico + ", fur=" + fur + ", cirugiasPrevias=" + cirugiasPrevias + ", patologiasBase=" + patologiasBase + ", Alergias=" + Alergias + ", examenes=" + examenes + '}';
    }
    
    

    

   
    
}
