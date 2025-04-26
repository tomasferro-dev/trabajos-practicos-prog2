import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private String correo;

    private ArrayList<Prestamo> prestamos;
    private ArrayList<Reserva> reservas;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void agregarPrestamo(Prestamo prestamo){
        if (this.prestamos==null){
            this.prestamos = new ArrayList<>();
        }
        this.prestamos.add(prestamo);
    }

    public void agregarReserva(Reserva reserva){
        if (this.reservas==null){
            this.reservas = new ArrayList<>();
        }
        this.reservas.add(reserva);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", reservas=" + reservas +
                ", prestamos=" + prestamos +
                '}';
    }
}
