public class TV extends DispositivosELectronicos implements Methods{

    private int tamano;
    private int tiempoGarantia;

    public TV() {

    }

    public TV(String nombre, String model, String descripcion, float precio, int tamano, int tiempoGarantia) {
        super(nombre, model, descripcion, precio);
        this.tamano = tamano;
        this.tiempoGarantia = tiempoGarantia;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getTiempoGarantia() {
        return tiempoGarantia;
    }

    public void setTiempoGarantia(int tiempoGarantia) {
        this.tiempoGarantia = tiempoGarantia;
    }

    @Override
    public void ObtenerPrecio() {
        getPrecio();
    }

    @Override
    public void Descripcion() {
        getDescripcion();
    }
}
