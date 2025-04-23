package practicaentornostelefonos;

/**
 *
 * @author Carlos
 * clase madre abstracta telefono
 */
public abstract class Telefono {

    private final String puk;
    private double precio;
    private String color;
    private int bateria;
    private String marca;
    private int llamadas;
    public static int llamadasTotales;
    private Linterna linterna;

    /**
     * Cosntructor de telefono, genera un puk aleatorio
     * @param color
     * @param precio
     * @param marca 
     */
    public Telefono(String color, double precio, String marca) {
        this.puk = (int) Math.floor(Math.random() * 100000000) + "";
        this.color = color;
        this.llamadas = 0;
        linterna = new Linterna();
    }

    public void llamar() {
        System.out.println("Piiiiiii, piiiiiii, ....");
        System.out.println("---| Inicia la conversacion |---");
        esperar((int) Math.floor(Math.random() * 4 + 1));
        System.out.println("pi, pi, pi, pi, pi, pi, ....");
        setLlamadas(getLlamadas() + 1);
        Telefono.setLlamadasTotales(Telefono.getLlamadasTotales() + 1);
    }

    public void esperar(int seg) {
        try {
            Thread.sleep(seg * 1000);
        } catch (Exception e) {
            System.out.println("Error " + e);
        }

    }

    public static int getLlamadasTotales() {
        return llamadasTotales;
    }

    public static void setLlamadasTotales(int llamadasTotales) {
        Telefono.llamadasTotales = llamadasTotales;
    }

    public Linterna getLinterna() {
        return linterna;
    }

    public void setLinterna(Linterna linterna) {
        this.linterna = linterna;
    }

    public int getLlamadas() {
        return llamadas;
    }

    public void setLlamadas(int llamadas) {
        this.llamadas = llamadas;
    }

    public String getPuk() {
        return puk;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
