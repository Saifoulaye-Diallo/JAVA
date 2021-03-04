package sn.isi.service;

import sn.isi.entities.Employe;
import sn.isi.entities.Service;

import java.util.Scanner;

public class EmployeImp implements IEmploye {
    private Scanner sca = new Scanner(System.in);
    Employe emp = new Employe();
    @Override
    public Employe saisie() {
        System.out.println("Entrer l'id : ");
        emp.setId(Integer.parseInt(sca.nextLine()));
        System.out.println("Entrer le nom : ");
        emp.setNom(sca.nextLine());
        System.out.println("Entrer le prenom : ");
        emp.setPrenom(sca.nextLine());
        System.out.println("Entrer le mail : ");
        emp.setMail(sca.nextLine());
        System.out.println("Entrer le mot de passe : ");
        emp.setPassword(sca.nextLine());
        Service service = new Service();
        System.out.println("Entrer l'id du service : ");
        service.setId(Integer.parseInt(sca.nextLine()));
        System.out.println("Entrer le nom du service :");
        service.setNom(sca.nextLine());
        emp.setService(service);
        return emp;
    }

    @Override
    public void affiche(Employe emp) {
        System.out.println("LES DONNES DE L'EMPLOYE");
        System.out.println("ID : "+emp.getId());
        System.out.println("Nom : "+emp.getNom());
        System.out.println("Prenom : "+emp.getPrenom());
        System.out.println("Mail : " +emp.getMail());
        System.out.println("Mot de passe : "+emp.getPassword());
        System.out.println("Service : "+emp.getService().getNom());
    }
}
