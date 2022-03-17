public class Profesor {
    public static void ponerNotas(Alumno notas) {
       notas.getAsignatura1().setCalificacion(Math.random()*10);
       notas.getAsignatura2().setCalificacion(Math.random()*10);
       notas.getasignatura3().setCalificacion(Math.random()*10);
    }

    public static double calcularMedia (Alumno media){
        double nota1 = media.getAsignatura1().getCalificacion();
        double nota2 = media.getAsignatura2().getCalificacion();
        double nota3 = media.getasignatura3().getCalificacion();
        return (nota1+nota2+nota3)/3;
    }


}
