import enums.StyleMusique;
import enums.QualiteAudio;

public class TitreMusicale {
    private String titre;
    private Artiste artiste;
    private Album album;
    private int dureeEnSecondes;
    private int tempo;
    private StyleMusique style;
    private String visuel;
    private boolean enAttentePublication;
    
    public TitreMusicale(String titre, Artiste artiste, int dureeEnSecondes, int tempo, StyleMusique style) {
        this.titre = titre;
        this.artiste = artiste;
        this.dureeEnSecondes = dureeEnSecondes;
        this.tempo = tempo;
        this.style = style;
        this.enAttentePublication = false;
    }
    
    public double calculerCoutEcoute(QualiteAudio qualite) {
        double nombrePeriodes = Math.ceil(dureeEnSecondes / 300.0);
        return nombrePeriodes * qualite.getTarifPar5Min();
    }
    
    public double calculerRevenusArtiste(double coutTotal) {
        return coutTotal * 0.66;
    }
    
    public String getTitre() {
        return titre;
    }
    
    public void setTitre(String titre) {
        this.titre = titre;
    }
    
    public Artiste getArtiste() {
        return artiste;
    }
    
    public void setArtiste(Artiste artiste) {
        this.artiste = artiste;
    }
    
    public Album getAlbum() {
        return album;
    }
    
    public void setAlbum(Album album) {
        this.album = album;
    }
    
    public int getDureeEnSecondes() {
        return dureeEnSecondes;
    }
    
    public void setDureeEnSecondes(int dureeEnSecondes) {
        this.dureeEnSecondes = dureeEnSecondes;
    }
    
    public int getTempo() {
        return tempo;
    }
    
    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
    
    public StyleMusique getStyle() {
        return style;
    }
    
    public void setStyle(StyleMusique style) {
        this.style = style;
    }
    
    public String getVisuel() {
        return visuel;
    }
    
    public void setVisuel(String visuel) {
        this.visuel = visuel;
    }
    
    public boolean isEnAttentePublication() {
        return enAttentePublication;
    }
    
    public void setEnAttentePublication(boolean enAttentePublication) {
        this.enAttentePublication = enAttentePublication;
    }
    
    @Override
    public String toString() {
        String albumInfo = (album != null) ? " [" + album.getNom() + "]" : "";
        return titre + " - " + artiste.getNom() + albumInfo + " (" + dureeEnSecondes + "s, " + style + ")";
    }
}
