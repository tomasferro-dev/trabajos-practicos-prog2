import java.util.Date;

public class Venta {
    private Date fecha;

    public Venta() {
    }

    public Venta(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
