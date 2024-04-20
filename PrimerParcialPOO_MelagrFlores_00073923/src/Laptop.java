import java.util.Scanner;

public class Laptop extends DispositivosELectronicos implements Methods{

    private int memoria;
    private String operativeSystem;

    public Laptop() {
    }

    public Laptop(String nombre, String model, String descripcion, float precio, int memoria, String operativeSystem) {
        super(nombre, model, descripcion, precio);
        this.memoria = memoria;
        this.operativeSystem = operativeSystem;
    }

    public Laptop(String nombre, String model, int memoria, String operativeSystem){

    }


    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getOperativeSystem() {
        return operativeSystem;
    }

    public void setOperativeSystem(String operativeSystem) {
        this.operativeSystem = operativeSystem;
    }


    @Override
    public void ObtenerPrecio() {
        Scanner sn = new Scanner(System.in);
        System.out.println("Ingrese Precio de Laptop");
        int precio =  sn.nextInt();
        sn.nextLine();
        setPrecio(precio);

    }

    @Override
    public void Descripcion() {
        Scanner sn = new Scanner(System.in);
        System.out.println("Ingrese Descripcion de Laptop");
        String descripcion =  sn.nextLine();
        setDescripcion(descripcion);
    }
}
