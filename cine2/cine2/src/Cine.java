import java.util.ArrayList;

public class Cine {
    private String nombre;
    private String direccion;

    private ArrayList<Empleado> empleados;
    private ArrayList<Sala> salas;
    private ArrayList<SalaVip> salasVip;

    public Cine() {
    }

    public Cine(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void agregarEmpleado(Empleado e){
        if (this.empleados == null) {
            this.empleados = new ArrayList<>();
        }
        this.empleados.add(e);
    }

    public void agregarSala(Sala s){
        if (this.salas == null) {
            this.salas = new ArrayList<>();
        }
        this.salas.add(s);
    }

    public void agregarSalaVip(SalaVip s){
        if (this.salasVip == null) {
            this.salasVip = new ArrayList<>();
        }
        this.salasVip.add(s);
    }


}
