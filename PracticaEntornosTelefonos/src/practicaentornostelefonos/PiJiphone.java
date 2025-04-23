package practicaentornostelefonos;

/**
 *
 * @author Carlos
 * clase pijiphone hija de Telefono
 */
public class PiJiphone extends Telefono {

    public gps gpsPhone;
    
    /**
     * Constructor de pijiphone 
     * @param color 
     */
    public PiJiphone(String color) {
        super(color, 200, "Pijiphone");
        this.gpsPhone = gpsPhone;
    }

    /**
     * Sobrescritura del metodo de llamar
     */
    @Override
    public void llamar(){
        super.llamar();
        System.out.println("Esta llamada ha sido grabada.");
        
    }
    
}
