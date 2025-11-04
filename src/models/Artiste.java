package models;

public class Artiste {
    private String nom;
    private String pays;
    private double sommePercue;
    
    public Artiste(String nom, String pays) {
        this.nom = nom;
        this.pays = pays;
        this.sommePercue = 0.0;
    }
    
    public void ajouterRevenus(double montant) {
        this.sommePercue += montant;
    }
    
    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public String getPays() {
        return pays;
    }
    
    public void setPays(String pays) {
        this.pays = pays;
    }
    
    public double getSommePercue() {
        return sommePercue;
    }
    
    @Override
    public String toString() {
        return nom + " (" + pays + ") - Revenus: " + String.format("%.2f", sommePercue) + " EUR";
    }
}
