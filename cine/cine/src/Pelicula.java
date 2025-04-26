import java.util.ArrayList;

public class Pelicula {

    private String titulo;
    private Genero genero;
    private ArrayList<Funcion> funciones;

    public Pelicula(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public void agregarFuncion(Funcion f){
        if (this.funciones == null){
            this.funciones = new ArrayList<>();
        }
        this.funciones.add(f);
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", genero=" + genero +
                '}';
    }
}
