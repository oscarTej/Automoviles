public class Cliente {
    public String Dni;
    public String Nombre;
    public String Apellidos;
    public String Direccion;

    public Cliente(String dni, String nombre, String apellidos, String direccion) {
        Dni = dni;
        Nombre = nombre;
        Apellidos = apellidos;
        Direccion = direccion;
    }
    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) {
        Dni = dni;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }



}
