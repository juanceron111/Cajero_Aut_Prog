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
    
    


}
