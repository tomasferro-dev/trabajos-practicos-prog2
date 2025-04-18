public class Sala {
    private int numero;
    private int capacidad;
    private Cine cine;

    public Sala(int numero, int capacidad, Cine cine) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.cine = cine;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Cine getCine() {
        return cine;
    }

    public void setCine(Cine cine) {
        this.cine = cine;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "numero=" + numero +
                ", capacidad=" + capacidad +
                '}';
    }
}
