    package practicaentornostelefonos;

/**
 *
 * @author Carlos
 * clase android hija de Telefono
 */
public class Android extends Telefono{

    public Android(String color) {
        super(color, 200, "Android");
        
    }

    public void pintar(){
        try {
            ProcessBuilder paint = new ProcessBuilder("mspaint.exe");
            paint.start();
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
        
    }
}
