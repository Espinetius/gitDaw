public class Alumno {
    private final Asignatura asignatura1;
    private final Asignatura asignatura2;
    private final Asignatura asignatura3;

    public Alumno(Asignatura asi1, Asignatura asi2, Asignatura asi3){
        asignatura1=new Asignatura(asi1.getIdentificador());
        asignatura2=new Asignatura(asi2.getIdentificador());
        asignatura3=new Asignatura(asi3.getIdentificador());
    }
    public Alumno(int asi1, int asi2, int asi3) {
        asignatura1=new Asignatura(asi1);
        asignatura2=new Asignatura(asi2);
        asignatura3=new Asignatura(asi3);
    }
    //---------getter---------
    public Asignatura getAsignatura1() { return asignatura1; }
    public Asignatura getAsignatura2() {
        return asignatura2;
    }
    public Asignatura getasignatura3() {
        return asignatura3;
    }
}
