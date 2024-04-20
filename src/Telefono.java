public class Telefono extends Articulos{


    private String procesadorTelefono;
    private int cantidadNucleos;

    public Telefono (){

    }

    public Telefono(String nombre, String modelo, float precio, String procesadorTelefono, int cantidadNucleos) {
        super(nombre, modelo, precio);
        this.procesadorTelefono = procesadorTelefono;
        this.cantidadNucleos = cantidadNucleos;
    }

    public String getProcesadorTelefono() {
        return procesadorTelefono;
    }

    public void setProcesadorTelefono(String procesadorTelefono) {
        this.procesadorTelefono = procesadorTelefono;
    }

    public int getCantidadNucleos() {
        return cantidadNucleos;
    }

    public void setCantidadNucleos(int cantidadNucleos) {
        this.cantidadNucleos = cantidadNucleos;
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
