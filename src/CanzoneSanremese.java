public class CanzoneSanremese extends Canzone{
    private String edizione;
    private int posizione;
    private String direttore;
    public CanzoneSanremese(String titolo, String artista, int durata, int anno, String edizione, int posizione, String direttore) {
        super(titolo, artista, durata, anno);
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
    @Override
    public String toString() {
        String str=super.toString();
        str = str + "/n[Edizione: " + edizione + ", Posizione: " + ((posizione == 0)?"dato non disponibile":posizione) + ", Direttore: " + direttore + "]";
        return str;
    }
}
