package banco;

import java.util.Scanner;

// Clase que maneja el banco y el menú
public class Banco {
    private Cuenta cuenta;

    public Banco(double saldoInicial) {
        cuenta = new Cuenta(saldoInicial);
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n          MENÚ DE OPCIONES");
            System.out.println(" = = = = = = = = = = = = = = = = = = ");
            System.out.println("|                                   |");
            System.out.println("|  1. Retirar Dinero                |");
            System.out.println("|  2. Ingresar Dinero               |");
            System.out.println("|  3. Consultar Saldos Disponible   |");
            System.out.println("|  4. Transferencias                |");
            System.out.println("|  5. Finalizar Sesión              |");
            System.out.println("|                                   |");
            System.out.println(" = = = = = = = = = = = = = = = = = = ");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    realizarRetiro(scanner);
                    break;
                case 2:
                    realizarIngreso(scanner);
                    break;
                case 3:
                    consultarSaldo();
                    break;
                case 4:
                    realizarTransferencia(scanner);
                    break;
                case 5:
                    System.out.println("Gracias por usar banco CodeX5.");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente nuevamente.");
            }
        } while (opcion != 5);


    }

    private void realizarRetiro(Scanner scanner) {
        System.out.print("Indique el monto a retirar: ");
        double retiro = scanner.nextDouble();
        cuenta.retirar(retiro);
    }

    private void realizarIngreso(Scanner scanner) {
        System.out.print("Indique el monto a ingresar: ");
        double ingreso = scanner.nextDouble();
        cuenta.ingresar(ingreso);
    }

    private void consultarSaldo() {
        System.out.println("Su saldo actual en la cuenta es de: $" + cuenta.getSaldo());
    }

    private void realizarTransferencia(Scanner scanner) {
        System.out.print("Ingrese el CBU/CVU o Alias de la cuenta del destinatario: ");
        String alias = scanner.next(); // Alias de la cuenta
        System.out.print("Ingrese el monto a transferir: ");
        double montoTransferencia = scanner.nextDouble();
        cuenta.transferir(montoTransferencia, alias);
    }
}
