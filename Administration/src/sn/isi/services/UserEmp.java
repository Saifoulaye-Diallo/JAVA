package sn.isi.services;

import sn.isi.entities.User;

import java.util.Scanner;

public class UserEmp implements IUser{
    private Scanner sc = new Scanner(System.in);
    User u = new User();
    @Override
    public User saisie(){
        System.out.println("Entrer l'id");
        u.setId(Integer.parseInt(sc.nextLine()));
        System.out.println("Entrer le nom");
        u.setNom(sc.nextLine());
        System.out.println("Entrer le prenom");
        u.setPrenom(sc.nextLine());
        System.out.println("Entrer l'email");
        u.setEmail(sc.nextLine());
        System.out.println("Entrer le password");
        u.setPassword(sc.nextLine());
        return u;
    }

    @Override
    public void affiche(User u){
        System.out.println("L'id :" +u.getId());
        System.out.println("Le nom :" +u.getNom());
        System.out.println("Le prenom :" +u.getPrenom());
        System.out.println("Le mail :" +u.getEmail());
        System.out.println("Le Mot de passe :" +u.getPassword());
    }
}
