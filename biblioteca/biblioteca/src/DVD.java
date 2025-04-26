public class DVD extends Multimedia{

    protected int duracion;

    public DVD(String titulo, int duracion) {
        super(titulo);
        this.duracion = duracion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
