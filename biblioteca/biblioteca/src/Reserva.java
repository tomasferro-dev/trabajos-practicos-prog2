import javax.print.Doc;
import java.util.ArrayList;
import java.util.Date;

public class Reserva {

    private Date fecha;

    private ArrayList<Documento> documentos; // encapsulamiento aplicado

    public Reserva(Date fecha) {
        this.fecha = fecha;
        this.documentos = new ArrayList<>();
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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
        return "Reserva{" +
                "fecha=" + fecha +
                ", documentos=" + documentos +
                '}';
    }
}
