public class Cajero {
    private long reservaDinero;
    private Banco banco;

    public Cajero(Banco banco, long reservaDinero) {
        this.banco = banco;
        this.reservaDinero = reservaDinero;
    }

    public long getReservaDinero() {
        return reservaDinero;
    }

    public void setReservaDinero(long reservaDinero) {
        this.reservaDinero = reservaDinero;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }



}
