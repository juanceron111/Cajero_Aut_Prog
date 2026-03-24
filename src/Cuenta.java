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

    public Cuenta(long datosTitular, double saldo) {
        this.datosTitular = datosTitular;
        this.saldo = saldo;
    }

    public boolean retirar(int monto) {
        if (monto > LIMITE_DIARIO) {
            System.out.println("El monto excede el límite diario.");
            return false;
        }
        if (monto > saldo) {
            System.out.println("Fondos insuficientes.");
            return false;
        }
        saldo -= monto;
        return true;
    }

    public boolean consignar(int monto) {
        if (monto > LIMITE_DIARIO) {
            System.out.println("El monto excede el límite diario.");
            return false;
        }
        saldo += monto;
        return true;
    }

    public long verSaldo() {
        return (long) saldo;
    }
}
