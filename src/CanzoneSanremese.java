public class CanzoneSanremese extends Canzone{
    private String edizione;
    private int posizione;
    private String direttore;
    public CanzoneSanremese(String titolo, String artista, String[] autori, int durata, int anno, String edizione, int posizione, String direttore) {
        super(titolo, artista, autori, durata, anno);
        this.edizione = edizione;
        this.posizione = posizione;
        this.direttore = direttore;
    }
    public String getEdizione() {
        return edizione;
    }
    public int getPosizione() {
        return posizione;
    }
    public String getDirettore() {
        return direttore;
    }
}
