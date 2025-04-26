import java.util.ArrayList;

public class Prestamo implements InterfazDevolucion {
    public boolean devolverLibro(){
        return true;
    };

    private String fechaInicio;
    private String fechaDevolucion;

    private ArrayList<Reserva> reservas;
    private ArrayList<Documento> documentos;

    public Prestamo(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public boolean chequeaReserva(Reserva reserva){
        return true;
    }

    public void agregarReserva (Reserva reserva) {
        if (this.reservas==null){
            this.reservas = new ArrayList<>();
        }
        this.reservas.add(reserva);
    }

    public Documento crearDocumento(String titulo){
        Documento documento = new Documento(titulo);
        documentos.add(documento);
        return documento;
    }

    public void eliminarDocumento(String titulo){
        boolean removed = documentos.removeIf(documento -> documento.getTitulo() == titulo);
        if (removed) {
            System.out.println(titulo + " eliminado correctamente");
        } else {
            System.out.println("No se encontro el documento " + titulo + " para eliminar");
        }
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "fechaInicio='" + fechaInicio + '\'' +
                '}';
    }
}
