package agenda;

public class Contacto {
    private String nombre;
    private String apellido;
    private String telefono;

    public Contacto(String nombre, String apellido, String telefono) {
        this.nombre = nombre.toUpperCase();
        this.apellido = apellido.toUpperCase();
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void mostrarContacto() {
        System.out.println("Nombre: " + nombre + ", Apellido: " + apellido + ", Teléfono: " + telefono);
    }
}
