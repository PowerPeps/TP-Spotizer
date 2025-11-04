public class Album {
    private String nom;
    private Artiste artiste;
    private String visuel;
    private boolean estCompilation;
    
    public Album(String nom, Artiste artiste, String visuel, boolean estCompilation) {
        this.nom = nom;
        this.artiste = artiste;
        this.visuel = visuel;
        this.estCompilation = estCompilation;
    }
    
    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public Artiste getArtiste() {
        return artiste;
    }
    
    public void setArtiste(Artiste artiste) {
        this.artiste = artiste;
    }
    
    public String getVisuel() {
        return visuel;
    }
    
    public void setVisuel(String visuel) {
        this.visuel = visuel;
    }
    
    public boolean isEstCompilation() {
        return estCompilation;
    }
    
    public void setEstCompilation(boolean estCompilation) {
        this.estCompilation = estCompilation;
    }
}
