public class Tester {
    public static void main(String[] Args){
        Asignatura asi1 = new Asignatura(1);
        Asignatura asi2 = new Asignatura(2);
        Asignatura asi3 = new Asignatura(3);

        Alumno x = new Alumno(asi1, asi2, asi3);

        Profesor.ponerNotas(x);

        System.out.printf("nota1= %.2f \nnota2= %.2f \nnota3= %.2f",
                x.getAsignatura1().getCalificacion(), x.getAsignatura2().getCalificacion(),x.getasignatura3().getCalificacion());
        System.out.printf("\nmedia= %.2f",Profesor.calcularMedia(x));
    }
}
