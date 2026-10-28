
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner vr = new Scanner(System.in);

        Producto p1 = new Producto("sol-256", "valeria", "utensilios de comida", 15.50, 0, LocalDate.of(2023, 5, 20));
        System.out.println("El stock actual es: " + p1.getStock());
        p1.agregarStock(5);
        System.out.println("El stock actual es: " + p1.getStock());
        p1.quitarStock(100);

        p1.agregarStock(-3);
        p1.quitarStock(0);
        p1.quitarStock(5);

        System.out.println("El stock actual es: " + p1.getStock());

        ArrayList<Producto> productos = new ArrayList<>();

        productos.add(p1);

// System.out.println("el primer producto es" + productos.get(0));
        Producto p2 = new Producto("sol-458", "crema de cabello", "cosmetico", 25.25, 2, LocalDate.of(2026, 9, 1));
        productos.add(p2);
        System.out.println(productos.size());

        for (int i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i).getNombre());
        }
System.out.println("Escribe el nombre de un producto:");
String nombre = vr.nextLine();
System.out.println("Escribiste: " + nombre);
    

    }
}
