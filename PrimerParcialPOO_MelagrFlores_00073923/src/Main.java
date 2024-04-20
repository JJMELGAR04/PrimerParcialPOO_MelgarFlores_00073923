import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static ArrayList<DispositivosELectronicos>dispositivos = new ArrayList<DispositivosELectronicos>();
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner sn = new Scanner(System.in);
                imprimirMenu();
                int opcion = sn.nextInt();
                if(opcion == 0){
                    break;
                }
                switch (opcion) {
                    case 1:
                        agregarDispositivo();
                        break;
                    case 2:
                        modificarDispositivo();
                        break;
                    case 3:
                        verListaDispositivos();
                        break;
                    default:
                        System.out.println("Ingrese una opcion valida");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingrese un caracter valido");
            }
        }
        System.out.println("Saliendo...");
    }

    private static void verListaDispositivos() {
        for (int i = 0; i < dispositivos.size(); i++) {
            DispositivosELectronicos temp =  dispositivos.get(i);
            System.out.println("----------------------------------------------------");
            System.out.println("Nombre: " + temp.getNombre());
            System.out.println("Model: " + temp.getModel());
            System.out.println("Descripcion: " + temp.getDescripcion());
            System.out.println("Precio: " + temp.getPrecio());

        }
        System.out.println("-----------------------------------------------------------");
    }

    private static void imprimirMenuAgregar() {
        System.out.println("Tipo de dispositivo a agregar\n" +
                "\t1. Laptop\n" +
                "\t2. Telefono\n" +
                "\t3. TV\n" );
        System.out.println("Ingrese opcion su opcion: ");
    }

    private static void modificarDispositivo() {
        Scanner sn = new Scanner(System.in);
        System.out.println("Escribir nombre del dispositivo: ");
        String nombre = sn.nextLine();

        for (int i = 0; i <dispositivos.size() ; i++) {
            DispositivosELectronicos temp = dispositivos.get(i);
            if (Objects.equals(nombre, temp.getNombre())){
                System.out.println("Escribir nuevo modelo: ");
                String modelo = sn.nextLine();
                temp.setModel(modelo);
            } else {
                System.out.println("No se encontro el dispositivo");
            }
        }
    }

    private static void agregarDispositivo() {
        Scanner sn = new Scanner(System.in);
            try{
                imprimirMenuAgregar();
                int opcion = sn.nextInt();
                sn.nextLine();
                switch (opcion){
                    case 1:
                        System.out.println("Ingrese nombre: ");
                        String nombreLaptop = sn.nextLine();
                        System.out.println("Modelo: ");
                        String modeloLaptop = sn.nextLine();

                        System.out.println("Ingrese descripcion del dispositivo: ");
                        String descripcionLaptop = sn.nextLine();
                        System.out.println("Ingrese Precio del dispositivo $: ");
                        float precioLaptop = sn.nextFloat();
                        sn.nextLine();
                        System.out.println("Capacidad de almacenamiento (GB) :");
                        int memoriaLaptop = sn.nextInt();
                        sn.nextLine();
                        System.out.println("Ingrese el sistema operativo: ");
                        String sistemaOperativoLaptop = sn.nextLine();

                        Laptop laptop = new Laptop(nombreLaptop, modeloLaptop, descripcionLaptop, precioLaptop, memoriaLaptop, sistemaOperativoLaptop);
                        dispositivos.add(laptop);

                        break;
                    case 2:
                        System.out.println("Ingrese nombre: ");
                        String nombreTelefono = sn.nextLine();
                        System.out.println("Modelo: ");
                        String modeloTelefono = sn.nextLine();

                        System.out.println("Ingrese descripcion del dispositivo: ");
                        String descripcionTelefono  = sn.nextLine();
                        System.out.println("Ingrese Precio del dispositivo $ : ");
                        float precioTelefono = sn.nextFloat();
                        sn.nextLine();
                        System.out.println("Capacidad de almacenamiento (GB):");
                        int memoriaTelefono = sn.nextInt();
                        sn.nextLine();
                        System.out.println("Ingrese el tiempo garantia (en anos)");
                        int tiempogarantiaTelefono = sn.nextInt();
                        sn.nextLine();

                        Telefonos telefono = new Telefonos(nombreTelefono, modeloTelefono, descripcionTelefono, precioTelefono, memoriaTelefono, tiempogarantiaTelefono);
                        dispositivos.add(telefono);
                        break;
                    case 3:

                        System.out.println("Ingrese nombre: ");
                        String nombretv = sn.nextLine();
                        System.out.println("Modelo: ");
                        String modelotv = sn.nextLine();

                        System.out.println("Ingrese descripcion del dispositivo: ");
                        String descripciontv = sn.nextLine();
                        System.out.println("Ingrese Precio del dispositivo $: ");
                        float preciotv = sn.nextFloat();
                        sn.nextLine();
                        System.out.println("Capacidad de Tamano del televisor (en pulgadas):");
                        int tamano = sn.nextInt();
                        sn.nextLine();
                        System.out.println("Ingrese el tiempo garantia (en anos)");
                        int tiempogarantiatv = sn.nextInt();
                        sn.nextLine();

                        TV tv = new TV(nombretv, modelotv, descripciontv, preciotv, tamano, tiempogarantiatv);
                        dispositivos.add(tv);
                        break;
                    default:
                        System.out.println("Ingrese una opcion valida");
                        break;
                }

            }catch (InputMismatchException e){
                System.out.println("Ocupe caracteres validos");
            }

    }


    private static void imprimirMenu() {
        System.out.println("Seleccione una opcion:\n" +
                "\t1. Agregar dispositivo\n" +
                "\t2: Modificar dispositivo\n" +
                "\t3. Ver lista de dispositivos\n" +
                "\t0. Salir\n");
        System.out.println("Ingrese opcion: ");
    }
}

