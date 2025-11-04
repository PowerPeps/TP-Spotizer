package models;

import enums.QualiteAudio;
import java.util.ArrayList;
import java.util.List;

public class Utilisateur {
    private String pseudo;
    private String email;
    private String nom;
    private String prenom;
    private String adresse;
    private double soldeAPayer;
    private QualiteAudio qualitePreferee;
    private List<Playlist> playlists;
    
    public Utilisateur(String pseudo, String email, String nom, String prenom) {
        this.pseudo = pseudo;
        this.email = email;
        this.nom = nom;
        this.prenom = prenom;
        this.soldeAPayer = 0.0;
        this.qualitePreferee = QualiteAudio.STANDARD;
        this.playlists = new ArrayList<>();
    }
    
    public void ecouterTitre(TitreMusicale titre) {
        if (titre.isEnAttentePublication()) {
            System.out.println("Ce titre n'est pas encore disponible a l'ecoute.");
            return;
        }
        
        double cout = titre.calculerCoutEcoute(qualitePreferee);
        double revenus = titre.calculerRevenusArtiste(cout);
        
        this.soldeAPayer += cout;
        titre.getArtiste().ajouterRevenus(revenus);
        
        System.out.println(pseudo + " ecoute: " + titre.getTitre());
        System.out.println("  Cout: " + String.format("%.4f", cout) + " EUR (" + qualitePreferee.getBitrate() + ")");
        System.out.println("  Revenus artiste: " + String.format("%.4f", revenus) + " EUR");
    }
    
    public Playlist creerPlaylist(String nomPlaylist) {
        Playlist playlist = new Playlist(nomPlaylist, this);
        playlists.add(playlist);
        System.out.println("Playlist creee: " + nomPlaylist);
        return playlist;
    }
    
    public String getPseudo() {
        return pseudo;
    }
    
    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public String getPrenom() {
        return prenom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    public String getAdresse() {
        return adresse;
    }
    
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    
    public double getSoldeAPayer() {
        return soldeAPayer;
    }
    
    public QualiteAudio getQualitePreferee() {
        return qualitePreferee;
    }
    
    public void setQualitePreferee(QualiteAudio qualitePreferee) {
        this.qualitePreferee = qualitePreferee;
    }
    
    public List<Playlist> getPlaylists() {
        return new ArrayList<>(playlists);
    }
    
    @Override
    public String toString() {
        return pseudo + " (" + prenom + " " + nom + ") - Solde: " + String.format("%.2f", soldeAPayer) + " EUR";
    }
}
