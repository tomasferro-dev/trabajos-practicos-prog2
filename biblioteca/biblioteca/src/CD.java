public class CD extends Multimedia{
    protected String artista;

    public CD(String titulo, String artista) {
        super(titulo);
        this.artista = artista;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
}
