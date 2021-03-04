package sn.isi.service;

import sn.isi.entities.Consultant;

import java.util.Scanner;

public class ConsultantImp implements IConsultant{
    private Scanner sc = new Scanner(System.in);
    Consultant csl = new Consultant();
    @Override
    public Consultant saisie() {
        System.out.println("Entrer l'id :");
        csl.setId(Integer.parseInt(sc.nextLine()));
        System.out.println("Entrer le nom :");
        csl.setNom(sc.nextLine());
        System.out.println("Entrer le prenom :");
        csl.setPrenom(sc.nextLine());
        System.out.println("Entrer le mail :");
        csl.setMail(sc.nextLine());
        System.out.println("Entrer le mot de passe : ");
        csl.setPassword(sc.nextLine());
        System.out.println("Entrer le taux horraire : ");
        csl.setTauxHorraire(Double.parseDouble(sc.nextLine()));
        System.out.println("Entrer le nombre d'heure : ");
        csl.setNbHeure(Integer.parseInt(sc.nextLine()));
        return csl;
    }

    @Override
    public void affiche(Consultant cst) {
        System.out.println("L'id est : "+cst.getId());
        System.out.println("Le nom est :"+cst.getNom());
        System.out.println("Le prenom est : "+cst.getPrenom());
        System.out.println("Le mail est : "+cst.getMail());
        System.out.println("Le Mot de passe est : "+cst.getPassword());
        System.out.println("Le nombre dheure est : "+cst.getNbHeure());
        System.out.println("Le taux horraire est : "+cst.getTauxHorraire());
    }
}
