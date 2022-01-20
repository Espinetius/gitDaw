public class Asignatura {
    private int identificador;
    private double calificacion;
    public Asignatura(int ide) {
        identificador=ide;
        calificacion=0;
    }
    //-----------getter y setters----------
    public int getIdentificador() {return identificador;}
    public double getCalificacion() {return calificacion;}
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}
