public class Cuenta {
    public final static double LIMITE_DIARIO= 2100000;
    private long datosTitular;
    private double saldo;

    public long getDatosTitular() {
        return datosTitular;
    }

    public void setDatosTitular(long datosTitular) {
        this.datosTitular = datosTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
