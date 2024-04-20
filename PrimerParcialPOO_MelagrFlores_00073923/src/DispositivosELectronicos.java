public abstract class DispositivosELectronicos {
    private String nombre;
    private String model;
    private String descripcion;
    private float precio;

    public DispositivosELectronicos()
    {}

    public DispositivosELectronicos(String nombre, String model, String descripcion, float precio) {
        this.nombre = nombre;
        this.model = model;
        this.descripcion = descripcion;
        this.precio = precio;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
