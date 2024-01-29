public class Canzone extends ArchivioMusicale {
    private String titolo;
    private String artista;
    private String[] autori;
    private int durata;
    private int anno;
    public Canzone(String titolo, String artista, String[] autori, int durata, int anno) {
        this.titolo = titolo;
        this.artista = artista;
        this.autori = autori;
        this.durata = durata;
        this.anno = anno;
    }
    public String getTitolo() {
        return titolo;
    }
    public String getArtista() {
        return artista;
    }
    public String[] getAutori() {
        return autori;
    }
    public int getDurata() {
        return durata;
    }
    public int getAnno() {
        return anno;
    }
}
