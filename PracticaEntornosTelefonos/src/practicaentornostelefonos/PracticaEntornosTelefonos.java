package practicaentornostelefonos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Carlos
 *  *  @see <a href="https://view.genially.com/621e9aa9df21310011780bf1"> Link a el genially </a>

 */
public class PracticaEntornosTelefonos {

    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        // Variables
        ArrayList<Telefono> carrito = new ArrayList<>();
        String user = "";
        String contra = "";
        String decision = "";
        boolean ejecucion = true;
        
        System.out.println("Bienvenido a Ti Móvil introduce tu usuario y contraseña");
        while (!user.equals("admin") || !contra.equals("admin")) {
            System.out.println("Introduce un usuario valido");
            user = reader.next();
            System.out.println("introduce una contraseña conrrecta");
            contra = reader.next();
        }
        System.out.println("Estos son los modelos disponibles: escribe el numero de telñefono que quieres añadir al carrito ");
        System.out.println("Si quieres salir pon salir y si quieres terminar de comprar pon fin");
        while (ejecucion) {
            System.out.println("1: pijiphone \n 2: Android \n salir para salir y fin apra comprar los articulos");
            decision = reader.next();
            decision = decision.toLowerCase();
            switch (decision) {
                case "1":
                    carrito.add(comprarPijiphone());
                    break;
                case "2":
                    carrito.add(comprarAndroid());
                    break;
                case "salir":
                    ejecucion = false;
                    break;
                case "fin":
                    comprarCarrito(carrito);
                    ejecucion = false;
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }

    private static Telefono comprarPijiphone() {
        String color = "";
        System.out.println("De que color quieres tu pijiphone");
        color = reader.next();
        return new PiJiphone(color);
    }

    private static Telefono comprarAndroid() {
        String color = "";
        System.out.println("De que color quieres tu Android");
        color = reader.next();
        return new Android(color);
    }

    private static void comprarCarrito(ArrayList<Telefono> carrito) {
        System.out.println("Se van a comprar los articulos de tu carrito (se te enviara un correo dce confirmacion despues de hacer la compra)");
    }

}
