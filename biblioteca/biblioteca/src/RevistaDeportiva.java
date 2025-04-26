public class RevistaDeportiva extends Revista{

    protected String deporte;
    public RevistaDeportiva(String titulo, String deporte) {
        super(titulo);
        this.deporte = deporte;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }
}
