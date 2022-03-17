public class CuentaCorriente {
    private Titular titular;
    private String cuenta_corriente;
    private double saldo;

    public CuentaCorriente(Titular titular, String cuenta_corriente, double saldo) {
        this.titular=titular;
        this.cuenta_corriente=cuenta_corriente;
        this.saldo= 15.3;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public String getCuenta_corriente() {
        return cuenta_corriente;
    }

    public void setCuenta_corriente(String cuenta_corriente) {
        this.cuenta_corriente = cuenta_corriente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
