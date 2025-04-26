import java.util.ArrayList;

public class Sala {
    private int numero;
    private int capacidad;
    private ArrayList<Funcion> funciones;

    public Sala() {
    }

    public Sala(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
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

    public void agregarFuncion(Funcion f){
        if (this.funciones == null) {
            this.funciones = new ArrayList<>();
        }
        this.funciones.add(f);
    }
}
