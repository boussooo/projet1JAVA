package sn.touty.l2gl.app;

import sn.touty.l2gl.model.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("TD2 OK - Java fonctionne");

        Etudiant e1 = new Etudiant("2026-001", "Awa");
        Etudiant e2 = new Etudiant("2026-002");
        e1.afficher();
        e2.afficher();

        sn.touty.l2gl.model.Module m1 = new sn.touty.l2gl.model.Module("JAVA", "Programmation Java", 2.0);
       // sn.touty.l2gl.app.model.Module m2 = new sn.touty.l2gl.app.model.Module("WEB", "Développement Web");

        Note n1 = new Note(e1, m1, 17.5);
        System.out.println(n1);
        System.out.println("Points: " + n1.points());

        System.out.println("BILAN TD2: Etudiants créés: " 
            + Etudiant.getCompteur() 
            + " Dernière note: " + n1.getValeur() 
            + "/20 Points (coeff): " + n1.points());
    }
}
