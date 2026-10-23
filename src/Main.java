import java.time.LocalDate;

public class Main {
 
    public static void main(String[] args){
      
    
    Producto p1 = new Producto("sol-256", "valeria", "utensilios de comida", 15.50, 0, LocalDate.of(2023, 5, 20));
System.out.println("El stock actual es: " + p1.getStock());    
p1.agregarStock(5);
System.out.println("El stock actual es: " + p1.getStock());
p1.quitarStock(100);

p1.agregarStock(-3);
p1.quitarStock(0);
p1.quitarStock(5);
System.out.println("El stock actual es: " + p1.getStock());
 
}

}