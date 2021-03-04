package sn.isi.services;

import sn.isi.entities.User;

import java.util.Scanner;

public class UserImp implements IUser{
    private Scanner sc = new Scanner(System.in);
    @Override
    public User saisie() {
        User u =new User();
        System.out.println("Entrer l'id");
        u.setId(Integer.parseInt(sc.nextLine()));
        System.out.println("Entrer le Prenom");
        u.setPrenom(sc.nextLine());
        System.out.println("Entrer le Nom");
        u.setNom(sc.nextLine());
        System.out.println("Entrer le Mail");
        u.setMail(sc.nextLine());
        System.out.println("Entrer le Mot de passe");
        u.setPassword(sc.nextLine());
        return u;
    }

    @Override
    public void afficher(User user){
        System.out.println("L'id : "+user.getId());
        System.out.println("Nom : "+user.getNom());
        System.out.println("Prenom : "+user.getPrenom());
        System.out.println("Mail : "+user.getMail());
        System.out.println("Mot de passe : "+user.getPassword());
    }
}
