package practicaentornostelefonos;

/**
 *
 * @author Carlos
 */
public class Linterna {

    private boolean encendido;

    /**
     * Cosntructor de linterna por defecto apagada
     */
    public Linterna() {
        this.encendido = false;
    }

    /**
     * metodo encender que pone el atributo encendido a true en al linterna
     */
    public void encender() {
        System.out.println("mucha luz");
        setEncendido(true);
    }

    /**
     * metodo encender que pone el atributo encendido a false en al linterna
     */
    public void apagar() {
        System.out.println("se apaga la luz");
        setEncendido(false);
    }

    public void acoplarLinterna() {
                        
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

}
