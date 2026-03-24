import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private long dni;
    private ArrayList<Cuenta> cuentas;

    public Cliente(long dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.cuentas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }
    public Cuenta getCuentaperNum(long n){
        Cuenta nn=null;
        for (Cuenta cuentaM : cuentas) {
            if (cuentaM.getDatosTitular()==n) {
                nn=cuentaM;
            }
        }
        return nn;
    }
    public void addCuenta(Cuenta cuenta) {
        this.cuentas.add(cuenta);
    }



}
