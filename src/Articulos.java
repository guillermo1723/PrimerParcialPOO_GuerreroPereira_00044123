public abstract class Articulos implements Informaciones{

    protected String nombre;
    protected String modelo;
    protected float precio;

    public Articulos (){

    }

    public Articulos(String nombre, String modelo, float precio) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }



}
