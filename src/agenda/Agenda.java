package agenda;

import java.util.Scanner;

public class Agenda {
    private Contacto[] agenda;
    private int capacidad;
    private Scanner scanner;

    public Agenda(int capacidad) {
        this.capacidad = capacidad;
        agenda = new Contacto[capacidad];
        scanner = new Scanner(System.in);
    }

    // Método para verificar si el teléfono contiene solo dígitos
    private boolean verificarEsNumero(String telefono) {
        return telefono.matches("\\d+");
    }

    // Método para agregar un contacto
    public void agregarContacto() {
        int index = buscarPosicionLibre();
        if (index == -1) {
            System.out.println("La agenda está llena.");
            return;
        }

        System.out.println("** Creando Contacto **");
        String nombre = "";
        while (nombre.isEmpty()) {
            System.out.print("Ingrese el nombre: ");
            nombre = scanner.nextLine();
        }

        String apellido = "";
        while (apellido.isEmpty()) {
            System.out.print("Ingrese el apellido: ");
            apellido = scanner.nextLine();
        }

        String telefono = "";
        boolean infoTelefono = false;
        while (!infoTelefono) {
            System.out.print("Ingrese el número telefónico: ");
            telefono = scanner.nextLine();
            infoTelefono = verificarEsNumero(telefono);
            if (!infoTelefono) {
                System.out.println("Por favor, ingrese SOLO DÍGITOS.");
            }
        }

        agenda[index] = new Contacto(nombre, apellido, telefono);
        System.out.println("** Contacto guardado **");
        agenda[index].mostrarContacto();
    }

    // Método para buscar una posición libre
    private int buscarPosicionLibre() {
        for (int i = 0; i < capacidad; i++) {
            if (agenda[i] == null) {
                return i;
            }
        }
        return -1; // Agenda llena
    }

    // Método para buscar un contacto
    public void buscarContacto() {
        System.out.print("Ingrese el nombre del contacto a buscar: ");
        String nombre = scanner.nextLine().toUpperCase();
        System.out.print("Ingrese el apellido del contacto a buscar: ");
        String apellido = scanner.nextLine().toUpperCase();

        boolean encontrado = false;
        for (Contacto contacto : agenda) {
            if (contacto != null && contacto.getNombre().equals(nombre) && contacto.getApellido().equals(apellido)) {
                System.out.println("** Contacto encontrado **");
                contacto.mostrarContacto();
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("** Contacto NO encontrado **");
        }
    }

    // Método para mostrar todos los contactos
    public void mostrarTodosContactos() {
        System.out.println("** Contactos **");
        for (int i = 0; i < capacidad; i++) {
            if (agenda[i] != null) {
                System.out.print((i + 1) + ". ");
                agenda[i].mostrarContacto();
            }
        }
    }

    // Método para eliminar un contacto
    public void eliminarContacto() {
        System.out.print("Ingrese el nombre del contacto a eliminar: ");
        String nombre = scanner.nextLine().toUpperCase();
        System.out.print("Ingrese el apellido del contacto a eliminar: ");
        String apellido = scanner.nextLine().toUpperCase();

        boolean encontrado = false;
        for (int i = 0; i < capacidad; i++) {
            if (agenda[i] != null && agenda[i].getNombre().equals(nombre) && agenda[i].getApellido().equals(apellido)) {
                agenda[i] = null;
                System.out.println("** Contacto eliminado **");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("** Contacto NO encontrado **");
        }
    }

    // Método para el menú de la agenda
    public void menuAgenda() {
        int opcion;
        do {
            System.out.println("+===========================+");
            System.out.println("|        MENU AGENDA        |");
            System.out.println("+===========================+");
            System.out.println("| 1. Agregar contacto       |");
            System.out.println("|                           |");
            System.out.println("| 2. Buscar contacto        |");
            System.out.println("|                           |");
            System.out.println("| 3. Mostrar todos los      |");
            System.out.println("|    contactos              |");
            System.out.println("|                           |");
            System.out.println("| 4. Eliminar contacto      |");
            System.out.println("|                           |");
            System.out.println("| 5. Salir                  |");
            System.out.println("|                           |");
            System.out.println("+===========================+");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    agregarContacto();
                    break;
                case 2:
                    buscarContacto();
                    break;
                case 3:
                    mostrarTodosContactos();
                    break;
                case 4:
                    eliminarContacto();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 5);
    }
}
