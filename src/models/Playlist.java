package models;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String nom;
    private Utilisateur createur;
    private List<TitreMusicale> titres;
    private boolean estPublique;
    
    public Playlist(String nom, Utilisateur createur) {
        this.nom = nom;
        this.createur = createur;
        this.titres = new ArrayList<>();
        this.estPublique = false;
    }
    
    public void ajouterTitre(TitreMusicale titre) {
        if (!titre.isEnAttentePublication()) {
            titres.add(titre);
            System.out.println("Titre ajoute a la playlist: " + titre.getTitre());
        } else {
            System.out.println("Impossible d'ajouter un titre en attente de publication");
        }
    }
    
    public void retirerTitre(TitreMusicale titre) {
        titres.remove(titre);
    }
    
    public int getDureeTotale() {
        return titres.stream().mapToInt(TitreMusicale::getDureeEnSecondes).sum();
    }
    
    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public Utilisateur getCreateur() {
        return createur;
    }
    
    public List<TitreMusicale> getTitres() {
        return new ArrayList<>(titres);
    }
    
    public boolean isEstPublique() {
        return estPublique;
    }
    
    public void setEstPublique(boolean estPublique) {
        this.estPublique = estPublique;
    }
    
    @Override
    public String toString() {
        return nom + " par " + createur.getPseudo() + " (" + titres.size() + " titres, " + getDureeTotale() + "s)";
    }
}
