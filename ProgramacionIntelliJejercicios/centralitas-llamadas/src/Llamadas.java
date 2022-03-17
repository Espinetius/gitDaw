import java.util.Arrays;

public class Llamadas {
    protected Llamada[] arrayllamadas;
    public Llamadas(Llamada[] arrayllamadas) {
        this.arrayllamadas=arrayllamadas;
    }
    public Llamadas() {
        arrayllamadas= new Llamada[5];
        for (int i = 0; i< arrayllamadas.length; i++) {
            if (i%2==0) {
                arrayllamadas[i]= new Local();
            } else {
                arrayllamadas[i]= new Provincial();
            }
        }
    }
    public void infollamadas() {
        for (int i = 0; i < arrayllamadas.length; i++) {
            System.out.println(arrayllamadas[i]);
        }
    }
    public void preciollamadas() {
        for (int i = 0; i < arrayllamadas.length; i++) {
            System.out.println(arrayllamadas[i].precio());
        }

    }

    @Override
    public String toString() {
        return "Llamadas:" +
                "\narrayllamadas=" + Arrays.toString(arrayllamadas);
    }
}
