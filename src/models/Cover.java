import enums.StyleMusique;

public class Cover extends TitreMusicale {
    private TitreMusicale titreOriginal;
    
    public Cover(String titre, Artiste artisteCover, TitreMusicale titreOriginal, int dureeEnSecondes, int tempo) {
        super(titre, artisteCover, dureeEnSecondes, tempo, titreOriginal.getStyle());
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
        return super.toString() + " [Cover de: " + titreOriginal.getTitre() + "]";
    }
}
