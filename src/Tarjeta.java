// Clase que representa una tarjeta de débito asociada a una cuenta
public class Tarjeta {
    private Cuenta cuenta;
    private long datosTitular;
    private short clave, contadorIntentos;
    private boolean estado;

    // Constructor con los datos de tarjeta
    public Tarjeta(short clave, short contadorIntentos, Cuenta cuenta, long datosTitular, boolean estado) {
        this.clave = clave;
        this.contadorIntentos = contadorIntentos;
        this.cuenta = cuenta;
        this.datosTitular = datosTitular;
        this.estado = estado;
    }

    // Getters y setters básicos
    public Cuenta getCuenta() { return cuenta; }
    public void setCuenta(Cuenta cuenta) { this.cuenta = cuenta; }
    public long getDatosTitular() { return datosTitular; }
    public void setDatosTitular(long datosTitular) { this.datosTitular = datosTitular; }
    public short getClave() { return clave; }
    public void setClave(short clave) { this.clave = clave; }
    public short getContadorIntentos() { return contadorIntentos; }
    public void setContadorIntentos(short contadorIntentos) { this.contadorIntentos = contadorIntentos; }
    public boolean isEstado() { return estado; }
    public void setEstado(boolean estado) { this.estado = estado; }

    // Valida la clave y puede bloquear la tarjeta tras 3 intentos fallidos
    public boolean validarClave(short claveIngresada) throws ExcepcionesCajero{
        if (!estado) {
            return false;
        }

        if (claveIngresada == clave) {
            contadorIntentos = 0;
            return true;
        }

        contadorIntentos++;
        if (contadorIntentos >= 3) {
            estado = false;
        }
        return false;
    }
}
