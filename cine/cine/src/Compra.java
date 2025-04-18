import java.util.Date;

public class Compra {
    private Date fecha;

    public Compra() {
    }

    public Compra(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
