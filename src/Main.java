
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner vr = new Scanner(System.in);
    ArrayList<Producto> productos = new ArrayList<>();

     int opcion;
     do{
        System.out.println("""
            1. Agregar productos
            2. Ver productos
            3. salir 
            
            """);
            opcion = Integer.parseInt(vr.nextLine());
          

            if (opcion == 1){
                System.out.println("Escribe el codigo del producto:");
                String codigo = vr.nextLine();
                System.out.println("Escribe el nombre del producto:");
                String nombre = vr.nextLine();
                System.out.println("Escribe la categoria del producto:");
                String categoria = vr.nextLine();
                System.out.println("Escribe el precio del producto:");
                double precio = vr.nextDouble();
                vr.nextLine();
                System.out.println("Escribe el stock del producto:");
                int stock = vr.nextInt();
                vr.nextLine();
                System.out.println("Escribe la fecha (año)");
                int anio = vr.nextInt();
                vr.nextLine();
                System.out.println("Escribe la fecha (mes)");
                int mes = vr.nextInt();
                vr.nextLine();
                System.out.println("Escribe la fecha (dia)");
                int dia = vr.nextInt();
                vr.nextLine();


               Producto p1 = new Producto( codigo, nombre, categoria, precio, stock, LocalDate.of(anio,  mes, dia));
    
               productos.add(p1);
               


            } else if (opcion == 2 ){
                  if(productos.isEmpty()){
                    System.out.println("no hya producto registrado");
                  }else {
                for (int i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i).getNombre() + ", " + productos.get(i).getCodigo() + ", " + productos.get(i).getCategoria() + ", " + productos.get(i).getPrecio() + ", " + productos.get(i).getStock() + ", " + productos.get(i).getFechaVencimiento());
            }
        }
            }

     } while (opcion!=3);

       

    }
}
