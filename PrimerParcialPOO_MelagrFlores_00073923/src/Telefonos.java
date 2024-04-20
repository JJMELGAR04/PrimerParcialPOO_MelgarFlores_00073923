import java.util.Scanner;

public class Telefonos extends DispositivosELectronicos implements Methods{
    private int memoria;
    private int tiempoGarantia;

    public Telefonos() {

    }

    public Telefonos(String nombre, String model, String descripcion, float precio, int memoria, int tiempoGarantia) {
        super(nombre, model, descripcion, precio);
        this.memoria = memoria;
        this.tiempoGarantia = tiempoGarantia;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }


    public int getTiempoGarantia() {
        return tiempoGarantia;
    }

    public void setTiempoGarantia(int tiempoGarantia) {
        this.tiempoGarantia = tiempoGarantia;
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
