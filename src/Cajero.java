
import java.util.ArrayList;

public class Cajero {
    private long reservaDinero;
    private Banco banco;
    private Cuenta cuenta;

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

    public boolean validarCuenta(long dni, long numCuenta, short clave)throws ExcepcionesCajero {
        ArrayList<Cuenta> cuentas=null;
        try {
            cuentas=this.banco.gestionarCuentas(dni); 
        } catch (Exception e) {
            System.out.println("No se encuentra registrado en el sistema o ingreso un DNI erroneo");
        }
        //buscar la cuenta para la tarjeta
        Tarjeta tarjeta;
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getDatosTitular()==numCuenta) {
                tarjeta=cuenta.getTarjeta();
            }
        }
        boolean validacion= false;
        int i=0;
        try {
            while (validacion==false || i>2) {
                validacion=tarjeta.validarClave;
                i++;
            }
        } catch (ExcepcionesCajero e) {
            System.out.println(e.getMessage());
        }
        if(validacion==true){
            this.cuenta=cuenta;
        }
        
        return validacion;
        
    }
    public boolean retirar(double monto){
        boolean val=true;
        if (monto<reservaDinero) {
            val=cuenta.retirar(monto);
            reservaDinero-=monto;
        }
        return val;
    }
    public boolean consignar(double monto){
        boolean val=true;
        try {
            val=cuenta.consignar(monto);
            reservaDinero+=monto;
        } catch (ExcepcionesCajero ex) {
           System.out.println(ex.getMessage());
        }
        
        return val;
    }
    public double verSaldo(){
        return cuenta.getSaldo();
    }

}
