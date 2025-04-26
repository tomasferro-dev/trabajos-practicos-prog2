public class RevistaCientifica extends Revista{

    protected int issn;

    public RevistaCientifica(String titulo, int issn) {
        super(titulo);
        this.issn = issn;
    }

    public int getIssn() {
        return issn;
    }

    public void setIssn(int issn) {
        this.issn = issn;
    }
}
