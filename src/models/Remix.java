import enums.StyleMusique;

public class Remix extends TitreMusicale {
    private TitreMusicale titreOriginal;
    
    public Remix(String titre, Artiste artisteRemix, TitreMusicale titreOriginal, int dureeEnSecondes, int tempo) {
        super(titre, artisteRemix, dureeEnSecondes, tempo, titreOriginal.getStyle());
        this.titreOriginal = titreOriginal;
    }
    
    public TitreMusicale getTitreOriginal() {
        return titreOriginal;
    }
    
    public void setTitreOriginal(TitreMusicale titreOriginal) {
        this.titreOriginal = titreOriginal;
    }
    
    @Override
    public String toString() {
        return super.toString() + " [Remix de: " + titreOriginal.getTitre() + "]";
    }
}
