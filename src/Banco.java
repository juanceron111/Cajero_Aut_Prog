import java.util.ArrayList;

public class Banco {
    private String nombre;
    private ArrayList<Cliente> clientes;

    public Banco(String nombre) {
        this.clientes = new ArrayList<>();
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public void addCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    public Cliente getClienpernumber(long n){
        Cliente nn=null;
        for (Cliente clientem : clientes) {
            if (clientem.getDni()==n) {
                nn=clientem;
            }
        }
        return nn;
    }
    public ArrayList<Cuenta> gestionarCuentas(long dni){
        ArrayList<Cuenta> cuentasDni=null;
        for (Cliente cliente : clientes) {
            if(cliente.getDni()==dni){
                cuentasDni=cliente.getCuentas();
            }
        }
        return cuentasDni;
    }


}
