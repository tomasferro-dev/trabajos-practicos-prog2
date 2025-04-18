import java.util.ArrayList;

public class Cine {
    private String nombre;
    private String direccion;
    private ArrayList<Sala> salas;

    public Cine() {
        this.salas = new ArrayList<>();
    }

    public Cine(String nombre) {
        this.nombre = nombre;
        this.salas = new ArrayList<>();
    }

    public Cine(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.salas = new ArrayList<>();
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

    public void agregarSala(Sala s) {
        if (this.salas == null){
            this.salas = new ArrayList<>();
        }
        this.salas.add(s);

    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }

    @Override
    public String toString() {
        return "Cine{" +
                "nombre='" + nombre + '\'' +
                ", salas=" + salas +
                '}';
    }

    public void mostrarSalasPorTipo() {
        for (Sala s : this.salas) {
            if (s instanceof SalaVIP vip) {
                System.out.println("Sala VIP: " + vip.getNumero() + " - Beneficios: " + vip.getBeneficios());
            } else {
                System.out.println("Sala común: " + s.getNumero());
            }
        }
    }
}
