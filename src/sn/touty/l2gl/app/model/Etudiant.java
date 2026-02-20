package sn.touty.l2gl.app.model;

public class Etudiant {
    private String matricule;
    private String nom;
    private static int compteur = 0;

    public Etudiant(String matricule, String nom) {
        if (matricule == null || matricule.isBlank())
            throw new IllegalArgumentException("Matricule invalide");
        if (nom == null || nom.isBlank())
            throw new IllegalArgumentException("Nom invalide");
        this.matricule = matricule;
        this.nom = nom;
        compteur++;
    }

    public Etudiant(String matricule) {
        this(matricule, "Inconnu");
    }

    public String getMatricule() { return matricule; }
    public String getNom() { return nom; }

    public void setNom(String nom) {
        if (nom == null || nom.isBlank())
            throw new IllegalArgumentException("Nom invalide");
        this.nom = nom;
    }

    public void afficher() {
        System.out.println(matricule + " - " + nom);
    }

    public static int getCompteur() { return compteur; }

    @Override
    public String toString() {
        return "Etudiant{matricule=" + matricule + ", nom=" + nom + "}";
    }
}
