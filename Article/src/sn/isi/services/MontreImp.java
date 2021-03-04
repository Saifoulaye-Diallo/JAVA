package sn.isi.services;

import sn.isi.entities.Montre;

import java.util.Scanner;

public class MontreImp implements  IMontre{
    Montre m = new Montre();
    private Scanner sc= new Scanner(System.in);
    @Override
    public Montre saisie() {
        System.out.println("Entrer l'Id : ");
        m.setId(Integer.parseInt(sc.nextLine()));
        System.out.println("Entrer le Libeller : ");
        m.setLib(sc.nextLine());
        System.out.println("Entrer la nature : ");
        m.setNature(sc.nextLine());
        return m;
    }

    @Override
    public void affiche(Montre m) {
        System.out.println("l'ID est : "+m.getId());
        System.out.println("le libelle est : "+m.getLib());
        System.out.println("la nature est : "+m.getNature());

    }
}
