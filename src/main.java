public class main {
    public static void main(String[] args) {
        Banco banco = new Banco("BBVA");
        System.out.println("bienvenido al banco "+banco.getNombre());
        Cliente cliente1 = new Cliente(1234, "Juan");
        Cliente cliente2 = new Cliente(9999, "Maria");
        Cuenta cuenta1 = new Cuenta(cliente1.getDni());
        Cuenta cuenta2 = new Cuenta(cliente2.getDni(),1200000);
        
    }
}
