import java.io.InputStream;
import java.util.ArrayList;
import  java.util.Scanner;



public class Main extends Articulos{
    public static void main(String[] args) {

        ArrayList <Laptop> laptopArrayList = new ArrayList<>();
        ArrayList <Telefono> telefonoArrayList = new ArrayList<>();

        int opcion;

        Laptop laptop = new Laptop();
        Telefono telefono = new Telefono();

        Scanner sc = new Scanner(InputStream.nullInputStream());
        do {

            System.out.println("----Menu principal----");
            System.out.println("1--> Agregar articulo de Laptop");
            System.out.println("2--> Agregar articulo de Telefono");
            System.out.println("3--> Mostrar articulo de Telefono");
            System.out.println("4--> Mostrar articulo de Laptop");
            System.out.println("Ingrese la opcion");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("----Informacion laptop----");
                    System.out.println("Ingrese el nombre del la Laptop");
                    laptop.nombre = sc.nextLine();
                    System.out.println("Ingrese el modelo del la Laptop");
                    laptop.modelo = sc.nextLine();
                    System.out.println("Ingrese el precio del la Laptop");
                    laptop.precio = sc.nextFloat();
                    break;

                case 2:
                    System.out.println("----Informacion telefono----");
                    System.out.println("Ingrese el nombre del telefono");
                    telefono.nombre = sc.nextLine();
                    System.out.println("Ingrese el modelo del telefono");
                    telefono.modelo = sc.nextLine();
                    System.out.println("Ingrese el precio del telefono");
                    telefono.precio = sc.nextFloat();
                    break;
                case 3:
                    System.out.println("----mostrando datos de Telefono ----");
                    System.out.println("Nombre: " + telefono.nombre);
                    System.out.println("Modelo: " +telefono.modelo);
                    System.out.println("Precio: " +telefono.precio);
                    break;

                case 4:
                    System.out.println("----mostrando datos de Laptop ----");
                    System.out.println("Nombre: " + laptop.nombre);
                    System.out.println("Modelo: " +laptop.modelo);
                    System.out.println("Precio: " +laptop.precio);
                    break;

                case 5:
                    break;

                case 6:
                    break;
            }

        }while (opcion !=0);


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
