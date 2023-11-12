import java.util.Date;

public class Ficha {
    private String codigo;
    private Date FechaVenta;
    private Cliente cliente;
    private String metodoPago;
    private int precio;
    private Vehiculo vehiculo;
    public Ficha(String codigo, Date fechaVenta, Cliente cliente, String metodoPago, int precio, Vehiculo vehiculo) {
        this.codigo = codigo;
        FechaVenta = fechaVenta;
        this.cliente = cliente;
        this.metodoPago = metodoPago;
        this.precio = precio;
        this.vehiculo = vehiculo;
    }

    public Date getFechaVenta() {
        return FechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        FechaVenta = fechaVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }


}
