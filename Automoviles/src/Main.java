import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear clientes
        Cliente cliente1 = new Cliente("123456789", "Juan", "Perez", "Calle A");
        Cliente cliente2 = new Cliente("987654321", "Maria", "Lopez", "Calle B");

        // Crear vehículos
        Vehiculo vehiculo1 = new Vehiculo("Toyota", "ABC123", "Camry", "Rojo", "Gasolina", "V6", "200", null);
        Vehiculo vehiculo2 = new Vehiculo("Honda", "XYZ789", "Civic", "Azul", "Híbrido", "V4", "150", null);

        // Crear fichas
        Ficha ficha1 = new Ficha("F001", new Date(), cliente1, "Efectivo", 25000, vehiculo1);
        Ficha ficha2 = new Ficha("F002", new Date(), cliente2, "Tarjeta", 30000, vehiculo2);

        // Asignar las fichas a los vehículos
        vehiculo1.setFicha(ficha1);
        vehiculo2.setFicha(ficha2);

        // Crear ArrayLists específicos
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        ArrayList<Ficha> fichas = new ArrayList<>();

        // Agregar objetos a los ArrayLists
        clientes.add(cliente1);
        clientes.add(cliente2);

        vehiculos.add(vehiculo1);
        vehiculos.add(vehiculo2);

        fichas.add(ficha1);
        fichas.add(ficha2);

        // Imprimir información de los ArrayLists
        System.out.println("Clientes:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente.toString());
        }

        System.out.println("\nVehículos:");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.toString());
        }

        System.out.println("\nFichas:");
        for (Ficha ficha : fichas) {
            System.out.println(ficha.toString());
        }
    }
}
/**
 * lo primero que he elaborado ha sido el diseño del diagrama de clases creando los objertos que necesitamos con sus atributos
 * despues he descrito las clases en el intelije y creado los contructores para elaborar el main
 * he creado el main con 2 ejemplos imitando una venta real
 *Con los bucles se muestra N veces los objetos enteros de tipo String (los imprime por pantalla) nos  muestra el objeto con sus atributos correspondientes de tipo String
 * */