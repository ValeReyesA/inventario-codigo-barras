
import java.time.LocalDate;

public class Producto {

    private final String codigo;
    private String nombre;
    private String categoria;
    private double precio;
    private int stock;
    private LocalDate fechaVencimiento;

    public Producto(String codigo, String nombre, String categoria, double precio, int stock, LocalDate fechaVencimiento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
        this.fechaVencimiento = fechaVencimiento;

    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getStock() {
        return stock;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public void agregarStock(int cantidad) {

        if (cantidad <= 0) {
            System.out.println("cantidad invalida");
            return;
        }
        stock += cantidad;
    }

    public void quitarStock(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("cantidad invalida ");
            return;
        }

        if (cantidad <= stock) {
            stock -= cantidad;
        } else {
            System.out.println("stock insuficiente");
        }
        if (stock == 0) {
            System.out.println("realizar pedido");

        }
    }
}
