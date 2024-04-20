public class Laptop extends Articulos {

    private int tamanioPantalla;
    private String procesadorLaptop;


    public Laptop (){

    }

    public Laptop(String nombre, String modelo, float precio, int tamanioPantalla, String procesadorLaptop) {
        super(nombre, modelo, precio);
        this.tamanioPantalla = tamanioPantalla;
        this.procesadorLaptop = procesadorLaptop;
    }

    public int getTamanioPantalla() {
        return tamanioPantalla;
    }

    public void setTamanioPantalla(int tamanioPantalla) {
        this.tamanioPantalla = tamanioPantalla;
    }

    public String getProcesadorLaptop() {
        return procesadorLaptop;
    }

    public void setProcesador(String procesador) {
        procesadorLaptop = getProcesadorLaptop();
    }

    @Override
    public float obtenerPrecio(float precio) {
        return 0;
    }

    @Override
    public String descripcion(String info) {
        return null;
    }
}
