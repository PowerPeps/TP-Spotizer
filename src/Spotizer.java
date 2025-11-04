import models.*;
import enums.*;

public class Spotizer {
    public static void main(String[] args) {

        Artiste coldplay = new Artiste("Coldplay", "UK");
        Artiste daftPunk = new Artiste("Daft Punk", "France");
        Artiste djRemixer = new Artiste("DJ Remix Master", "USA");
        
        Album parachutes = new Album("Parachutes", coldplay, "parachutes.jpg", false);
        Album discovery = new Album("Discovery", daftPunk, "discovery.jpg", false);
        
        TitreMusicale yellow = new TitreMusicale("Yellow", coldplay, 268, 88, StyleMusique.ROCK);
        yellow.setAlbum(parachutes);
        
        TitreMusicale oneMoreTime = new TitreMusicale("One More Time", daftPunk, 320, 123, StyleMusique.ELECTRONIC);
        oneMoreTime.setAlbum(discovery);
        
        TitreMusicale nouveauTitre = new TitreMusicale("Unreleased Track", coldplay, 245, 95, StyleMusique.POP);
        nouveauTitre.setEnAttentePublication(true);
        
        System.out.println("--- Ajout de titres par les artistes ---");
        System.out.println("Titre ajoute: " + yellow);
        System.out.println("Titre ajoute: " + oneMoreTime);
        System.out.println("Titre en attente: " + nouveauTitre);
        System.out.println();
        
        Remix yellowRemix = new Remix("Yellow (Remix)", djRemixer, yellow, 310, 128);
        System.out.println("Remix cree: " + yellowRemix);
        System.out.println();
        
        System.out.println("--- Creation d'utilisateurs ---");
        Utilisateur alice = new Utilisateur("Alice_Music", "alice@email.com", "Dupont", "Alice");
        alice.setAdresse("123 Rue de la Musique, Paris");
        
        Utilisateur bob = new Utilisateur("Bob_HD", "bob@email.com", "Martin", "Bob");
        bob.setQualitePreferee(QualiteAudio.HD);
        
        System.out.println("Utilisateur cree: " + alice);
        System.out.println("Utilisateur cree: " + bob);
        System.out.println();
        
        System.out.println("--- Ecoutes de titres ---");
        alice.ecouterTitre(yellow);
        System.out.println();
        
        bob.ecouterTitre(oneMoreTime);
        System.out.println();
        
        alice.ecouterTitre(yellowRemix);
        System.out.println();
        
        alice.ecouterTitre(nouveauTitre);
        System.out.println();
        
        System.out.println("--- Creation de playlists ---");
        Playlist maPlaylist = alice.creerPlaylist("Mes favoris");
        maPlaylist.ajouterTitre(yellow);
        maPlaylist.ajouterTitre(oneMoreTime);
        maPlaylist.ajouterTitre(yellowRemix);
        maPlaylist.setEstPublique(true);
        System.out.println(maPlaylist);
        System.out.println();
        
        Playlist chillingPlaylist = bob.creerPlaylist("Chill Vibes");
        chillingPlaylist.ajouterTitre(oneMoreTime);
        System.out.println(chillingPlaylist);
        System.out.println();
        
        System.out.println("=== RECAP ===");
        System.out.println("\n--- Utilisateurs ---");
        System.out.println(alice);
        System.out.println(bob);
        
        System.out.println("\n--- Artistes et revenus ---");
        System.out.println(coldplay);
        System.out.println(daftPunk);
        System.out.println(djRemixer);
    }
}
