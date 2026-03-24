public class Cuenta {
    public double LIMITE_DIARIO = 2100000; // Límite diario de retiro
    private long datosTitular;
    private double saldo;
    private Tarjeta tarjeta;

    // getters y setters
    public long getDatosTitular() {
        return this.datosTitular;
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

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    // Constructor
    public Cuenta(long datosTitular, double saldo) {
        this.datosTitular = datosTitular;
        this.saldo = saldo;
    }
    public Cuenta(long datosTitular) {
        this.datosTitular = datosTitular;
    }
    
    // Realiza un retiro validando límite diario y fondos disponibles
    public boolean retirar(double monto) {
        if (monto > LIMITE_DIARIO) {
            System.out.println("El monto excede el límite diario.");
            return false;
        }
        if (monto > saldo) {
            System.out.println("Fondos insuficientes.");
            return false;
        }
        this.LIMITE_DIARIO-=monto;
        this.saldo -= monto;

        return true;
    }

    // Realiza una consignación validando que el monto sea positivo
    public boolean consignar(double monto) throws ExcepcionesCajero{
        if (monto>1) {
            this.saldo += monto;
        }else{
            throw new ExcepcionesCajero("No se puede agregar saldo negativo");
        }
        return true;
    }

    public long verSaldo() {
        return (long) saldo;
    }
}