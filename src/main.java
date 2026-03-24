import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Banco banco = new Banco("BBVA");
        System.out.println("bienvenido al banco "+banco.getNombre());
        Cliente cliente1 = new Cliente(1234, "Juan");
        banco.addCliente(cliente1);
        Cliente cliente2 = new Cliente(9999, "Maria");
        banco.addCliente(cliente2);
        Cuenta cuenta1 = new Cuenta(cliente1.getDni());
        cliente1.addCuenta(cuenta1);
        Cuenta cuenta2 = new Cuenta(cliente2.getDni(),1200000);
        cliente2.addCuenta(cuenta2);
        Tarjeta tarjeta1 = new Tarjeta((short) 1234, (short)0, cuenta1, 1246, false);
        cuenta1.setTarjeta(tarjeta1);
        Tarjeta tarjeta2 = new Tarjeta((short) 1111, (short)0, cuenta2, 6666, false);
        cuenta2.setTarjeta(tarjeta2);

        Cajero cajero= new Cajero(banco, 200000000);


        System.out.print("Ingrese su numero de identificacion: ");
        long dni = Long.parseLong(sc.nextLine());

        System.out.print("Ingrese su número de cuenta: ");
        long cuenta = Long.parseLong(sc.nextLine());

        System.out.print("Ingrese su saldo inicial: ");
        double saldo = sc.nextDouble();
        int opcion;

        do {
            // Menú
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Retirar");
            System.out.println("2. Consignar");
            System.out.println("3. Ver saldo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese monto a retirar: ");
                    double retiro = sc.nextDouble();

                    if (retiro <= saldo) {
                        saldo -= retiro;
                        System.out.println("Retiro exitoso");
                    } else {
                        System.out.println("Saldo insuficiente");
                    }
                    break;

                case 2:
                    System.out.print("Ingrese monto a consignar: ");
                    double consignacion = sc.nextDouble();

                    saldo += consignacion;
                    System.out.println("Consignación exitosa");
                    break;

                case 3:
                    System.out.println("Su saldo es: " + saldo);
                    break;

                case 4:
                    System.out.println("Gracias por usar el cajero");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 4);

        sc.close();
    }
}

