import java.util.Arrays;

public class Canzone extends ArchivioMusicale {
    private String titolo;
    private String artista;
    private int durata;
    private int anno;
    public Canzone(String titolo, String artista, int durata, int anno) {
        this.titolo = titolo;
        this.artista = artista;
        this.durata = durata;
        this.anno = anno;
    }
    public String getTitolo() {
        return titolo;
    }
    public String getArtista() {
        return artista;
    }
    public int getDurata() {
        return durata;
    }
    public int getAnno() {
        return anno;
    }
    @Override
    public String toString() {
        return "Canzone [Titolo: " + titolo + ", Artista: " + artista + "Durata: " + durata + ", Anno: " + anno + "]";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Canzone other = (Canzone) obj;
        if (!this.artista.equals(other.artista))
            return false;
        if (!this.titolo.equals(other.titolo))
            return false;
        return true;
    }


}
